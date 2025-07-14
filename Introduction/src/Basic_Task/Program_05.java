package Basic_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_05 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement FP = driver.findElement(By.partialLinkText("Forgotten password?"));
		Thread.sleep(1000);
		String FF = FP.getCssValue("font-family");
		String FC = FP.getCssValue("color");
		String FS = FP.getCssValue("font-size");
		String FW = FP.getCssValue("font-weight");
		System.out.println(FF);
		System.out.println(FC);
		System.out.println(FS);
		System.out.println(FW);
		driver.close();
	}

}
