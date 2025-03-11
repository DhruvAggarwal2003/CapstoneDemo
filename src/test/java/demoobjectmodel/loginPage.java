package demoobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	WebDriver driver;
	WebElement loginpage;
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickloginpage() throws InterruptedException {
		driver.findElement(By.linkText("Page Object Model")).click();
		Thread.sleep(2000);
		loginpage = driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/div[1]/div[2]/app-cartvalue/button[2]"));
		loginpage.click();
		Thread.sleep(2000);
		
		
	}

}
