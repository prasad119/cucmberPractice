package cucu;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testts {
	WebDriver driver = null;
	@Given("^Launch Gmail Home page$")
	public void launch_Gmail_Home_page(){
		try{
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.navigate().to("http://www.gmail.com/");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@When("^Enter username and password$")
	public void enter_username_and_password(){
		try{
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("119niki");
			driver.findElement(By.xpath("//input[@id='next']")).click();
			driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("xyz");
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

	@Then("^Click on signIn button$")
	public void click_on_signIn_button(){
		try{
			driver.findElement(By.xpath("//input[@id='signIn']")).click();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

	@Then("^Logout from Gmail$")
	public void logout_from_Gmail(){
		try{		
			driver.findElement(By.xpath("//a[contains(@title,'(119niki@gmail.com)')]/..//span")).click();
			driver.findElement(By.xpath("//a[text()='Sign out']")).click();
			driver.close();
			driver.quit();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
}
