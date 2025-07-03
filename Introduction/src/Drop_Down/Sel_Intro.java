package Drop_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		String T=driver.getTitle();
//		driver.close();
//		System.out.println("Current URL Title"+T);
		
		
		driver.get("https://www.sanlam.com/");
		driver.findElement(By.linkText("BUSINESS")).click();

	}

}
