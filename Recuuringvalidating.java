package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recuuringvalidating {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Replace with your driver path
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the webpage
            driver.get("https://www.fitpeo.com");
            driver.manage().window().maximize();
            System.out.println("Website loaded!");

            //  Navigate to the Revenue Calculator page
            WebElement revenueCalculatorLink = driver.findElement(By.linkText("Revenue Calculator"));
            revenueCalculatorLink.click();
            Thread.sleep(3000);

            //  Scroll to the Reimbursement section
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            WebElement reimbursementField = driver.findElement(By.id("reimbursementField")); // Replace with actual ID or locator
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", reimbursementField);
            System.out.println("Scrolled to Reimbursement section!");

            // Perform necessary actions (adjust slider or enter values)
            WebElement slider = driver.findElement(By.cssSelector("input[type='range']")); // Adjust locator
            WebElement inputField = driver.findElement(By.cssSelector("input[type='number']")); // Adjust locator
            inputField.clear();
            inputField.sendKeys("560");
            System.out.println("Updated inputs!");

            //  Retrieve displayed TRR value
            String displayedTRR = reimbursementField.getText();
            System.out.println("Displayed TRR: " + displayedTRR);

            //  Perform expected calculation (replace with actual logic)
            int sliderValue = 560; // Example: replace with actual dynamic input
            int expectedTRR = sliderValue * 10; // Replace with the correct formula
            System.out.println("Expected TRR: " + expectedTRR);

            //  Validate the value
            if (String.valueOf(expectedTRR).equals(displayedTRR)) {
                System.out.println("Validation successful! Displayed TRR matches the expected value.");
            } else {
                System.out.println("Validation failed! Displayed TRR: " + displayedTRR + ", Expected TRR: " + expectedTRR);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}

	
