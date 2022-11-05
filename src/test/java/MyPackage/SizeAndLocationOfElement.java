package MyPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SizeAndLocationOfElement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		// location
		 System.out.println("location (x,y):"+ logo.getLocation());
		 System.out.println("location (x):"+ logo.getLocation().getX());
		 System.out.println("location (y):"+ logo.getLocation().getY());
		 
		 //size
		 
		 System.out.println("size (width,height):"+ logo.getSize());
		 System.out.println("size (width):"+ logo.getSize().getWidth());
		 System.out.println("size (height):"+ logo.getSize().getHeight());
		
		 
		 
		

	}

}
