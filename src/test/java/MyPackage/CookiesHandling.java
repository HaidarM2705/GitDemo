package MyPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesHandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// capture cookies
		Set<Cookie> cookies= driver.manage().getCookies();
		System.out.println("size of the cookies:"+ cookies.size());
		
		// print cookies name
		
		for (Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+ "  "+ cookie.getValue());
		}
		
		//add cookie to browser
		
		Cookie cookeobj= new Cookie("my Cookie 123","123456");
		driver.manage().addCookie(cookeobj);
		
		 cookies= driver.manage().getCookies();
		System.out.println("size of the cookies after adding:"+ cookies.size());
		
		// delete cookie
	//	driver.manage().deleteCookie(cookeobj);
		driver.manage().deleteCookieNamed("my Cookie 123");
		     cookies= driver.manage().getCookies();
			System.out.println("size of the cookies after deletion:"+ cookies.size());
			//System.out.println(cookies.getName()+ "  "+ cookies.getValue());
			
			
		//delete all cookies
			driver.manage().deleteAllCookies();
		
			  cookies= driver.manage().getCookies();
			System.out.println("size of the cookies after deletion:"+ cookies.size());
		
		
		
		driver.close();
		
		
		
		
	}

}
