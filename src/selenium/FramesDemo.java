package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();//for windows
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
		
		//Go to frame
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("HELP")).click();
		//For going to other frame we need to come out 
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("HTMLLauncher")).click();
		
		

	}

}
