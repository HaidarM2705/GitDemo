package MyPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class links {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[@href='/deals?ref_=nav_cs_gb']")).click();
		
		//driver.findElement(By.linkText("Today's Deals")).click();  // by using link text
		
		// no.of links in web page
		
		List<WebElement> Links= driver.findElements(By.tagName("a"));
		
    	System.out.println("no.of links:"+Links.size());
    	
    	// normal for loop
    	
    	/*for(int i=0;i<=Links.size();i++)
    	{
    		System.out.println(Links.get(i).getText());
    		System.out.println(Links.get(i).getAttribute("href"));
    		
    	}*/
    	
    	// for each loop
    	
    	for(WebElement links:Links)
    	{
    		System.out.println(links.getText());
    		System.out.println(links.getAttribute("href"));
    	}
		
		

	}

}
