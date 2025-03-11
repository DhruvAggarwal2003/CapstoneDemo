package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import demoobjectmodel.coursePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.capstonelog4j;

public class tc2 extends capstonelog4j {
	WebDriver driver;
	@Given("The user is on the courses page")
	public void the_user_is_on_the_courses_page() {
		driver = new EdgeDriver();	
		driver.get("https://letcode.in/");
		writeLog("Browser launched");
	}
	@When("The user views the list of available courses")
	public void the_user_views_the_list_of_available_courses() {
		coursePage course = new coursePage(driver);
		course.ClickCoursepage();
		writeLog("User is in the coursePage");
		List<WebElement> links = driver.findElements(By.linkText("View Course"));
		System.out.println(links.size());
		writeLog("User gets the number of courses available");
		driver.quit();
	   
	}
	@Then("The total number of displayed courses should be correct")
	public void the_total_number_of_displayed_courses_should_be_correct() {
	   driver.quit();
	   writeLog("Closing browser");
	}
	


}
