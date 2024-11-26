package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click560 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fitpeo.com/revenue-calculator");
		//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		//jsExecutor.executeScript("window.scrollBy(0,300)");
		
		Actions actions = new Actions(driver);

		// Perform a Page Down action
		actions.sendKeys(Keys.PAGE_DOWN).perform();

		driver.findElement(By.xpath("//input[@id=':R57alklff9da:']")).sendKeys("569");
		
		System.out.println("Page title is: " + driver.getTitle());
	}

}
