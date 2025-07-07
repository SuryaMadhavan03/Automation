package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
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
		String password=getpassword(driver);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".go-to-login-btn")).submit();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Surya");
		Thread.sleep(2000);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='rmbrUsername']")).click();
		driver.findElement(By.cssSelector("input[value='agreeTerms']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).submit();
		Thread.sleep(5000);
		String Result = driver.findElement(By.tagName("p")).getText();
		System.out.println(Result);
		Assert.assertEquals("You are successfully logged in.", Result);
		driver.findElement(By.className("logout-btn")).click();
		Thread.sleep(3000);
		driver.quit();
	}

	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder=\"Name\"]")).sendKeys("Surya");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("s@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("9876543210");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String pass=driver.findElement(By.cssSelector(".infoMsg")).getText();
		String[] split_password=pass.split("'");
		String Password=split_password[1].split("'")[0];
		return Password;
	}
}