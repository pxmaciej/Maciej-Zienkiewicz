using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PESEL
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

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            label1.Text = "PESEL:";
            String  tmp = textBox1.Text;
            char[] pesels = tmp.ToCharArray();
            int[] wt = { 1,3,7,9,1,3,7,9,1,3 };
            int[] tmp2 = new int[11];
            int sum = 0;
            int lastNum = 0;
            int controlNum = 0;



            for (int i = 0; i < 11; i++)
            {
                tmp2[i] = int.Parse(pesels[i].ToString());
                label1.Text += pesels[i].ToString();
            }

                for (int i = 0; i < 10; i++)
            {
                sum += (tmp2[i])*(wt[i]);
            }


            lastNum = sum % 10;
            controlNum = 10 - lastNum;
            if (controlNum != tmp2[10])
            {
               label2.Text = "Wrong";
            }
            else
            {
               label2.Text = "Correct";
            }  

        }
    }
    }

