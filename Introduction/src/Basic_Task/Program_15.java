package Basic_Task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_15 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		a.dismiss();
	    WebElement Actual_Result = driver.findElement(By.xpath("//p[.='You Pressed Cancel']"));
	    String AR = Actual_Result.getText();
	    String ER = "You Pressed Cancel";
	    if(ER.equals(AR)) {
	    	System.out.println("Test Case is Pass-->"+AR);
	    }else {
	    	System.out.println("Test Case is Not Pass-->"+AR);
	    }
	    driver.close();
	}
}
