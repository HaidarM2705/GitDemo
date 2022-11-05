package MyPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement ms=driver.findElement(By.xpath("//span[1]"));
		System.out.println("location of the element:"+ms.getLocation());//location of the element:(59, 250)
		System.out.println("Height&width of the element:"+ms.getSize());//Height&width of the element:(21, 21)
		
		Actions act= new Actions(driver);
		act.dragAndDropBy(ms, 100, 0).perform();
		System.out.println("location of the element:"+ms.getLocation());//location of the element:(158, 250)
		System.out.println("Height&width of the element:"+ms.getSize());//Height&width of the element:(21, 21)
		
		WebElement msd=driver.findElement(By.xpath("//span[2]"));
		act.dragAndDropBy(msd, -100, 0).perform();
		
		
	}

}
