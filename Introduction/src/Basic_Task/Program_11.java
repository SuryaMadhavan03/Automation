package Basic_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program_11 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Html/4.html");
		Thread.sleep(1000);
		WebElement List = driver.findElement(By.id("s1"));
		Thread.sleep(1000);
		Select s = new Select(List);
		s.selectByIndex(4);
		Thread.sleep(1000);
		s.selectByValue("3");
		Thread.sleep(1000);
		s.selectByVisibleText("Briyani");
		Thread.sleep(1000);
		s.deselectByVisibleText("Dosa");
		Thread.sleep(1000);
		s.deselectByIndex(2);
		Thread.sleep(1000);
		s.deselectByValue("1");
		Thread.sleep(1000);
		driver.close();
		
	}
}
