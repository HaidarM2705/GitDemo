package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class statusOfwebelement {

	public static void main(String[] args) {

      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("https://demo.nopcommerce.com/");
      driver.manage().window().maximize();
      
      WebElement search=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
      System.out.println(search.isDisplayed());
      System.out.println(search.isEnabled());
      
     WebElement good= driver.findElement(By.xpath("//input[@id='pollanswers-2']"));
      System.out.println(good.isSelected());
	}

}
