package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

    public static void main(String[] args) {

        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "./chromedriver");

        // Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage with the dropdown
        driver.get("https://www.foundit.in/");

        // Locate the dropdown element
        WebElement dropdown = driver.findElement(By.className("search-item-inner"));

        // Create a new Select object
        Select select = new Select(dropdown);

        // Select multiple options from the dropdown by index, value, or visible text
        select.selectByIndex(0);
        select.selectByVisibleText("2 years");

        // Deselect all options
        select.deselectAll();

        // Close the browser
        driver.quit();
    }
}
