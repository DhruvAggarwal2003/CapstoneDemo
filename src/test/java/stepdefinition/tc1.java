package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import demoobjectmodel.homePage;
import demoobjectmodel.loginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.ReportGenerator;
import utility.TakeScreenshot;

public class tc1 extends ReportGenerator {
	WebDriver driver;

    @Before
    public void setup() {
        driver = new EdgeDriver();
        driver.get("https://letcode.in/");
        TakeScreenshot.driver = driver;
        
        if (extent == null) {
            extent = new ExtentReports("C:\\Users\\Administrator\\Desktop\\Selenium\\DemoCapstone\\TestReports\\testreport.html", true);
        
        }
        
        test = extent.startTest("Test1");
        test.log(LogStatus.INFO, "Browser opened and navigated to LetCode login page");
    }
	@Given("I open the LetCode login page")
	public void i_open_the_let_code_login_page() throws InterruptedException {
		
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
        driver.findElement(By.xpath("//button[@class='button is-primary']")).click();
      	Thread.sleep(2000);
        test.log(LogStatus.INFO, "User entered credentials and clicked login");
	}
	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() throws IOException {
		 try {
	            Assert.assertTrue(driver.getCurrentUrl().contains("https://letcode.in/home"), "Login failed");
	            test.log(LogStatus.PASS, "User successfully logged in");
	        } catch (AssertionError e) {
	            test.log(LogStatus.FAIL, "Login failed");
	            generateScreenshot("LoginFailure");
	            test.log(LogStatus.FAIL, "Screenshot captured for failure");
	            throw e;
	        }
	    }

	    @After
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	            test.log(LogStatus.INFO, "Browser closed");
	        }
	        extent.endTest(test);
	        extent.flush();
	    }
	
}
