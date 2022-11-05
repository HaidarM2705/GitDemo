package MyPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableData {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		// find rows in table
		int rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		
		System.out.println("total no. of rows:"+ rows);
		
		// no.columns
		
		int column= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
		
		System.out.println("no.of columns:"+ column);
		
		//retrive row and column data
		
	String ele=	driver.findElement(By.xpath("//table[@id='customers']//tr[3]/td[2]")).getText();
	System.out.println("retrive value from table:"+ ele);
	
	  // retrive all data from row and columns
	
	/*System.out.println("data from the table");
	
	
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=column;c++)
		{
			String data=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td["+c+"]")).getText();
			System.out.println(data+"    ");
		}
		System.out.println();
	}*/
	
	// selected data
	
	for(int r=1;r<=rows;r++)
	{
		String d1=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td[1]")).getText();
		
		if(d1.equals("Microsoft"))
		{
			String contact=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td[2]")).getText();
			String country=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td[3]")).getText();
			System.out.println(d1+"    "+ contact+"     " +country);
			
		}
		
	}
	
	
	
		
		
	}

}
