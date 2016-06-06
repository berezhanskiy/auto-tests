package pages;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import junit.framework.Assert;


public class MainPage {

public static WebDriver driver = new FirefoxDriver();
public static String logoTextTR = "TopReviews";
public static String siteUsaUrl = "http://topreviews.best/";
public static String siteUkUrl = "http://uk.topreviews.best/";
public static String emptySearchUrl = "http://topreviews.best/search?search=";
public static String reviewName = "Laptop Desk";
public static String BestPicksButtonPath = "/html/body/div[1]/div/div[2]/div[1]/a";
public static String BestPicksItemPath = "/html/body/div[1]/div/div[2]/div[1]/div/a[1]";
public static List <String> BestPicksValues = Arrays.asList("Kitchen Appliances", "Electronics & Computers",
		"Home & Garden", "Automotive & Car Care", "Household & Pets", "Toys, Kids & Baby", 
		"Sports & Outdoors", "Beauty, Health & Lifestyle", "Home Improvement & Tools",
		"Hobbies & Leisure", "Games, Music & Movies");
public static List <String> firstItemContainerPathes = Arrays.asList("/html/body/div[3]/div/div[1]", "/html/body/div[3]/div/div[1]/a",
		"/html/body/div[3]/div/div[1]/a/div[1]/div[1]", "/html/body/div[3]/div/div[1]/a/div[3]");
public static List <String> secondItemContainerPathes = Arrays.asList("/html/body/div[3]/div/div[2]", "/html/body/div[3]/div/div[2]/a",
		"/html/body/div[3]/div/div[2]/a[1]/div", "/html/body/div[3]/div/div[2]/a/div[3]");
public static List<String> thirdItemContainerPathes = Arrays.asList("/html/body/div[3]/div/div[3]", "/html/body/div[3]/div/div[3]/a",
		"/html/body/div[3]/div/div[3]/a/div[1]/div", "/html/body/div[3]/div/div[3]/a/div[3]");

public static String[][] NewRewviewBlockpathes = new String [6][3];

public static String[] SiteInfoPathes = new String[4];



@BeforeTest
public static void setingUp()throws Exception {
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    
	}


@Test
	public void test()throws Exception {
	 
// 1.SITE LOGO CHECKS
// 1.1 Check that logo is displayed
	driver.get(siteUsaUrl); 
	WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div/a"));
	boolean iselementpresent = logo.isDisplayed();
		if(iselementpresent){
		  System.out.println("logo is present\n");}
	
//1.2 Check that logo text is TopReview
	   
	assertEquals(logoTextTR, logo.getText());
	  
// 1.3 Check that logo has link on main page
	logo.click();
	assertEquals(siteUsaUrl,driver.getCurrentUrl());
	
// 2. SITE SERCH CHECKS
// 2.1 Check that search field is present
	   
	WebElement searchFieldSite = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/form/input"));
	boolean iselementenebled = searchFieldSite.isEnabled();
		if(iselementenebled){
		   System.out.println("search fild is enebled\n");}
	   
// 2.2 Find review by name
    searchOnSite(reviewName);
	driver.findElement(By.linkText("Best Laptop Desks"));
	checkCountry();
	   
// 2.3 Search non existing review
	   
	 searchOnSite("Jekos-kokos");
	   if(isElementPresentByName("Jekos-Kokos")){
		   System.out.println("oh no, Jeka on the site\n");
	   }
	   else{
		   System.out.println("all ok\n");
	   }
	   checkCountry();
	   
// 2.4 Search via special symbols
	   searchOnSite("?>()*&");
	   System.out.println("spec symblos is ok\n");
	   checkCountry();
	   
// 2.5 Search via button (empty search)
	   searchButtonOnSite();
	   if(isElementPresentByClass("item")){
		   System.out.println("all ok\n");
	   }
	   else {
		   System.out.println("somesing wrong\n");
	   }
	   
// 2.6 Check drop-down list in search 
	   //(DOESNT WORK)checkDropDownSearch("lap");

// 3. CHECKS FOR BEST PICKS
	   checkBestPicks();
	   moveOnBestPicks();
	   driver.get(siteUsaUrl);
//	4. CHECKS FOR PROMO BOX
//  4.1 Checks that three tabs of first container are uploaded with all elements
	   isPreviewElementsPresents(firstItemContainerPathes);
	   isPreviewElementsPresents(secondItemContainerPathes);
	   isPreviewElementsPresents(secondItemContainerPathes);
//  4.2 Checks that titles of preview are not empty and check move on links to review to compare titles, country
	   FirstContainerElementsWork(firstItemContainerPathes);
	   FirstContainerElementsWork(secondItemContainerPathes);
	   FirstContainerElementsWork(thirdItemContainerPathes);


//  5. CHECKS FOR NEW REVIEWS PREVIEW
//  5.1 Checks that 6 tabs of first container are uploaded with all elements
	    initPathesForSecondContainer(NewRewviewBlockpathes);
		isSecondContainerElementsPresents(NewRewviewBlockpathes);
		SecondContainerElementsWork(NewRewviewBlockpathes);
	   
//  6. CHECKS FOR FOOTER
//  6.1 Checks Site info (About, Contact Us)
//  6.2 Checks Site Legal Information (Privacy police, Terms&Conditions)	   
	
	   
//  7. OTHER CHECKS  
	   
}
	   
	
// method for searching reviews on site by search field

public void searchOnSite(String str){
	WebElement searchFieldSite;
	searchFieldSite	= driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/form/input"));
	searchFieldSite.sendKeys(str);
	searchFieldSite.submit();
	}

// method for working with search button 'lupa'

public void searchButtonOnSite(){
	WebElement searchButtonSite;
	searchButtonSite = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/form/button"));
	searchButtonSite.click();
	System.out.println(driver.getCurrentUrl());
	String ch = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]")).getText();
	System.out.println(ch);
	}
	
