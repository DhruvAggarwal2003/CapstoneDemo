package demoobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productPage {
WebDriver driver;
WebElement products;

public productPage(WebDriver driver) {
	this.driver = driver;
}

public void clickOnProductsPage(){
	products = driver.findElement(By.linkText("Page Object Model"));
	products.click();
}
}


