package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		System.out.println ("title of the page is:" +driver.getTitle());
		System.out.println ("Current url of the page is:" +driver.getCurrentUrl());
		System.out.println ("title of the page is:" +driver.getTitle());
		System.out.println ("page source of the page is:" +driver.getPageSource());
		
		
	}

}
