package stepDefinitionFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

	  	}

	@Given("user enters the username")
	public void user_enters_the_username() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	    	}
//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input
	@Given("user enters the password")
	public void user_enters_the_password() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	   	}

	@When("users clicks on the login button")
	public void users_clicks_on_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
	    	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() {
		driver.quit();
	   	}



}
