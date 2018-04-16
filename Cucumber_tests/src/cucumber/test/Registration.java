package cucumber.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Registration {

	
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sourabh Matta\\Desktop\\geckodriver.exe");
		
	    WebDriver driver = new FirefoxDriver();
		
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.className("gb_P"));
		element.click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();;
		
		//Thread.sleep(4000);
		driver.findElement(By.id("")).sendKeys("sou.matta@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("mobera@1234");
	
		
		

		
	}

}
