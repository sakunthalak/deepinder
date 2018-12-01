package selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Newtours {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver;	
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30	,TimeUnit.SECONDS);
//		driver.get("http://newtours.demoaut.com/");
	String[][] data=Excel.getData("testData.xlsx","Sheet1");
				
		for(int i=1;i<data.length;i++) {
		
		String username=data[i][1];
		String password=data[i][2];
//		driver.findElement(By.name("userName")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
		
		System.out.println("username");
		}
		
	}

}
