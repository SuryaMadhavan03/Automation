package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		Thread.sleep(1000);
		driver.manage().window().maximize();//To perform maximum operation
		Thread.sleep(1000);
		String Actual_Result=driver.getTitle();
		String Expected_Result="Rahul Shetty";
		if(Actual_Result.contains(Expected_Result))//Verify the title of the Web page Rahul_Shetty
		{
			System.out.println("Test case pass - "+Actual_Result);
		}
		else {
			System.out.println("Test case fail - "+Actual_Result);
		}
		System.out.println("Title of he Web page"+Actual_Result);//Print the title of the web page
		String Source=driver.getPageSource();
		System.out.println("Source Code of the webpage"+Source);//Print the Source code of web page
		//Navigate method by using two different URL
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		String URL1=driver.getCurrentUrl();
		System.out.println(URL1);
		driver.navigate().to("https://rahulshettyacademy.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		String URL2=driver.getCurrentUrl();
		System.out.println(URL2);//Print the Current URL method
		String Address = driver.getWindowHandle();//Perform get windows handle
		System.out.println("Address of the webpage - "+Address);
		driver.close();
	}
}
