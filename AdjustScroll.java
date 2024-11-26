package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdjustScroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fitpeo.com/revenue-calculator");
		System.out.println("page title is: " + driver.getTitle());
		
		WebElement revenueCalculator = driver.findElement(By.xpath("//div[@class='satoshi MuiBox-root css-r3xbt7'"));

        
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", revenueCalculator);
        System.out.println("Scrolled to the slider section!");

        //  Locate the slider
        WebElement slider = driver.findElement(By.xpath("input[@id=':R57alklff9da:']")); // Adjust locator as needed
        //"input[@id=':R57alklff9da:']"
        //  Highlight the slider in red using JavaScript
        jsExecutor.executeScript("arguments[0].style.border='2px solid red';", slider);

        // Step 6: Adjust the slider to set value to 820
        Actions action = new Actions(driver);
        action.clickAndHold(slider).moveByOffset(200, 0).release().perform(); // Adjust offset based on slider sensitivity
        System.out.println("Slider moved!");

        // Wait for the value to update
        Thread.sleep(2000);

        //  Verify the bottom text field is updated to 820
        WebElement textField = driver.findElement(By.id("bottomTextField")); // Adjust locator based on the field's HTML ID or other attributes
        String updatedValue = textField.getAttribute("value");
        
        if ("820".equals(updatedValue)) {
            System.out.println("Success! Slider value updated to 820.");
        } else {
            System.out.println("Failed! Slider value is: " + updatedValue);
        }

    } 
	}


