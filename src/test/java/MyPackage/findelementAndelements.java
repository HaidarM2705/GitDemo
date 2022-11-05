package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findelementAndelements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
	WebElement s=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	s.sendKeys("xyz");
	     
	//WebElement y=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
	
	//System.out.println(y.getText());
	
	List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
	System.out.println("No.of links are:"+ links.size());
	
	for (WebElement ele:links)
	{
		System.out.println(ele.getText());
	}
	
	
	
	}

}
