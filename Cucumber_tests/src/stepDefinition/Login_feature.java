package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_feature {
	
 WebDriver driver = new FirefoxDriver();
	@Given("^User is on the homepage$")
	public void user_is_on_the_homepage() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sourabh Matta\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com.au/");
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.className("gb_P"));
		element.click();
		Thread.sleep(4000);
		throw new PendingException();
	}

	@When("^Click on the gmail link And add valid credentials$")
	public void click_on_the_gmail_link_And_add_valid_credentials() throws Throwable {
		
		driver.findElement(By.id("identifierId")).sendKeys("sourabh.matta@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click();
		Thread.sleep(4000);
		throw new PendingException();
	}

	@Then("^user should Login successfuly$")
	public void user_should_Login_successfuly() throws Throwable {
	    
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("mobera@1234");
		driver.findElement(By.xpath(".//*[@id='passwordNext']/div[2]")).click();
		System.out.println("this is test new test again");
		
		throw new PendingException();
	}


	
	
}
