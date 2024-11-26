package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateRevenueCalculatorPage {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fitpeo.com/revenue-calculator");
		
		System.out.println("Page title is: " + driver.getTitle());

	}

}
