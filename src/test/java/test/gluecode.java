package test;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class gluecode {
	public WebDriver driver;
	public Properties pro;
	public Scenario s;
	private CreateInstance cin;
	
@Before
  public void method1(Scenario x) throws Exception
  {
	this.s=x;
    pro = new Properties();
    String path = System.getProperty("user.dir");
    FileInputStream fip = new FileInputStream(path + "\\src\\test\\java\\test\\Properties.properties");
    pro.load(fip);
    //String path = System.getProperty("user.dir");
    String driverpath = path + "\\src\\test\\java\\driver\\chromedriver_win32 (1)\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver",driverpath );   
    ChromeOptions options = new ChromeOptions();
    options.addArguments("start-maximized"); // open Browser in maximized mode
    options.addArguments("disable-infobars"); // disabling infobars
    options.addArguments("--disable-extensions"); // disabling extensions
    options.addArguments("--disable-gpu"); // applicable to windows os only
    options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
    options.addArguments("--no-sandbox"); // Bypass OS security model
    //WebDriver driver = new ChromeDriver(options);
    driver = new ChromeDriver(options);
    //lp = new Loginpage(driver);
   
    driver.manage().window().maximize();
    cin = new CreateInstance();
    
    /*this.s=x;
		pro = new Properties();
		FileInputStream fip = new FileInputStream("D:\\TestAutomation\\CompetencyModule\\src\\test\\java\\test\\Properties.properties");
		pro.load(fip);
		String path = System.getProperty("user.dir");
		String driverpath = path + "\\src\\test\\java\\chromedriver\\chromedriver_win32 (5)\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath );	
		driver = new ChromeDriver();
		//lp = new Loginpage(driver);
		
		driver.manage().window().maximize();
		cin = new CreateInstance();*/
	
}


@Given("^launch the browser$")
public void launch_current_site() throws Exception
{
	driver.get("https://www.amazon.in");
}

@When ("^homepage is displays$")
public void home_page()
{
	cin.GetAmazonHomepageInstance(driver);
}

}
