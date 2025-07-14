package Basic_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program_10 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(1000);
		WebElement Day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select s = new Select(Day);
		s.selectByIndex(14);
		Thread.sleep(1000);
		WebElement Month = driver.findElement(By.xpath("(//select)[2]"));
		Select s1 = new Select(Month);
		s1.selectByValue("8");
		Thread.sleep(1000);
		WebElement Year = driver.findElement(By.id("year"));
		Select s2 = new Select(Year);
		s2.selectByVisibleText("1947");
		Thread.sleep(5000);
		driver.close();		
		
	}

}
