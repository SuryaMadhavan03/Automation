package Basic_Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_07 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("Yuvan");
		Thread.sleep(1000);
		List<WebElement> AutoSuggestion = driver.findElements(By.xpath("//span[contains(text(),'yuvan')]"));
		Thread.sleep(1000);
		int count = AutoSuggestion.size();
		Thread.sleep(1000);
		for(int i=0;i<count;i++) {
			String AllText = AutoSuggestion.get(i).getText();
			System.out.println(AllText);
		}
		AutoSuggestion.get(2).click();
		Thread.sleep(3000);
		driver.close();
	}
}
