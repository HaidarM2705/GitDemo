package MyPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		int brokenlink=0;
		
		for(WebElement li:links)
		{
		String url=	li.getAttribute("href");
		
		if(url==null || url.isEmpty())
		{
			System.out.println("url is empty");
			continue;
		}
		URL link= new URL(url);
		
	
		try {
			
			HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
			httpconn.connect();
			if(httpconn.getResponseCode()>=400)
			{
				System.out.println(httpconn.getResponseCode()+url+" is "+" broken link ");
				brokenlink++;
				
			}
			else
			{
				System.out.println(httpconn.getResponseCode()+url+" is "+" valid link ");
				
			}
			
		} catch (MalformedURLException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		}

	}

}
