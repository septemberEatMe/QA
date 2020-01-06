using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;
using OpenQA.Selenium;

namespace FirsrtSeleniumApp
{
    public partial class Form1 : Form
    {
        IWebDriver webDriver;
        string name = null;
        string pass = null;
        string url = "http://wwww.rozetka.com.ua";

        public Form1()
        {
            InitializeComponent();
          
        }
        private void Form1_Load(object sender, EventArgs e)
        {
        
        }

        private void button1_Click(object sender, EventArgs e)
        {
            webDriver = new OpenQA.Selenium.Chrome.ChromeDriver();
            webDriver.Manage().Window.Maximize();
            webDriver.Navigate().GoToUrl(url);

            IWebElement whiskey = webDriver.FindElement(By.Name("search"));
            whiskey.SendKeys("Chivas Regal" + OpenQA.Selenium.Keys.Enter);

            Thread.Sleep(1000);

            IWebElement chivas12 = webDriver.FindElement(By.Id("image_item4698680"));
            Thread.Sleep(4000);
            chivas12.Click();

            IWebElement findButtonLink = webDriver.FindElement(By.ClassName("detail-buy-btn-wrap"));
            Thread.Sleep(4000);
            findButtonLink.Click();

            //IWebElement searchInput = webDriver.FindElement(By.Name("q"));
            //searchInput.SendKeys(name + pass  + OpenQA.Selenium.Keys.Enter);
            //webDriver.Close();

        }

        private void button2_Click(object sender, EventArgs e)
        {
            webDriver.Close();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            using(StreamReader reader = new StreamReader("d:/name.txt"))
            {
                name = reader.ReadLine();
                pass = reader.ReadLine();
            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    } 
}
