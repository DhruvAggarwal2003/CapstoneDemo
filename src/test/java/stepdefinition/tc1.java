package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import demoobjectmodel.homePage;
import demoobjectmodel.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.capstonelog4j;

public class tc1 extends capstonelog4j {
	WebDriver driver;
	@Given("I open the LetCode login page")
	public void i_open_the_let_code_login_page() throws InterruptedException {
		driver = new EdgeDriver();	
		driver.get("https://letcode.in/");
		Thread.sleep(2000);
		System.out.println("Login page");
		writeLog("Browser launched");
	}
	@When("I enter username {string} and I enter password {string} and I click on the login button")
	public void i_enter_username_and_i_enter_password_and_i_click_on_the_login_button(String uname, String password) throws InterruptedException {
		System.out.println("Enter the name and password");
		homePage home = new homePage(driver);
		home.clickWorkSpace();
		writeLog("User is in the homePage");
		Thread.sleep(2000);
		loginPage login = new loginPage(driver);
		login.clickloginpage();
		writeLog("User is in the loginPage");
		driver.findElement(By.xpath("//input[@class='input ng-untouched ng-pristine ng-valid']")).sendKeys(uname);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        writeLog("Entering the username and password");
        Thread.sleep(2000);
	}
	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
		System.out.println("Logged in successfully");
		driver.quit();
		writeLog("Browser Closed");
	}
	
}
