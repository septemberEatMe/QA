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
using OpenQA.Selenium;

namespace FirsrtSeleniumApp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
          
        }
        private void Form1_Load(object sender, EventArgs e)
        {
        
        }

        private void button1_Click(object sender, EventArgs e)
        {
            IWebDriver webDriver = new OpenQA.Selenium.Chrome.ChromeDriver();
            webDriver.Manage().Window.Maximize();
            webDriver.Navigate().GoToUrl("http://www.vk.com");

            IWebElement inputName = webDriver.FindElement(By.Id("index_email"));
            inputName.SendKeys("");
            IWebElement inputPass = webDriver.FindElement(By.Id("index_email"));
            inputPass.SendKeys("");
        }

    } 
}
