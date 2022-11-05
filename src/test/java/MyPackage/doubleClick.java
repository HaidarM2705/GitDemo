package MyPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class doubleClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		//double click action
	WebElement one=	driver.findElement(By.xpath("//input[@id='field1']"));
	one.clear();
	one.sendKeys("welcome to selenium");
		
		
	WebElement button=	driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
     
	     Actions act=new Actions(driver);
	     act.doubleClick(button).perform();

	}

}
