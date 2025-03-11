package demoobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	WebDriver driver;
	WebElement Workspace;
	
	public homePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickWorkSpace() {
		Workspace = driver.findElement(By.linkText("Work-Space"));
		Workspace.click();
	}

}
