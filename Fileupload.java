package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

    public static void main(String[] args) {

        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "./chromedriver");

        // Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage with the file upload input
        driver.get("https://www.foundit.in/");

       driver.findElement(By.className("heroSection-buttonContainer_secondaryBtn secondaryBtn")).click() 
       
       // Locate the file upload input element
        WebElement fileInput = driver.findElement(By.id("file-upload"));

        // Enter the file path into the file upload input element using sendKeys() method
        fileInput.sendKeys("./files/resume.pdf");

        // Submit the form or click the upload button
        WebElement submitButton = driver.findElement(By.id("pop_upload"));
        submitButton.click();

        // Close the browser
        driver.quit();
    }
}

