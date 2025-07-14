package Basic_Task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_19 {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		try {
			driver.findElement(By.xpath("//button[.='✕']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.name("q")).sendKeys("Sunscreen");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
//		driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[4]")).click();
//		Set<String> Allwindows = driver.getWindowHandles();
//	    ArrayList<String> al = new ArrayList<String>(Allwindows);
//		driver.switchTo().window(al.get(1));
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
//		driver.findElement(By.xpath("//input[@maxlength='auto']")).sendKeys("6383175201");
//		driver.findElement(By.xpath("//span[.='CONTINUE']")).click();
		driver.close();
	}
}
