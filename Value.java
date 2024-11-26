package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Value {
	 public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Replace with your driver path
	        WebDriver driver = new ChromeDriver();

	        try {
	            //  Navigate to the Revenue Calculator page
	            driver.get("https://fitpeo.com/revenue-calculator");
	            driver.manage().window().maximize();
	            System.out.println("Revenue Calculator page loaded!");

	            // Locate the header displaying Total Recurring Reimbursement
	            WebElement headerElement = driver.findElement(By.xpath("//h2[contains(text(), 'Total Recurring Reimbursement for all Patients Per Month:')]"));

	            //  Retrieve the text of the header
	            String headerText = headerElement.getText();
	            System.out.println("Header Text Found: " + headerText);

	            // Validate the value
	            if (headerText.contains("$110700")) {
	                System.out.println("Validation successful! The header value is correct.");
	            } else {
	                System.out.println("Validation failed! The header value does not match.");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}


