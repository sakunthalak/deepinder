package selenium;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {
	static WebDriver driver;
	public static boolean advPresent() {
		boolean status;
		try {
			status=driver.findElement(By.id("div-close")).isDisplayed();
			
		}catch (Exception e) {
			status=false;
		}return status;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.manage().window().maximize();//for windows
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
		//closing the advertisement
		if(advPresent()) {
			
						driver.findElement(By.id("div-close")).click();
		}
						//click on login button
		driver.findElement(By.id("loginsubmit")).click();
		
		//making list of windows
		ArrayList<String> windows=new ArrayList<>(driver.getWindowHandles());
		System.out.println(windows);
		//going to child window
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.id("Continue to NetBanking")).click();
		//go back to parent window
		driver.switchTo().window(windows.get(0));
	}

}
