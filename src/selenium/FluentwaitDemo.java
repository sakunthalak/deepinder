package selenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class FluentwaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();//for windows
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

driver.findElement(By.cssSelector("#start > button")).click();

String expected="Hello World!";
//WebDriverWait wait =new WebDriverWait(driver,10);
Wait<WebDriver>wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));

String actual=driver.findElement(By.id("finish")).getText();
System.out.println(actual);

		if(expected.equals(actual))

			System.out.println("test is passed");
		else
			System.out.println("test is failed");
}}
