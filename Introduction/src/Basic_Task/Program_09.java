package Basic_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program_09 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		WebElement Day = driver.findElement(By.id("day"));
		Thread.sleep(1000);
		Select s = new Select(Day);
		Thread.sleep(1000);
		s.selectByValue("6");
		Thread.sleep(2000);
		s.selectByVisibleText("12");
		Thread.sleep(2000);
		s.selectByIndex(17);
		Thread.sleep(2000);
		driver.close();
	}

}
