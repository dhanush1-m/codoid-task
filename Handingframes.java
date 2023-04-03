package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframes {

    public static void main(String[] args) {

        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "./chromedriver");
        // Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        // Navigate to the webpage with the frame
        driver.get("https://www.codoid.com");
        // Switch to the frame by ID or name
        driver.switchTo().frame("0");
        // Or switch to the frame by index
        driver.switchTo().frame(0);
        WebElement elementInsideFrame = driver.findElement(By.id("elementIdInsideFrame"));
        elementInsideFrame.click();

        driver.switchTo().defaultContent();

        // Close the browser
        driver.quit();
    }
}

