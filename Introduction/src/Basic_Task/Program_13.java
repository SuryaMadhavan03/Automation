package Basic_Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;
public class Program_13 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///D:/Html/4.html");
		WebElement List = driver.findElement(By.id("s1"));
		Select s = new Select(List);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByValue("1");
		Thread.sleep(1000);
		s.selectByVisibleText("Dosa");
		Thread.sleep(1000);
		List<WebElement> AllOpt = s.getAllSelectedOptions();
		int count = AllOpt.size();
		for (int i = 0; i < count; i++) {
			String SelectedOption = AllOpt.get(i).getText();
			System.out.println(SelectedOption);
		}
		driver.close();
	}

}
