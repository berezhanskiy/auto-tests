package tack_create;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class J_create {
	WebDriver driver = new FirefoxDriver();
	
	String TaskName = "first_aout_task";
	
	@Test
	public void test() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://admin.topfolder.net/");
		//login page
		WebElement UserLoginEdit;  //fild for input user login
		UserLoginEdit = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/form/fieldset/section[1]/div/input"));
		UserLoginEdit.click();
		UserLoginEdit.sendKeys("d@d.com");
		
		WebElement UserPassEdit;  //fild for input user password
		UserPassEdit = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/form/fieldset/section[2]/div/input"));
		UserPassEdit.click();
		UserPassEdit.sendKeys("12345");
		
		WebElement LogInButton;   //button for submit user login
		LogInButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/form/footer/button"));
		LogInButton.click();
		
		//task-create
		WebElement TaskCreateButton;    //button for create task
		TaskCreateButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div/div[2]/a"));
		TaskCreateButton.click();
		
		WebElement TaskNameFild;
		TaskNameFild = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div/form/div[1]/input"));   
		TaskNameFild.click();
		TaskNameFild.sendKeys(TaskName);

		WebElement TaskCreateSubmitButton;
		TaskCreateSubmitButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div/form/div[11]/button"));
		TaskCreateSubmitButton.click();
		
		
		
		
	}

}
