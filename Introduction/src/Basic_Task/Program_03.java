package Basic_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_03 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		WebElement UN = driver.findElement(By.name("username"));
		WebElement PW = driver.findElement(By.name("pwd"));
		Thread.sleep(1000);
		int xaxis = UN.getLocation().getX();
		int yaxis = PW.getLocation().getX();
		if(xaxis==yaxis)
		{
			System.out.println("Both are Equal --> "+"xaxis --> "+xaxis+ " and "+"yaxis --> "+yaxis);
		}
		else
		{
			System.out.println("Both are Not Equal --> "+"xaxis --> "+xaxis+ " and "+"yaxis --> "+yaxis);
		}
		driver.close();
	}

}
