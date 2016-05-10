package tack_create;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Product_work {

	WebDriver driver = new FirefoxDriver();
	
	@Test
	public void test() {
		fail("Not yet implemented");
		
		
		
		WebElement TakeToWork; //button for taking review in work  		
		TakeToWork = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/form/footer/button"));
		
		WebElement SetReviewName;   //button for set up review name
		SetReviewName = driver.findElement(By.xpath("/html/body/main/div[1]/div/div/h1/div/button"));
		
		WebElement ApplReviewName;   //button in pop-over for apply seat review name
		ApplReviewName = driver.findElement(By.xpath("/html/body/main/div[1]/div/div/h1/div/div/div[4]/button[2]"));
		
		WebElement FildReviewName;   //field for input review name
		FildReviewName = driver.findElement(By.xpath("/html/body/main/div[1]/div/div/h1/div/div/div[3]/div/form/div/input"));
		
		WebElement SetPreambula;    //button for set up review's preambula
		SetPreambula = driver.findElement(By.xpath("/html/body/main/div[1]/div/div/div[3]/div[2]/button"));
		
		WebElement FildReviewPreambula; //field for input review's preambula
		FildReviewPreambula = driver.findElement(By.className("mce-content-body"));
		
		WebElement ApplyReviewPreambula;  //button in pop-over for apply seat review preambula
		ApplyReviewPreambula = driver.findElement(By.xpath("/html/body/main/div[1]/div/div/div[3]/div[2]/div/form/div/div/div[3]/button[2]"));
		
		WebElement SetReviewWII;  //open text area for input What Is It info
		SetReviewWII = driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[2]/div[2]/button"));
		
		WebElement ApplyReviewWII;  //button for apply changes in WII text area
		ApplyReviewWII = driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[2]/div[2]/div/form/div/div/div[3]/button[2]"));
		
		WebElement SerReviewWTLF;  //open text area for input Whats To Look For
		SerReviewWTLF = driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[4]/div[2]/button"));
		
		WebElement ApplyReviewWTLF; //button for apply changes in WTLF text area
		ApplyReviewWTLF = driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[4]/div[2]/div/form/div/div/div[3]/button[2]"));
		
		WebElement AddProductValue;  //button for add new value to the product
		AddProductValue = driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[2]/div[2]/a"));
		
	    WebElement SetValueName;    //open text area for input name of value
	    SetValueName = driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/button"));
	    
	    WebElement FildValueName;  //field for input value name
	    FildValueName = driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div[3]/div/form/div/input"));
	    
	    WebElement ApplyValueName;   //button for apply value name
	    ApplyValueName = driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div[4]/button[2]"));
	    
	    WebElement SetValueDescription;  //open text area for input description of value
	    SetValueDescription = driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[2]/div[2]/div/div[3]/div[2]/button"));
	    
	    WebElement FildValueDescription;  //field for input description of value
	    FildValueDescription = driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[2]/div[2]/div/div[3]/div[2]/div/form/div/div/div[2]"));
	    
	    WebElement ApplyValueDescription;  //button for apply description of value
	    ApplyValueDescription = driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[2]/div[2]/div/div[3]/div[2]/div/form/div/div/div[3]/button[2]"));
	    
	    WebElement ButtonPublish;  //button for publish the review
	    ButtonPublish =driver.findElement(By.xpath("/html/body/div[7]/a"));
	    
	    }

}
