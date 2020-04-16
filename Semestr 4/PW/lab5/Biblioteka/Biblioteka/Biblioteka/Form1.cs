using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using MySql.Data.MySqlClient;

namespace Biblioteka
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        public string connectionString = "datasource=127.0.0.1;port=3306;username=root;password=;database=biblioteka3;";
        private void button3_Click(object sender, EventArgs e)
        { 
            string query = "SELECT * FROM ksiazki";
            MySqlConnection databaseConnection = new MySqlConnection(connectionString);
            MySqlCommand commandDatabase = new MySqlCommand(query, databaseConnection);
            commandDatabase.CommandTimeout = 60;
            DataTable data = new DataTable();

            try
            {

                databaseConnection.Open();
                MySqlDataAdapter adapter = new MySqlDataAdapter(commandDatabase);
                adapter.Fill(data);
                dataGridView1.DataSource = data;

            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {

            string query = "INSERT INTO  ksiazki(tytul, gatunek, oprawa, isbn, naklad, wypozyczenia) VALUES ('" + textBox1.Text + "','" + textBox2.Text + "','" +textBox3.Text + "','" + int.Parse(textBox4.Text) + "','" + int.Parse(textBox5.Text) + "',false)";
            MySqlConnection databaseConnection = new MySqlConnection(connectionString);
            MySqlCommand commandDatabase = new MySqlCommand(query, databaseConnection);
            commandDatabase.CommandTimeout = 60;

            try
            {
                databaseConnection.Open();
                commandDatabase.ExecuteScalar();

            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {   
            string query = "UPDATE ksiazki SET wypozyczenia=true, nazwisko=@nazwisko WHERE id=@id";
            MySqlConnection databaseConnection = new MySqlConnection(connectionString);
            MySqlCommand commandDatabase = new MySqlCommand(query, databaseConnection);
            commandDatabase.CommandTimeout = 60;
            commandDatabase.Parameters.AddWithValue("@nazwisko", textBox8.Text.ToString());  
            commandDatabase.Parameters.AddWithValue("@id", Convert.ToInt32(dataGridView1.SelectedRows[0].Cells[0].Value.ToString()));
           
            if (dataGridView1.SelectedRows[0].Cells[6].Value.ToString() != "true")
            {

                try
                {
                    databaseConnection.Open();
                    commandDatabase.ExecuteScalar();

                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
            }
            else
            {
                MessageBox.Show("Książka jest już wypożyczona");

            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
           string query = "UPDATE ksiazki SET wypozyczenia=false, nazwisko=@nazwisko WHERE id=@id";
            MySqlConnection databaseConnection = new MySqlConnection(connectionString);
            MySqlCommand commandDatabase = new MySqlCommand(query, databaseConnection);
            commandDatabase.CommandTimeout = 60;
            string tmp = " ";
            commandDatabase.Parameters.AddWithValue("@nazwisko", tmp);
            commandDatabase.Parameters.AddWithValue("@id", Convert.ToInt32(dataGridView1.SelectedRows[0].Cells[0].Value.ToString()));

                try
                {
                    databaseConnection.Open();
                    commandDatabase.ExecuteScalar();

                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
         }       
    }
}
