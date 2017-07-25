using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;


namespace testezone
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        string sourceFile;
        string destinationFile = @"C:\Users\souza\Documents\txt11.txt";

        FileInfo fi = new FileInfo(sourceFile.ToString());

        private void btnCP(object sender, EventArgs e)
        {


            File.Copy(sourceFile, destinationFile);
          
   

        }

        private void txtinput_TextChanged(object sender, EventArgs e)
        {
            sourceFile = txtinput.Text;
           
        }
    }
}
