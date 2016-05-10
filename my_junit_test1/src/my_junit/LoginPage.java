package my_junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage {
	
	static WebDriver driver = new FirefoxDriver();
	
	@Before
	public void SetUp() throws InterruptedException
	{
		driver.get("http://admin.topfolder.net");
		Thread.sleep(5000);
		
	}
	
	@After
	public void AfterSet()
	{
		driver.findElement(By.xpath("/html/body/header/div[2]/div[2]/span/a")).click();   //log-out from admin
		driver.quit();
	}
	
	@Test
	//login on the admin panel
	public void LogIn() throws InterruptedException{
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/form/fieldset/section[1]/div/input")).sendKeys("d@d.com");   //login
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/form/fieldset/section[2]/div/input")).sendKeys("12345");     //password
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/form/footer/button")).click();  //submit
	Thread.sleep(1000);
	String MainUrl = driver.getCurrentUrl();  //ger currency url
 
	
	}
}
