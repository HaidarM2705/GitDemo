package MyPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownnew {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys("selenium");
		
	List<WebElement> ele=	driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
	
	System.out.println("no.of options:"+ele.size());
	for(WebElement li:ele)
	{
		if (li.getText().contains("download"))
		{
			li.click();
			break;
		}
	}
	
	}

}
