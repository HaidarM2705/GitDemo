package MyPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

	public static void drawBorder(WebElement ele, WebDriver driver) {
		JavascriptExecutor js =( (JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'",ele);
	}
	
	
	
	
	
}
