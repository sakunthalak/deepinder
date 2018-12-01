package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//for windows
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://whitecircleschool.com/alertboxdemo/");
//as an alert box developed in java we cont see the id so we selected css 
		//An alert box is only to accept using below
		//a try button is animated one we need to wait for element to present
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > div.elementor.elementor-599 > div > div > section.elementor-element.elementor-element-9860042.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default.elementor-section.elementor-top-section > div > div > div > div > div > div > div > button")));
		driver.findElement(By.cssSelector("body > div.elementor.elementor-599 > div > div > section.elementor-element.elementor-element-9860042.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default.elementor-section.elementor-top-section > div > div > div > div > div > div > div > button")).click();
		driver.switchTo().alert().accept();
	}

}
