using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml;

namespace WFAtest
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnCriarXML_Click(object sender, EventArgs e)
        {
            try
            {
                XmlTextWriter writer = new XmlTextWriter(@"C:\Users\ouza\Documents\Bin\filmes.xml", null);

                //inicia o documento xml
                writer.WriteStartDocument();
                //escreve o elmento raiz
                writer.WriteStartElement("filmes");
                //Escreve os sub-elementos
                writer.WriteElementString("titulo", "Cada & Companhia");
                writer.WriteElementString("titulo", "007 contra Godzila");
                writer.WriteElementString("titulo", "O segredo do Dr. Haus's");
                // encerra o elemento raiz
                writer.WriteEndElement();
                //Escreve o XML para o arquivo e fecha o objeto escritor
                writer.Close();
                MessageBox.Show("Arquivo XML gerado com sucesso.");
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
    }
}
