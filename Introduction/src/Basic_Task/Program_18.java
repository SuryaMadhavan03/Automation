package Basic_Task;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_18 {
       public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 		driver.get("https://www.foundit.in/rio/login");
	 		Thread.sleep(1000);
	 		String ParentTitle = driver.getTitle();
	 		driver.findElement(By.xpath("//span[text()='Google']")).click();
	 		Thread.sleep(1000);
	 		driver.findElement(By.xpath("//span[text()='LinkedIn']")).click();
	 		Thread.sleep(1000);
	 		driver.findElement(By.xpath("//span[text()='Facebook']")).click();
	 		Thread.sleep(1000);
	 		Set<String> Allwindows = driver.getWindowHandles();
	 		for (String i : Allwindows) {
				driver.switchTo().window(i);
				String AllTitle = driver.getTitle();
				if (AllTitle.equals(ParentTitle)) {
					driver.close();
				}else {
					String ChildTitle = driver.getTitle();
					System.out.println(ChildTitle);
				}
			}
}
}
