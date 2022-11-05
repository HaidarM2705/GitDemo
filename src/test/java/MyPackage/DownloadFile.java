package MyPackage;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {

	public static void main(String[] args) {
		
		/*String location = System.getProperty("E:\\HAIDAR\\files");
		
		//by using chrome driver
		
		HashMap preferences=new HashMap();
		preferences.put("download.default_directory", location);
		
		ChromeOptions options= new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);*/
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		driver.switchTo().alert().dismiss();
		
		
		
	}

}
