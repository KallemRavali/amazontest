package amazontest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import amazontest.Amazontest;

public class mainclass extends Amazontest {
	
	@Test
	public void login() {
	
		System.out.println("entered succesfully");
		driver.findElements(By.xpath("//span[normalize-space()='Hello, sign in']")).click();
		driver.findElements(By.xpath("//input[@id='ap_email_login']")).sendkeys("9963853464");
		driver.findElements(By.xpath("//input[@type='submit']")).click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
