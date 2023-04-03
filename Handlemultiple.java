package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class Handlemultiple {
    public static void main(String[] args) throws InterruptedException {
        // Create a new Chrome driver instance
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        // Click a link that opens a new window
        WebElement link = driver.findElement(By.linkText("Gmail"));
        link.click();
        // Wait for the new window to appear
        Thread.sleep(2000);

        // Switch to the new window
        Set<String> windowHandles = driver.getWindowHandles();
        String secondWindowHandle = null;
        for (String handle : windowHandles) {
            if (!handle.equals(driver.getWindowHandle())) {
                secondWindowHandle = handle;
            }
        }
        driver.switchTo().window(secondWindowHandle);
        // Navigate to a page in the new window
        driver.get("https://mail.google.com");
        // Switch back to the first window
        driver.switchTo().window(driver.getWindowHandles().iterator().next());
        // Close the first window
        driver.close();
        // Switch back to the second window
        driver.switchTo().window(secondWindowHandle);
        // Do some stuff in the second window
        driver.findElement(By.id("identifierId")).sendKeys("danush@gmail.com");
        // Close the second window
        driver.close();
        // Quit the driver
        driver.quit();
    }
}

