package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import demoobjectmodel.homePage;
import demoobjectmodel.productPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.ReportGenerator;

public class Tc3 extends ReportGenerator {
	WebDriver driver;
	@Given("the user is on the products page")
	public void the_user_is_on_the_products_page() throws InterruptedException {
		
		driver = new EdgeDriver();
	    driver.get("http://letcode.in");
		System.out.println("Main Page Appears");
		test = extent.startTest("Test3");
	    Thread.sleep(2000);
	    writeLog("Browser launched");
	}
	@When("the user clicks the Add to Cart button for a product")
	public void the_user_clicks_the_Add_to_Cart_button_for_a_product() throws InterruptedException {
		homePage home = new homePage(driver);
		home.clickWorkSpace();
		writeLog("User is in the homePage");
		Thread.sleep(2000);
		productPage product = new productPage(driver);
		product.clickOnProductsPage();
		writeLog("User is in the productPage");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='card-footer-item button is-link is-fullwidth']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='button is-primary mt-4']")).click();
		Thread.sleep(2000);
	}
	@Then("the product should be added to the cart")
	public void the_product_should_be_added_to_the_cart() {
		  System.out.print("Closing the application");
		  driver.quit();
		  writeLog("Browser closed");
	}
	
	
}
