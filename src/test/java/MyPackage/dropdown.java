package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		driver.manage().window().maximize();
		
	WebElement drp=	driver.findElement((By.xpath("//select[@id='Form_getForm_Country']")));
	
	Select se=new Select(drp);
	
	//se.selectByIndex(4);
	se.selectByVisibleText("India");
	}

}
