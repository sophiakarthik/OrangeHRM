package stepDefinitionFiles;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
//import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//it is not working
public class login_viaDataTable_withouHeader {
	WebDriver driver;
	@Given("you are on login page")
	public void you_are_on_login_page() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	   	}

@When("you enter the usernam and passwrd")
public void you_enter_the_usernam_and_passwrd(DataTable dataTable) {
	List<String> credentials= dataTable.asList(String.class); 
	String usernam=credentials.get(0);
	String passwod=credentials.get(1);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usernam);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passwod);
   
    }


		@When("you clicks the login button")
	public void you_clicks_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);

	   	}

	@Then("you should be logged in to dashboard")
	public void you_should_be_logged_in_to_dashboard() {
		boolean status=driver.findElement(By.linkText("Dashboard")).isDisplayed();
	    Assert.assertTrue(status);
	    System.out.println(status);
	    driver.quit();

	   	}


}
