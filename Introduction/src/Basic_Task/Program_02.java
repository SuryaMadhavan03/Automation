package Basic_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		WebElement Login = driver.findElement(By.xpath("(//a/div)[1]"));
		int xaxis = Login.getLocation().getX();
		int yaxis = Login.getLocation().getY();
		Thread.sleep(1000);
		System.out.println("X-Axis of the Login Button is --> "+xaxis);
		Thread.sleep(1000);
		System.out.println("Y-Axis of the Login Button is --> "+yaxis);
		driver.close();
	}

}
