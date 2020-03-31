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
            String[] login = new string[2] {"user","user2" };    //pojemnik na login
            String[] password = new string[2] {"user","user2" }; //pojemnik na haslo
            Form2 f = new Form2(); //instanacja klasy form2 zamiast "f" napisz inna nazwe
            String log = textBox1.Text; //pojemnij ktory przechowuje to co user wpisal jako login
            String pass = textBox2.Text; //pojemnik ktory przechowuje to co user wpisal jako haslo

            foreach (string tmplog in login ){ //tutaj zamiast forech wstaw petle for(int i=0; i<=1; i++)
                // log == login[i];
                if (log == tmplog)
                {
                    foreach (string tmppass in password) //tutaj zamiast forech wstaw petle for (int i = 0; i <= 1; i++)
                    {
                        if (pass == tmppass) // tego ifa zachowaj jest dobrze
                        {
                            f.Show();// zamiast f napisz nazwe ta co zmieniles wyzej
                        }
                    }
                }

            }
        }
    }
}
