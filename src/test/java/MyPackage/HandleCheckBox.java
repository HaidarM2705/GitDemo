package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//driver.findElement(By.xpath("//input[@id='monday']")).click(); //select single checkbox
		
	List<WebElement> day=	driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
	
           System.out.println("total no.of checkboxs:"+day.size());
           
           /*for(int i=0;i<day.size();i++)
           {
        	   day.get(i).click();
           }*/
           
          /* for(WebElement d:day)
           {
        	   d.click(); // select all checkboxes
        	   
           }*/
           
          /* for(WebElement d:day)
           {
        	 String name= d.getAttribute("id");
        	   if(name.equals("monday") || name.equals("sunday"))
        			   {
        		            d.click();       //select 2 checkboxes
        			   }
           }*/
         int no= day.size();
         /*for (int i=no-2;i<=no;i++)
         {
        	 day.get(i).click();  //last 2 boxes
        	 
         }*/
         
         for(int i=0;i<no;i++)
         {
        	if(i<3)
        		day.get(i).click();     //first 3 checkboxes
         }
         
	}

}
