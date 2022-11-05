package MyPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickers{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demos.telerik.com/kendo-ui/datepicker/index");
		driver.manage().window().maximize();
		
		String year="2011";
		String month="May";
		String day= "27";
		
		Thread.sleep(3000);
		
	  driver.findElement(By.xpath("//span[1]//button[1]//span[1]")).click();
		
		while(true)
		{
			String my=driver.findElement(By.xpath("//a[@id='nav-up']")).getText();
			String arr[]=my.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='k-button-icon k-icon k-i-arrow-60-left']")).click();
			}
			
		}

		List<WebElement> days=driver.findElements(By.xpath("//table[@role='grid']//td"));
		
		for(WebElement ele:days)
		{
			String d=ele.getText();
			if (d.equals(day))
			{
				ele.click();
				break;
			}
		}
		
		
		
	}

}
