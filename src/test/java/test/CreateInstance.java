package test;

import org.openqa.selenium.WebDriver;

import pages.AmazonHomepage;

public class CreateInstance {
	
	CreateInstance(){}
	private AmazonHomepage ah;
	
	public  AmazonHomepage GetAmazonHomepageInstance(WebDriver driver) {		
		if(ah == null)
			return ah = new AmazonHomepage(driver);
		else
			return ah;
	}

}
