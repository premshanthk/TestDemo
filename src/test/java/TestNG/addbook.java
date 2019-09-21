package TestNG;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addbook {
	 WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://35.184.205.62:32769/addressbook/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Test
	public void verifyaddbook()  {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("Testing");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("Selenium");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("9176424827");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("premshanthk@gmail.com");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("03/02/1987");
		driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
		
	}

@AfterMethod
public void close() {

	//driver.close();
}	
}