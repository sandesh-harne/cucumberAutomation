package JavaStepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {
	ChromeOptions options = new ChromeOptions();
options.setHeadless(false); // 🚫 No headless
options.addArguments("--start-maximized");
	WebDriver driver;

	@Given("user opens the {string} url")
	public void user_opens_the_url(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseProgramsM\\Assignment\\maven\\BDDDemo\\webdriver\\chromedriver-win64\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.get(url);
	}

	@Given("user is on login Page")
	public void user_is_on_login_page() {
	    System.out.println("Login page is available");
	}

	@When("user enters {string} in username")
	public void user_enters_in_username(String Name) {
		WebElement userName = driver.findElement(By.xpath("//*[@name=\"userLoginId\"]"));
		userName.sendKeys(Name);
	    System.out.println("User Entered Username");

	}

	@When("user enters {string} in password")
	public void user_enters_in_password(String Pass) {
		WebElement userName = driver.findElement(By.xpath("//*[@name=\"password\"]"));
		userName.sendKeys(Pass);
		System.out.println("User Entered Password");
	}

	
	@Then("welcome message should appear on webpage")
	public void welcome_message_should_appear_on_webpage() throws InterruptedException {
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		String Errormsg = driver.findElement(By.xpath("//*[@role=\"alert\"]")).getText();
		System.out.println("testing : "+Errormsg);

//		Assert.assertTrue(driver.findElement(By.xpath("//*[@role=\"alert\"]")).isDisplayed());
	}
	
	@Then("welcome message should appear on webpage assert")
	public void welcome_message_should_appear_on_webpageassert() throws InterruptedException {
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		String Errormsg = driver.findElement(By.xpath("//*[@role=\"alert\"]")).getText();
		System.out.println("testing : "+Errormsg);
		assertEquals("sandesh", Errormsg);
//		Assert.assertTrue(driver.findElement(By.xpath("//*[@role=\"alert\"]")).isDisplayed());
	}
}
