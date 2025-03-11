package demoobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class coursePage {
	WebDriver driver;
	WebElement course;
	
	public coursePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void ClickCoursepage() {
		course = driver.findElement(By.linkText("Courses"));
		course.click();
	}
}
