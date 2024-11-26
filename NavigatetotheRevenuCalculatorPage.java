package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatetotheRevenuCalculatorPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fitpeo.com/revenue-calculator");
		System.out.println("page title is: " + driver.getTitle());
		
		WebElement revenueCalculator = driver.findElement(By.xpath("//h2[contains(text(), 'Revenue Calculator')]"));

        
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", revenueCalculator);

     
        System.out.println("Scrolled to Revenue Calculator Slider!");

     
        
	}
}


