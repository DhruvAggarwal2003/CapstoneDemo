package utility;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class TakeScreenshot extends capstonelog4j
{
	public static WebDriver driver;
	
	public static void generateScreenshot(String fname) throws IOException
	{
		File scrFile;
		scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("C:\\Users\\Administrator\\Desktop\\Selenium\\DemoCapstone\\Screenshots\\" + fname +  ".jpeg"));
		
	}
}