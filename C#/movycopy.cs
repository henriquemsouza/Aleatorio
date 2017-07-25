using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
//https://www.youtube.com/watch?v=PxHaHt2OuTo
namespace WindowsFormsApplication1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            OpenFileDialog ofd = new OpenFileDialog();
            ofd.ShowDialog();
            String filename = ofd.FileName;

            try
            {
                System.IO.File.Delete(filename);
            }
            catch (Exception ex)
            {

                MessageBox.Show(ex.Message.ToString());
                MessageBox.Show("select file "+filename+" deleted");
            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
