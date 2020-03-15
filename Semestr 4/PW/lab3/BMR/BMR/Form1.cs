using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Diagnostics;
namespace BMR
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            if ((textBox1.Text != "") && (textBox2.Text != "") && (textBox3.Text !=""))
            {

                double wzrost = Convert.ToDouble(textBox1.Text);
                Debug.WriteLine(wzrost);
                double waga = Convert.ToDouble(textBox2.Text);
                Debug.WriteLine(waga);
                double wiek = Convert.ToDouble(textBox3.Text);
                Debug.WriteLine(wiek);

                double BMR;

               if (radioButton1.Checked)
                {
                     BMR = (9.99 * waga)+(6.25 * wzrost)-(4.92 * wiek+5); 
                    wynik.Text = BMR.ToString();
                    wynik.ForeColor = Color.Black;
                }
                else
                {
                    BMR = (9.99 * waga) + (6.25 * wzrost) - (4.92 * wiek - 161);
                    wynik.Text = BMR.ToString();
                    wynik.ForeColor = Color.Black;
                }

                

               
            }
            else
            {
                wynik.ForeColor = Color.Red;
                wynik.Text = "Brak Danych!";
            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void Clear_Click(object sender, EventArgs e)
        {
            textBox1.Clear();
            textBox2.Clear();
            textBox3.Clear();
           

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
 }

