package seleniumx;



	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class alert {


	    public static void main(String[] args) throws InterruptedException {
	       
	        System.setProperty("webdriver.chrome.driver", "./chromedriver");

	        WebDriver driver = new ChromeDriver();
	       
	        driver.get("https://www.example.com");	       
	        driver.findElement(By.id("button")).click();
	        Alert alert = driver.switchTo().alert();
	        alert.accept(); 
	        driver.findElement(By.id("button")).click();
	        alert = driver.switchTo().alert();
	        alert.dismiss();
	        driver.quit();
	    }
	}

