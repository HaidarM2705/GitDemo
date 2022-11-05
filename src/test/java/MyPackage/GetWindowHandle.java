package MyPackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandle {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	//get window handle
          // String windowid=driver.getWindowHandle();
	    //  System.out.println(windowid);
	      
	      driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	      
	      //get window handles
	      
	     Set<String> windowids= driver.getWindowHandles();
	     
	     // by using iterator method
	     
	  /* Iterator<String> it= windowids.iterator();
	
	String w1=it.next();
	String w2=it.next();
	
	System.out.println("parent window:"+w1);
	System.out.println("child window:"+w2);*/
	
	//by using arreylist
	     
	     List<String> windowidslist=new ArrayList(windowids);  //convert set into list
	     
	/* String w1= windowidslist.get(0);
	   String w2= windowidslist.get(1);
	
	   System.out.println("parent window:"+w1);
		System.out.println("child window:"+w2);
		
		//using of window ids for switching purpose
		
		driver.switchTo().window(w1);
		 System.out.println("parent window title:"+driver.getTitle());
	
		 driver.switchTo().window(w2);
		 System.out.println("child w title:"+driver.getTitle());*/
		 
		 
		 // by using for each loop
		 
		 for(String winid: windowidslist)
		 {
			 String Title=driver.switchTo().window(winid).getTitle();
			 System.out.println(Title);
		 }
	//driver.close();
		 driver.quit();
	
	
	}

	private static TimeUnit ofSeconds(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
