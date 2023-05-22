package seleniumscript;

import java.time.Duration;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class seleniumprog   {
	public static void main( String []args)throws InterruptedException{
	WebDriver driver= new ChromeDriver();
	System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\JMS\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver1= new ChromeDriver();
	driver1.get("https://www.amazon.in");	
	driver1.manage().window().maximize();
	driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
    driver1.findElement(By.xpath(" //div[@aria-label='₹30,000 – ₹40,000']" )).click();
	 driver1.findElement(By.id("nav-search-submit-button" )).click();
	 driver1.findElement(By.linkText("Lenovo IdeaPad Slim 3 Intel Core i3-1115G4 11th Gen 15.6\" (39.62cm) FHD Laptop (8GB/256GB SSD/Win 11/Office 2021/2 Year Warranty/3 Month Game Pass/Platinum Grey/1.7Kg), 81X800LCIN")).click();
		
	
	 Set<String> s = driver1.getWindowHandles();
	 ArrayList ar = new ArrayList(s);
	 System.out.println(ar.get(0));
	 System.out.println(ar.get(1));
	 
	 driver1.switchTo().window((String)ar.get(1));
	 
	driver1.findElement(By.id("add-to-cart-button")).click();
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	 driver1.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
	}
	 }