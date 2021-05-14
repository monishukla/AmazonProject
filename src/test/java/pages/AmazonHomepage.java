package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomepage {
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	public AmazonHomepage(WebDriver x)
	{
		this.driver=x;
		PageFactory.initElements(driver,this);
		wait = new WebDriverWait(driver,60);
	}
	
	public void homepage()
	{
		driver.getTitle();
	}
	

}
