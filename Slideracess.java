package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slideracess {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fitpeo.com/revenue-calculator");
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("MuiSlider-track css-10opxo5")).sendKeys("560");
	}

}