// method for determine that searched by name element present or not

public boolean isElementPresentByName(String elName)
{
	try{
		driver.findElement(By.linkText(elName));
		return true;
	}
	catch(NoSuchElementException e){
		return false;
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

// method for determine that searched by class element present or not 

public boolean isElementPresentByClass(String classNameSearch)
{
	try{
		driver.findElement(By.className(classNameSearch));
		return true;
	}
	catch(NoSuchElementException e){
		return false;
	}
}

// method for recognize in witch country you are 

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

// method for open and save all names of the BestPicks items
// and compare expected list and actual list

public static void checkBestPicks()
{
	WebElement bestPicksButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/a"));
	bestPicksButton.click();
	List <WebElement> bestPicksElements = bestPicksButton.findElements(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div"));
	for(int i = 0; i<bestPicksElements.size(); i++){
		if(bestPicksElements.get(i).getText()== BestPicksValues.get(i))
		{	
		System.out.println(bestPicksElements.get(i).getText());
		System.out.println("\n");
		}
		else {
			System.out.println(bestPicksElements.get(i).getText()+"doesn't match with file \n");
		}
	}
	
}

//method for step by step picks and move on each item of BestPicks dropdown menu

public static void moveOnBestPicks() throws InterruptedException
{
	WebElement bestPicksButton;
	WebElement bestPicksItem;
	for(int i = 1; i<12; i++){
	    bestPicksButton = driver.findElement(By.xpath(BestPicksButtonPath));
	    bestPicksButton.click();
	    BestPicksItemPath =  String.format("/html/body/div[1]/div/div[2]/div[1]/div/a[%d]",i);
	    bestPicksItem = driver.findElement(By.xpath(BestPicksItemPath));
	    bestPicksItem.click();
	    System.out.println("yoy are - " + driver.findElement(By.xpath("/html/body/div[3]/div/div[1]")).getText());
	    checkCountry();
	   
		}
}


// method for  check element presents into preview
public static void isPreviewElementsPresents(List <String> previewElementsPathes){
	boolean elementsIsPresen = true;
	for(int i = 0; i<previewElementsPathes.size(); i++){
		elementsIsPresen = isElementPresentByXpath(previewElementsPathes.get(i));
		if(elementsIsPresen){
			System.out.println(i+"th element of first container item is present");
			}
		else{
			System.out.println(i+"th element of the first container item is ebsent");
		}
	}
	
}


// method for work-checks with preview elements
public static void FirstContainerElementsWork(List <String> str){
	String previewTitleText = driver.findElement(By.xpath(str.get(2))).getText();
	previewTitleText = previewTitleText.concat(" 2016");
	System.out.println(previewTitleText);
	driver.findElement(By.xpath(str.get(0))).click();
	if(driver.getTitle().substring(18, driver.getTitle().length()).equalsIgnoreCase(previewTitleText)){
		System.out.println("all ok");
	}
	else{
		System.out.println("titles is wrong");
	}
	checkCountry();
	driver.navigate().back();
}
	
// method for init mass with pathes to elements preview of the "New review" block(second container)
public static void initPathesForSecondContainer(String[][] previewElementsPathes){
	int x=1;
	for (int i = 0; i<6; i++){
		x=x+i;
		previewElementsPathes[i][0] = String.format("/html/body/div[4]/div/div[2]/div[%d]",x);
		System.out.println(previewElementsPathes[i][0]);
		x=1;
	}
	
	for (int i = 0; i<6; i++){
		x=x+i;
		previewElementsPathes[i][1] = String.format("/html/body/div[4]/div/div[2]/div[%d]/a/div[1]/div", x);
		System.out.println(previewElementsPathes[i][1]);
		x=1;
	}
	
	for (int i = 0; i<6; i++){
		x=x+i;
		previewElementsPathes[i][2] = String.format("/html/body/div[4]/div/div[2]/div[%d]/a/div[3]", x);
		System.out.println(previewElementsPathes[i][2]);
		x=1;
	}
}

//method for check - are elements preview of the "New reviews" block(second container) present or not 
public static void isSecondContainerElementsPresents(String[][] previewElementsPathes){
	boolean elementsIsPresen = true;
	for(int i = 0; i<6; i++){
		for(int j=0; j<2; j++){
			elementsIsPresen = isElementPresentByXpath(previewElementsPathes[i][j]);
			if(elementsIsPresen){
				System.out.println(i+"th element of first container item is present");
				}
			else{
				System.out.println(i+"th element of the first container item is ebsent");
			}	
		}
		
	}
	
}

// method for check-work preview elements of the "New reviews" bloc(second container)
public static void SecondContainerElementsWork(String [][] previewElementPathes){
	WebElement previewItem;
	String previewTitleText = "";
	String previewImgUrl = "";
	for (int i = 0; i<6; i++){
		for(int j = 2; j>=0; j--){
			
		if(j==2){
			previewImgUrl = driver.findElement(By.xpath(previewElementPathes[i][j])).getAttribute("style");
			System.out.println("img url: "+previewImgUrl+" and empty or not: "+previewImgUrl.isEmpty());}
		if(j==1){
			previewTitleText = driver.findElement(By.xpath(previewElementPathes[i][j])).getText();
			previewTitleText = previewTitleText.concat(" 2016");
			System.out.println(previewTitleText);
		}
		if(j==0){
			previewItem = driver.findElement(By.xpath(previewElementPathes[i][j]));
			previewItem.click();
			System.out.println("item title text: "+previewTitleText);
			System.out.println("review title text: "+driver.getTitle());
			if(driver.getTitle().substring(18, driver.getTitle().length()).equalsIgnoreCase(previewTitleText)){
				System.out.println("all ok");
			}
			else{
				System.out.println("titles is wrong");
			}
			checkCountry();
			driver.navigate().back();
			}
		
		
		}
	}


}	//method TEST end


// Quit from driver after class executed
@AfterClass
public static void testEnd(){
	driver.quit();
}


} //class end