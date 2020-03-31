using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Logowanie
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            String[] login = new string[2] {"user","user2" };  
            String[] password = new string[2] {"user","user2" };
            Form2 f = new Form2(); 
            String log = textBox1.Text; 
            String pass = textBox2.Text; 

            foreach (string tmplog in login ){
             
                if (log == tmplog)
                {
                    foreach (string tmppass in password) 
                    {
                        if (pass == tmppass) 
                        {
                            f.Show();
                        }
                    }
                }

            }
        }
    }
}
