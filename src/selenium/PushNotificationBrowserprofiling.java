package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PushNotificationBrowserprofiling {
	
	public static void main(String[] args) {		
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	
	//Browser profiling is a users personal settings,which includes collection of bookmarks,browser setting,
	//extensions,passwords,history,customization,add-ons,and other personalization settings that can be done
	
	WebDriver driver=new ChromeDriver(options);
	
	driver.manage().window().maximize();//for windows
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.ndtv.com/");
	

}
}