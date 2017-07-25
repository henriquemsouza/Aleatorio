using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml;
using System.Xml.Linq;

namespace xml_teste
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
           //Cria arquivo XML se  nao existir
            if (!File.Exists(@"C:\Users\souza\Documents\Bin\profile.xml"))
            {
            
                XElement users =new XElement("users" );
                users.Save(@"C:\Users\souza\Documents\Bin\profile.xml");
                MessageBox.Show("XML File Created");

            }
          
        }
     //Insere informação
        private void btn_input_Click(object sender, EventArgs e)
        {
            XmlTextWriter writer = new XmlTextWriter(@"C:\Users\souza\Documents\Bin\profile.xml", null);
            writer.WriteStartDocument();
            //escreve o elmento raiz
            writer.WriteStartElement("filmes");
            //Escreve os sub-elementos
            writer.WriteElementString("titulo", "Narutinho");

            // encerra o elemento raiz
            writer.WriteEndElement();
            //Escreve o XML para o arquivo e fecha o objeto escritor
            writer.Close();
        }
//recupera e exibi
        private void label1_Click(object sender, EventArgs e)
        {
            string userFileXml = (@"C:\Users\souza\Documents\Bin\profile.xml");
            XmlDocument xml = new XmlDocument();
            xml.Load(userFileXml);
            XmlNode root = xml.SelectSingleNode("filmes");
            foreach (XmlElement element in xml.GetElementsByTagName("titulo"))
            {
                label1.Text = element.InnerText;
            }
        }
    }
}
