package Basic_Task;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.xpath("(//input[@autocomplete='OFF'])[1]")).sendKeys("100108");
		driver.findElement(By.id("dob")).click();
	    WebElement Month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	    Select s = new Select(Month);
	    s.selectByIndex(2);
	    WebElement Year = driver.findElement(By.xpath("(//select)[2]"));
	    Select s1 = new Select(Year);
	    s1.selectByVisibleText("2001");
	    driver.findElement(By.xpath("//a[.='24']")).click();
	   // driver.findElement(By.xpath("//a[@aria-current='true']")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9876543210");
	    driver.findElement(By.xpath("//button[.='Lets Renew']")).click();
	    String ExpectedResult = "Please enter valid Policy No.";
	    String ActualResult = driver.findElement(By.id("policynumberError")).getText();
	    if(ExpectedResult.equals(ActualResult))
	    {
	    	System.out.println("Given Text is Same-->"+ActualResult);
	    }
	    else
	    {
	    	System.out.println("Given Text is Not same-->"+ActualResult);
	    }
	    driver.close();
	}

}
