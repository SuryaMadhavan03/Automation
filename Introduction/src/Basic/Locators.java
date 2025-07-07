package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("Surya");
		driver.findElement(By.name("inputPassword")).sendKeys("Surya");
		driver.findElement(By.xpath("//input[@value='rmbrUsername']")).click();
		driver.findElement(By.cssSelector("input[value='agreeTerms']")).click();
		driver.findElement(By.className("signInBtn")).submit();
		String ER="Login Succesful";
		Thread.sleep(3000);
		String AR=driver.findElement(By.cssSelector("p.error")).getText();
		if(AR.contains(ER))
		{
			System.out.println("Login succesful, Test Case pass"+ER);
		}
		else {
			System.out.println("Login failed, Test Case fail, System throws-"+AR);
		}
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder=\"Name\"]")).sendKeys("Surya");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("s@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("9876543210");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(3000);
		String Pass =driver.findElement(By.className("infoMsg")).getText();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".go-to-login-btn")).submit();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Surya");
		driver.findElement(By.xpath("input[placeholder*='Pass']")).sendKeys("raghulshetty");
		driver.findElement(By.xpath("//input[@value='rmbrUsername']")).click();
		driver.findElement(By.cssSelector("input[value='agreeTerms']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).submit();
		driver.quit();
	}

}
;