package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//for windows
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement country=driver.findElement(By.name("country"));
		Select dropdown=new Select(country);
		//if we want to print all the values in dropdown
		List<WebElement> allcountries=dropdown.getOptions();
		
		for(WebElement t: allcountries) {
			System.out.println(t.getText());
		}
		
		//dropdown.selectByVisibleText("CHINA");
		//dropdown.selectByValue("38");
		//dropdown.selectByIndex(8);
	}

}
