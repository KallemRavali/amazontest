package amazontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazontest {
	//@BeforeTest
	//public  void setup() {
		//OPEN THE CHROME BROWSER
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
    //WebDriver driver=new ChromeDriver();
   // driver.get("https://www.amazon.in/s?k=amazon+sign&i=electronics&adgrpid=59527504272&ext_vrnc=hi&gclid=Cj0KCQiAtvSdBhD0ARIsAPf8oNk89dfc4kTDxghODZfocb1fkgI7imtCxdvhFn6T3LrI32YcmiBTB_8aAuZXEALw_wcB&hvadid=596980891918&hvdev=c&");
//	}
	
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/s?k=amazon+sign&i=electronics&adgrpid=59527504272&ext_vrnc=hi&gclid=Cj0KCQiAtvSdBhD0ARIsAPf8oNk89dfc4kTDxghODZfocb1fkgI7imtCxdvhFn6T3LrI32YcmiBTB_8aAuZXEALw_wcB&hvadid=596980891918&hvdev=c&");
		System.out.println("entered succesfully");
		driver.manage().window().maximize();
		String	element = driver.getTitle();
		System.out.println("The name of the page is " + element);
		driver.findElement(By.xpath("//span[normalize-space()='Hello, sign in']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9963853464");
		System.out.println("entered phone no");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ravali@3464");
		System.out.println("entered password");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		System.out.println("clicked signin button");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("t-shirts for women");
		System.out.println("entered the text in the searchbar");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		System.out.println("entered into new page");
		driver.findElement(By.xpath("//div[@class='a-section a-spacing-mini']/self::*/a")).click();
		Thread.sleep(3000);
		String	element1 = driver.getTitle();
		System.out.println("The name of the page is " + element1);
		System.out.println("entered into fleximaa page");
		driver.findElement(By.xpath("//div[@class='Header__menuArea__ejLNf']/self::*/child::*[1]/child::*[2]/child::*/child::*/child::*[6]")).click();
		Thread.sleep(3000);
		System.out.println("into offers page");
		Thread.sleep(3000);
		 driver.navigate().back();
		 driver.quit();
	}
	
	
	}