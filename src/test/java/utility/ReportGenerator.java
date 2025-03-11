package utility;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportGenerator extends TakeScreenshot
{
	
	public static ExtentReports extent;
    public static ExtentTest test;  
    
  @AfterMethod
  public void getResult(ITestResult result) throws IOException
  {
      if(result.getStatus() == ITestResult.FAILURE)
      {
          test.log(LogStatus.FAIL, "Test is failed");
          generateScreenshot(result.getName().toString());        
      }
      else if(result.getStatus() == ITestResult.SUCCESS)
      {
          test.log(LogStatus.PASS, "Test is pass");
      }
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	 
	  extent = new ExtentReports ("C:\\Users\\Administrator\\Desktop\\Selenium\\DemoCapstone\\TestReports\\\\testreport.html", true);
  }

  @AfterSuite
  public void afterSuite() 
  {
	  extent.flush();
	  driver.quit();
  }
}