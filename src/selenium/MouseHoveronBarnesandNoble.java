package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveronBarnesandNoble {
	 static WebDriver driver=new ChromeDriver();
	 
	 //it for handling the advertisement if it is avialble or not 
	public static boolean advertisementPresent() {
		boolean status;
		try{
			status=driver.findElement(By.xpath("//body[contains(@class,'overlay')]")).isDisplayed();
		}catch (Exception e)
		{
			status =false;
		}
	return status;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		driver.manage().window().maximize();//for windows
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.barnesandnoble.com/");
		
		
		if(advertisementPresent()) {
			
		
			driver.findElement(By.xpath("(//button[contains(@data-click,'close')])[1]")).click();
		}
		 
		//click on sign in
		WebElement signIn=driver.findElement(By.id("myAccountLink-old"));
		Actions action=new Actions(driver);
		action.moveToElement(signIn).build().perform();
		driver.findElement(By.linkText("Sign In")).click();
			
WebElement dialogBox=driver.findElement(By.cssSelector("body > div.modal.focus > div > iframe"));
driver.switchTo().frame(dialogBox);

		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1234@Abcd");
		driver.findElement(By.className("btn btn--large")).click();
		
		
	}

}
