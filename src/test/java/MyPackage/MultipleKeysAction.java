package MyPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleKeysAction {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		WebElement t1= driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement t2= driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		t1.sendKeys("welcome to selenium");
		
		Actions act = new Actions (driver);
		
		// for pressing control A
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		// ctrl+c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//pressing Tab key
		
		act.sendKeys(Keys.TAB);
		act.perform();
		
		//ctrl+v for pasting
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//compare text
		if (t1.getAttribute("value").equals(t2.getAttribute("value")))
		{
			System.out.println("text coppied");
		}
		else
		{
			System.out.println("text not coppied");
		}
		
		
		
		
				
	}

}
