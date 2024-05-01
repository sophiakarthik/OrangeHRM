package stepDefinitionFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_withExample {
	WebDriver driver;
	@Given("user z in login page")
	public void user_z_in_login_page() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);


	    
	}

	@Given("user enter the username  {string} and password {string}")
	public void user_enter_the_username_and_password(String Username, String Password) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
	   

	   	}

	@When("user click on the login button")
	public void user_click_on_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
	    }
	   
	

	@Then("user shd be loggd in to dashboard")
	public void user_shd_be_loggd_in_to_dashboard() {
		
	    	}

}
