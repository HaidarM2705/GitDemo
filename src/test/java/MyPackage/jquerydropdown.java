package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jquerydropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		//selectCoiceValues(driver,"choice 1");
		//selectCoiceValues(driver,"choice 1","choice 2");
	    selectCoiceValues(driver,"all");
		
		
		
	}
	
	public static void selectCoiceValues(WebDriver driver,String...value)
	{
	List<WebElement> choicelist= driver.findElements(By.xpath("//span[@class='ComboTreeItemtitle']"));
	
	
	if(!value[0].equalsIgnoreCase("all"))
	{
		for (WebElement item:choicelist)
		{
			String text=item.getText();
			for (String val:value)
			{
				if (text.equals(val))
				{
					item.click();
					break;
				}
			}
		}
	}
	else 
	{
		for (WebElement item:choicelist)
		{
			item.click();
		}
	}
	}
	

}
