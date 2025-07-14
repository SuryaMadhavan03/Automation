package Basic_Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_08 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		Thread.sleep(1000);
		List<WebElement> News = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
		Thread.sleep(1000);
		int count = News.size();
		Thread.sleep(1000);
		for(int i=0;i<count;i++) {
			String UpdatedNews = News.get(i).getText();
			System.out.println(UpdatedNews);
		}
		driver.close();
	}
}
