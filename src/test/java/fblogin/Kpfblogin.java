package fblogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kpfblogin {
	
 public static void main () {
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\azhar\\eclipse-workspace\\18052021\\driver\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver ();
	 
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 
	 
 }

}
