package Basic_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement TextBox = driver.findElement(By.id("email"));
		Thread.sleep(1000);
		int Height = TextBox.getSize().getHeight();
		int Width = TextBox.getSize().getWidth();
		Thread.sleep(1000);
		if(Height==Width)	
		{
			System.out.println("The Height and Width of the Login Text Box are Same-->"+"Height-->"+Height+" and "+"Width-->"+Width);
		}
		else
		{
			System.out.println("The Height and Width of the Login Text Box are not Same-->"+"Height-->"+Height+" and "+"Width-->"+Width);
		}
		driver.close();
	}

}
