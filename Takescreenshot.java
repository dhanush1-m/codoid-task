package selenium;

public class Takescreenshot {
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;

	public class ScreenShotExample {

	    public static void main(String[] args) {

	        // Set the path to the chromedriver executable
	        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

	        // Launch the Chrome browser
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the webpage you want to take a screenshot of
	        driver.get("https://www.codoid.com");

	        // Take a screenshot of the entire webpage
	        Takescreenshot ts=(Takescreenshot)driver:
		File dst=ts.getscreenshotAs(outputtype.file):    

	        File dst= new File("./screenshot/image.png");
                File utils.copy(screenshot,dst);
	        // Close the browser
	        driver.quit();
	    }
	}

	
	
	
	
}
