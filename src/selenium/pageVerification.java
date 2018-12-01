package selenium;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30	,TimeUnit.SECONDS);
		driver.get("https://moovicart.com/");
		
		driver.findElement(By.name("username")).sendKeys("sakunthala");
		driver.findElement(By.name("password")).sendKeys("purnesh");
		driver.findElement(By.name("login")).click();
		
		WebElement dash=driver.findElement(By.cssSelector("body > table > tbody > tr:nth-child(2) > td > div.left_bar_menu > div > div > div.profile-usertitle > div.profile-usertitle-name > span"));
		System.out.println(dash.getText());
	
	}

}
