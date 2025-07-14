package Basic_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_04 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement UN = driver.findElement(By.id("email"));
		Thread.sleep(1000);
		UN.sendKeys("Dhoni");
		Thread.sleep(1000);
		String ER = UN.getText();
		Thread.sleep(1000);
		UN.sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(1000);
		UN.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		WebElement PW = driver.findElement(By.id("pass"));
		Thread.sleep(1000);
		PW.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);
		String AR = PW.getText();
		Thread.sleep(1000);
		PW.sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(1000);
		PW.sendKeys(Keys.BACK_SPACE);
		if (ER.contains(AR)) {
			System.out.println("Both the Text are Same ");
		}
		else {
			System.out.println("Both the text are not same");
		}
		driver.close();
	}

}
