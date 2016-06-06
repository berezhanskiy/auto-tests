package pages;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class TryToFuck {
	
	public static WebDriver driver = new FirefoxDriver();

public static List <String> firstItemContainerPathes = Arrays.asList("/html/body/div[3]/div/div[1]", "/html/body/div[3]/div/div[1]/a",
			"/html/body/div[3]/div/div[1]/a/div[1]/div[1]", "/html/body/div[3]/div/div[1]/a/div[3]");
public static List <String> secondItemContainerPathes = Arrays.asList("/html/body/div[3]/div/div[2]", "/html/body/div[3]/div/div[2]/a",
			"/html/body/div[3]/div/div[2]/a[1]/div", "/html/body/div[3]/div/div[2]/a/div[3]");
public static List<String> thirdItemContainerPathes = Arrays.asList("/html/body/div[3]/div/div[3]", "/html/body/div[3]/div/div[3]/a",
			"/html/body/div[3]/div/div[3]/a/div[1]/div", "/html/body/div[3]/div/div[3]/a/div[3]");

public static String[][] pathes = new String [6][3];
public static String[] siteInfoPathes;

@BeforeTest
public static void setingUp()throws Exception {	
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    
	}
			




	@Test
	public void test() {
		siteInfoPathes[0] = "/html/body/footer/div[1]/ul/li[2]/ul/li[1]";
	    siteInfoPathes[1] = "/html/body/footer/div[1]/ul/li[2]/ul/li[2]/a";
	    siteInfoPathes[2] = "/html/body/footer/div[1]/ul/li[2]/ul/li[3]/a";
	    siteInfoPathes[3] = "/html/body/footer/div[1]/ul/li[3]/ul/li[1]";
	    siteInfoPathes[4] = "/html/body/footer/div[1]/ul/li[3]/ul/li[2]/a";
	    siteInfoPathes[5] = "/html/body/footer/div[1]/ul/li[3]/ul/li[3]/a";
		driver.get("http://topreviews.best/");
		isSiteInfoElementsPresent(siteInfoPathes);
		SiteInfoElementsCheck(siteInfoPathes);	
		
}
	public static String checkCountry(){
		String country; 
			if(driver.getCurrentUrl().substring(7, 9)== "uk."){
				country = "UK";
				System.out.println("you are in the "+country);
				}
			else {
				country = "US";
				System.out.println("you are in the "+country);
				}
		
		return country;
	} 
	
	
public static void SiteInfoElementsCheck(String[] info){
	for(int i=0; i<6; i++){
		if(i==0 | i==3){
		System.out.println("title is "+driver.findElement(By.xpath(info[i])).getText().isEmpty());
		}
		else{
			driver.findElement(By.xpath(info[i])).click();
			checkCountry();
			driver.navigate().back();
			
		}
	}
	
}
	
	
	
public static void isSiteInfoElementsPresent(String[] info){
	for(int i=0; i<6; i++){
		if(isElementPresentByXpath(info[i])){
			System.out.println("element is present "+i);
		}
		else{
			System.out.println("element is empty "+i);
		}
	}
}
	
//method for determine that searched by xpath element present or not
public static boolean isElementPresentByXpath(String elXpath)
{
	try{
		driver.findElement(By.xpath(elXpath));
		return true;
	}
	catch(NoSuchElementException e){
		return false;
	}
}


}


