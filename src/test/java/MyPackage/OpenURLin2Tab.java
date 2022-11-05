package MyPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenURLin2Tab {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// open 2 url in 2 tab
		
		driver.switchTo().newWindow(WindowType.TAB); //open url in tab
		
		driver.switchTo().newWindow(WindowType.WINDOW);// open url in window
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

	}

}
