package mainPageLoad;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyMainPage {
	//

	public static	WebDriver driver = new FirefoxDriver();
	static WebDriverWait wait = new WebDriverWait(driver, 20);
	StopWatch pageLoad = new StopWatch();
	static String pingdomUrl = "https://tools.pingdom.com/";
	static String TRUrl = "http://topreviews.best/";
	
	@Test
	public void test() throws InterruptedException {
		
		//PageLoadWithSW("http://topreviews.best/");
		//PageLoadWithSys("http://topreviews.best/");
		PageLoadWith3rd(pingdomUrl,TRUrl);
		driver.close();
		
	}

public static void PageLoadWithSW(String url){
	StopWatch pageLoad = new StopWatch();
	pageLoad.start();
	driver.get(url);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/footer/div[2]/div")));
	pageLoad.stop();
	long pageLoadTime_ms = pageLoad.getTime();
    long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
    System.out.println("Total Page Load Time: " + pageLoadTime_ms + " milliseconds");
    System.out.println("Total Page Load Time: " + pageLoadTime_Seconds + " seconds");
}

public static void PageLoadWithSys(String url){
	long start = System.currentTimeMillis();
	driver.get(url);
	driver.findElement(By.xpath("/html/body/footer/div[2]/div"));
	long total = System.currentTimeMillis()- start;
	System.out.println(total);
}
	
public static void PageLoadWith3rd(String url, String urlTR) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "D:\\work\\auto_tests\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driverC = new ChromeDriver();
	driverC.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	driverC.get(url);
	WebElement fild  = driverC.findElement(By.id("urlinput"));
	fild.sendKeys(urlTR);
	fild.submit();
	Thread.sleep(10000);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#content > div.section.section-test-data.rbc-summary > div.rbc-summary-group > div.rbc-summary-item.rbc-summary-loadtime > div.rbc-summary-info-value")));
	System.out.println(driverC.findElement(By.cssSelector("#content > div.section.section-test-data.rbc-summary > div.rbc-summary-group > div.rbc-summary-item.rbc-summary-loadtime > div.rbc-summary-info-value")).getText());
	
}

}
