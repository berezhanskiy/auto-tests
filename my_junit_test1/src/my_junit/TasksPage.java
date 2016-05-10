package my_junit;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TasksPage {
	
	LoginPage l = new LoginPage();
	
	                                         

	
	
	

	
	@After                //log-out from server
	public void Quit(){
		driver.findElement(By.xpath("/html/body/header/div[2]/div[2]/span/a")).click();   //log-out from admin
		driver.quit();
	}
	
	
	
	@Test
	public void CheckRow() throws InterruptedException {
	l.SetUp();
	l.LogIn();
	

		
		
	
	}

}
