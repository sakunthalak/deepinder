package selenium;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	
	
	public static void verifyURLStatus(String URL) throws ClientProtocolException, IOException
	{
		HttpClient client=HttpClientBuilder.create().build();
		HttpGet request=new HttpGet(URL);
		HttpResponse response=client.execute(request);
	if(response.getStatusLine().getStatusCode()==200)//==200 for valid links
		{
			System.out.println("Name of the valid link is ="+URL);
		System.out.println(response.getStatusLine().getStatusCode());
		}
		
		
	}
	public static void main(String[] args) throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//for windows
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://moovicart.com");
		
		
		List<WebElement> alllinks=driver.findElements(By.className("hvr-shutter-out-horizontal"));

		System.out.println("Total Links on the page="+alllinks.size());
		
		for(WebElement t:alllinks) {
			System.out.println(t);
			String url=t.getAttribute("href");
			verifyURLStatus(url);
			
		}

}
