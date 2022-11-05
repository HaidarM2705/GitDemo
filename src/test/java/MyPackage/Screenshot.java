package MyPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		// full page screenshot
		
		/*TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File trg=new File("E:\\HAIDAR\\screenshot\\homepage");
		
		FileUtils.copyFile(src, trg);*/
		
		// screenshot of the section/portion of the page
		
		/*WebElement section= driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File src = section.getScreenshotAs(OutputType.FILE);
		File trg = new File ("E:\\HAIDAR\\screenshot\\sectionpage");
		FileUtils.copyFile(src, trg);*/
		
		// screenshot of the element on the page
		
		WebElement ele= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
				
				File src = ele.getScreenshotAs(OutputType.FILE);
				File trg = new File ("E:\\HAIDAR\\screenshot\\logopage");
				FileUtils.copyFile(src, trg);
				
				driver.close();

	}

}
