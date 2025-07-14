package Basic_Task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_14 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'display an  alert box')]")).click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		String Text = a.getText();
		Thread.sleep(1000);
		System.out.println(Text);
		a.accept();
		Thread.sleep(1000);
		driver.close();
	}

}
