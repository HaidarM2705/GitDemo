package GitDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		//dragAndDrop click action
		
		WebElement s1= driver.findElement(By.xpath("//div[@id='box6']"));
		
		WebElement s2= driver.findElement(By.xpath("//div[@id='box106']"));
		
	//WebElement button=	driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
     
	     Actions act=new Actions(driver);
	     act.dragAndDrop(s1, s2).perform();
	}

}
