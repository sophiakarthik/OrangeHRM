package stepDefinitionFiles;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_with_parameter {
	WebDriver driver;
	@Given("user is in login page")
	public void user_is_in_login_page() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

	    	}

	@Given("user enters the username  {string}")
	public void user_enters_the_username(String usernam) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usernam);
		
	   	}

	@Given("user enters the password  {string}")
	public void user_enters_the_password(String passwod) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passwod);
	    	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
	    }

	
@Then("user shd be logged in to dashboard")
public void user_shd_be_logged_in_to_dashboard() {
	boolean status=driver.findElement(By.linkText("Dashboard")).isDisplayed();
    Assert.assertTrue(status);
    System.out.println(status);
    driver.quit();

    }




}
