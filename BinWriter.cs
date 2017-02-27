using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Diagnostics;//lib to use Proces
using System.IO;//to use Binary Writer

namespace TestZone
{
    public partial class Main : Form
    {
        public Main()
        {
            InitializeComponent();
        }

        string path;
        //button to  open file .txt to write
        private void btn1_Click(object sender, EventArgs e)
        {
            OpenFileDialog ofd = new OpenFileDialog();
            if (ofd.ShowDialog()==DialogResult.OK)
            {
                btn2.Enabled = true;
                path = ofd.FileName;
            }
        }
        //button to write
        private void btn2_Click(object sender, EventArgs e)
        {
            
            BinaryWriter bw = new BinaryWriter(File.OpenWrite(path));
            int myShort = 0x00350;
            byte[] buffer = BitConverter.GetBytes(myShort);
            Array.Reverse(buffer);
            bw.Write(buffer);
            bw.Dispose();
        }
    }
}
