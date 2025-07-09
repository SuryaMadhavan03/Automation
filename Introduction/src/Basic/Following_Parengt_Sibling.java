package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Following_Parengt_Sibling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		String output=driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		String output_1=driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText();
		System.out.println("Using Following Sibling -->"+output);
		System.out.println("Using Parent-->"+output_1);
		
		driver.close();
	}

}
