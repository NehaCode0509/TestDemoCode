package com.DEW.DEWAutomationSuite.atdd.Testpage1;

import org.openqa.selenium.By;
import org.openqa.selenium.UnsupportedCommandException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Homelogin {

	
	// @FindBy(id="email")WebElement login;
	// @FindBy(id="pass")WebElement password;
	// @FindBy(xpath="//*[@name='login']")WebElement LoginButton;
	// @FindBy(how = How.XPATH ,using = "//*[@name='login']")
	// private WebElement password1;
	 
	/*@FindBy(how = How.ID ,using = "email")
	 private WebElement login;
	 
	 @FindBy(how = How.ID ,using = "pass")
	 private WebElement password;
	 
	 @FindBy(how = How.ID ,using = "//*[@name='login']")
	 private WebElement LoginButton; */
	
	
	 
	 WebDriver driver;

	 
	 public Homelogin( ) {
		 
			 PageFactory.initElements(driver, this);
		 }
	 

public void LoginApp() throws Exception
{

try {
	  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document doc = builder.parse("src/test/resources/readXMLdata.xml");
      doc.getDocumentElement().normalize();
      String username = doc.getElementsByTagName("username").item(0).getTextContent();
      String password1 = doc.getElementsByTagName("password").item(0).getTextContent();
      WebElement login = driver.findElement(By.id("email"));
      WebElement password = driver.findElement(By.id("pass"));
      WebElement LoginButton = driver.findElement(By.xpath("//*[@name='login']"));
      login.sendKeys(username);
	  password.sendKeys(password1);
	  LoginButton.click();
}
catch (Exception e) {
    e.printStackTrace();
}
}

public void LaunchAppUrl() throws Exception
{

try {
	  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document doc = builder.parse("src/test/resources/readXMLdata.xml");
      doc.getDocumentElement().normalize();
      String AppURL = doc.getElementsByTagName("appUrl").item(0).getTextContent();
      System.out.println(AppURL);
      
     // WebDriverManager.chromedriver().setup();
      System.setProperty("webdriver.chrome.driver", "C:/Users/suren/Documents/DEW AutomationSuite/DEWAutomationSuite/chromedriver.exe");
      ChromeOptions options = new ChromeOptions();
     // options.setExperimentalOption("w3c", true);
     // WebDriver driver = new ChromeDriver(options);
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get(AppURL);
      
}
catch (Exception e) {
    e.printStackTrace();
}
}


	public void Login_Home_page() throws Exception
	{
	 System.out.println("success");
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.Facebook.com");
	}
	
	public void LoginSuccessful()throws Exception
	{
		System.out.println("Success");
	}
	
	
}


