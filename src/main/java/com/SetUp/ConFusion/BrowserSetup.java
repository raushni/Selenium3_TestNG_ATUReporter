package com.SetUp.ConFusion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Listeners;

import atu.testng.reports.ATUReports;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import atu.testng.reports.utils.Utils;
@Listeners({ ATUReportsListener.class, ConfigurationListener.class,	MethodListener.class })
public class BrowserSetup {
	
	
	
  public String baseUrl="http://10.51.236.53:4200";
	 

  public WebDriver launchBrowser() {
	  System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	 	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		FirefoxDriver driver= new FirefoxDriver(capabilities);	
		ATUReports.setWebDriver(driver);
		driver.get(baseUrl);
		ATUReports.setAuthorInfo("Automation Tester", Utils.getCurrentTime(), "1.0");
		ATUReports.indexPageDescription = "PROJECT <br/> <b> TEST REPORT STATUS</b>";
		return driver;
  }

}
