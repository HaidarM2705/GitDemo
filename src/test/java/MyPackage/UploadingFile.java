package MyPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadingFile {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.monsterindia.com/srp/results");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='mb10']//a[@title='Click to upload your resume']")).click();
		
		// using sendkeys  it used when In html type=file
		//driver.findElement(By.xpath("(//input[@id='file-upload'])")).sendKeys("D:\\Downloads\\Resume1.pdf");
		
		// by using robot class method
		
	WebElement button=driver.findElement(By.xpath("//input[@id='file-upload']"));
	// click button by using java script....
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",button);
	
	Robot rb = new Robot();
	rb.delay(2000);
	
	StringSelection ss = new StringSelection("D:\\Downloads\\Resume 1.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
	//ctrl+v
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.delay(2000);
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	rb.delay(2000);
	
	//enter
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	
	
		
		
		
		
	}

}
