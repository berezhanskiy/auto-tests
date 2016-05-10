package tack_create;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddProducts {
  
	String login;
	String Password;
	
	@Test
	public void test() {
		fail("Not yet implemented");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("http://admin.topfolder.net/");
	
	WebElement TaskIn;  //button for taking task in work
	TaskIn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/div/div/table/tbody/tr/td[2]/a"));
	
	WebElement OpenCategoryList;  //opening the list of category
	OpenCategoryList = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/div[1]/p/a"));
	
	WebElement CategoryPick;    //pick the category electronik
	CategoryPick = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/div[2]/div/div/div[2]/div/div/ul/li[4]/table/tbody/tr/td[1]/a"));
	
	WebElement AddCategory;  //add category(button "+")
	AddCategory = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/div[2]/div/div/div[2]/div/div/ul/li[4]/ul/li[3]/table/tbody/tr/td[3]/a"));
	
	
	WebElement ShowProducts; //button for displaying 5 products
	ShowProducts = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/fieldset/div/div/div/div/div/div[1]/button[1]"));
	
	
	//FIRST PRODUCT
	WebElement SelectFirstProduct; // select first of the product from category
	SelectFirstProduct = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/fieldset/div/div/div/div/div/div[2]/table/tbody/tr/td[2]/div/span/span[1]/span"));
	
	WebElement ActivateFirstProductCheck; //check-box for activate First product
	ActivateFirstProductCheck = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/fieldset/div/div/div/div/div/div[2]/table/tbody/tr/td[1]/div/label/input"));
	
	WebElement LinkFirstFild; //fild for input first product link
	LinkFirstFild = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/fieldset/div/div/div/div/div/div[2]/table/tbody/tr/td[4]/div/input"));
	
	
	//SECOND PRODUCT
	WebElement SelectSecondProduct; // select first of the product from category
	SelectSecondProduct = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/fieldset/div/div/div/div/div/div[3]/table/tbody/tr/td[2]/div/span/span[1]/span"));
	
	WebElement ActivateSecondProductCheck; //check-box for activate First product
	ActivateSecondProductCheck = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/fieldset/div/div/div/div/div/div[3]/table/tbody/tr/td[1]/div/label/input"));
	
	WebElement LinkSecondFild; //fild for input first product link
	LinkSecondFild = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/fieldset/div/div/div/div/div/div[3]/table/tbody/tr/td[4]/div/input"));
	
	
	//THIRD PRODUCT
	WebElement SelectThirdProduct; // select first of the product from category
	SelectThirdProduct = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/fieldset/div/div/div/div/div/div[4]/table/tbody/tr/td[2]/div/span/span[1]/span"));
	
	WebElement ActivateThirdProductCheck; //check-box for activate First product
	ActivateThirdProductCheck = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/fieldset/div/div/div/div/div/div[4]/table/tbody/tr/td[1]/div/label/input"));
	
	WebElement LinkThirdFild; //fild for input first product link
	LinkThirdFild = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/fieldset/div/div/div/div/div/div[4]/table/tbody/tr/td[4]/div/input"));
	
	
	//FOURTH PRODUCT
	WebElement SelectFourthProduct; // select first of the product from category
	SelectFourthProduct = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/fieldset/div/div/div/div/div/div[5]/table/tbody/tr/td[2]/div/span/span[1]/span"));
	
	WebElement ActivateFourthProductCheck; //check-box for activate First product
	ActivateFourthProductCheck = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/fieldset/div/div/div/div/div/div[5]/table/tbody/tr/td[1]/div/label/input"));
	
	WebElement LinkFourthFild; //fild for input first product link
	LinkFourthFild = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/fieldset/div/div/div/div/div/div[5]/table/tbody/tr/td[4]/div/input"));
	
	
	//FIFTH PRODUCT
	WebElement SelectFifthProduct; // select first of the product from category
	SelectFifthProduct = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/fieldset/div/div/div/div/div/div[6]/table/tbody/tr/td[2]/div/span/span[1]/span"));
	
	WebElement ActivateFifthProductCheck; //check-box for activate First product
	ActivateFifthProductCheck = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/fieldset/div/div/div/div/div/div[6]/table/tbody/tr/td[1]/div/label/input"));
	
	WebElement LinkFifthFild; //fild for input first product link
	LinkFifthFild = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/fieldset/div/div/div/div/div/div[6]/table/tbody/tr/td[4]/div/input"));
	
	
	
	
	WebElement SaveProducts; //button for saving you result
	SaveProducts = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/article/div/div/div[1]/form/footer/button"));
	
	
	
	
	
	}

}
