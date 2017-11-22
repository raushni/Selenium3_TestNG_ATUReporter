package com.Test.ConFusion;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.PageObject.ConFusion.JobListing;
import com.SetUp.ConFusion.BrowserSetup;

import atu.testng.reports.ATUReports;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;
import atu.testrecorder.exceptions.ATUTestRecorderException;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class,	MethodListener.class })
public class JobListingTest {
	public static WebDriver driver; 
	 
	  {
			System.setProperty("atu.reporter.config", "D:\\Raushni\\Projects\\IBM Talent Frameworks\\Demo Project_Testng_ATU\\Demo_Confusion\\atu.properties");
			
		}	
	
	@BeforeSuite
	public static void Browser(){
		BrowserSetup browse = new BrowserSetup();
		driver = browse.launchBrowser();
		
	}
	/*@BeforeSuite
	public static void ATUReporter() throws AWTException, IOException, InterruptedException {
		ATUReporter report = new ATUReporter();
		driver=report.SetAuthorInfoForReports();
		driver=report.SetIndexPageDescription();
		}*/
	
	@Test
	public void createjobwithValidDetails() throws InterruptedException, ATUTestRecorderException
	{
		//ATUTestRecorder recorder = new ATUTestRecorder("D:\\Raushni","filename",false);
		//recorder.start(); 
		System.out.println("*******************Test*************************");
		JobListing joblisting=new JobListing(driver);
		String newrecord="test001";
		joblisting.JobListingPage(driver).click();
		Thread.sleep(10000);
		joblisting.Add(driver).click();
		joblisting.Id(driver).sendKeys("ID001");
		joblisting.FullName(driver).sendKeys("testuser 001");		
		joblisting.Username(driver).sendKeys(newrecord);
		joblisting.Email(driver).sendKeys("test001@mail.com");
		joblisting.ContactDetail(driver).sendKeys("12345");
		joblisting.Create(driver).click();
		String usernamelisted=joblisting.usernameListed(driver).getText();
		Assert.assertEquals(usernamelisted, newrecord);
		ATUReports.add("Verify that user can add a record",newrecord,"new record should be saved and displayed",usernamelisted, LogAs.PASSED,new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		//ATUReports.add("Verify can add a job", "user should be able to add a job", "user adds job", true);
	//recorder.stop();
				
	}

	@SuppressWarnings("deprecation")
	@Test
	public void EditjobDetails() throws InterruptedException
	{
		JobListing joblisting=new JobListing(driver);
		ATUReports.add("user clicks edit", true);
		joblisting.Edit().click();
		//ATUReports.add("Verify that user can edit a record", LogAs.FAILED,new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			
	}
	
	@AfterSuite
     public void terminateBrowser(){
		 driver.quit();
     }
		
	}


