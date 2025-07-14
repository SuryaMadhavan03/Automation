package Basic_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class Program_12 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Html/demo.html");
		Thread.sleep(1000);
		WebElement List = driver.findElement(By.id("s1"));
		Select s = new Select(List);
		Thread.sleep(1000);
		List<WebElement> Allopt = s.getOptions();
		int count = Allopt.size();
		for(int i=0;i<count;i++) {
			String Text = Allopt.get(i).getText();
			System.out.println(Text);
		}
		driver.close();
	}
}
