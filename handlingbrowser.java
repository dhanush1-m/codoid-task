package seleniumx;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingbrowser {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./chrome/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			Thread.sleep(2000);
		   driver.get("https://demoqa.com/browser-windows");
		   Thread.sleep(2000);
		   driver.findElement(By.id("windowButton")).click();
		   String p = driver.getWindowHandle();
		   Set<String> pc = driver.getWindowHandles();
		   int o = pc.size();  
		   System.out.println(o);
		   pc.remove(p);
		   int f = pc.size();
		   System.out.println(f);
		   
	          for(String b:pc){
	          driver.switchTo().window(b);
	          Thread.sleep(2000);
	          driver.close();
		
	}
	}
	}

