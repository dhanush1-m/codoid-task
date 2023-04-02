package seleniumx;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.util.List;

	public class findelements {

	    public static void main(String[] args) {
	        
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        
	        WebDriver driver = new ChromeDriver();
	       
	        driver.get("https://www.amazon.com");
	        
	        List<WebElement> elements = driver.findElements(By.xpath("//a"));
	       
	        for (WebElement element : elements) {
	            System.out.println(element.getText());
	        }
	    
	        driver.quit();
	    }
	}


