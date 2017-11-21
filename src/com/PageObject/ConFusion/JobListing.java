package com.PageObject.ConFusion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
@Listeners({ ATUReportsListener.class, ConfigurationListener.class,	MethodListener.class })
public class JobListing {
  	  
		
		protected WebDriver driver;
		public JobListing(WebDriver driver)	
		
			{
				this.driver=driver;
				
			}
		public WebElement JobListingPage(WebDriver driver)
		{
			return driver.findElement(By.xpath("/html/body/app-root/app-header/mat-toolbar/div/mat-toolbar-row/a[4]/span"));
		}
		
		public WebElement Add(WebDriver driver)
		{
			return driver.findElement(By.xpath("/html/body/app-root/app-joblisting/div/div[2]/basic-example-data/ng2-smart-table/table/thead/tr[2]/th[1]/a"));
		}
		
		public WebElement Id(WebDriver driver)
		{
			return driver.findElement(By.xpath("/html/body/app-root/app-joblisting/div/div[2]/basic-example-data/ng2-smart-table/table/thead/tr[3]/td[2]/ng2-smart-table-cell/table-cell-edit-mode/div/table-cell-default-editor/div/input-editor/input"));
		}
		public WebElement FullName(WebDriver driver)
		{
			return driver.findElement(By.xpath("/html/body/app-root/app-joblisting/div/div[2]/basic-example-data/ng2-smart-table/table/thead/tr[3]/td[3]/ng2-smart-table-cell/table-cell-edit-mode/div/table-cell-default-editor/div/input-editor/input"));
		}
		public WebElement Username(WebDriver driver)
		{
			return driver.findElement(By.xpath("/html/body/app-root/app-joblisting/div/div[2]/basic-example-data/ng2-smart-table/table/thead/tr[3]/td[4]/ng2-smart-table-cell/table-cell-edit-mode/div/table-cell-default-editor/div/input-editor/input"));
		}
		public WebElement Email(WebDriver driver)
		{
			return driver.findElement(By.xpath("/html/body/app-root/app-joblisting/div/div[2]/basic-example-data/ng2-smart-table/table/thead/tr[3]/td[5]/ng2-smart-table-cell/table-cell-edit-mode/div/table-cell-default-editor/div/input-editor/input"));
		}
		public WebElement ContactDetail(WebDriver driver)
		{
			return driver.findElement(By.xpath("//html/body/app-root/app-joblisting/div/div[2]/basic-example-data/ng2-smart-table/table/thead/tr[3]/td[6]/ng2-smart-table-cell/table-cell-edit-mode/div/table-cell-default-editor/div/input-editor/input"));
		}
		public WebElement Create(WebDriver driver)
		{
			return driver.findElement(By.xpath("/html/body/app-root/app-joblisting/div/div[2]/basic-example-data/ng2-smart-table/table/thead/tr[3]/td[1]/ng2-st-actions/a[1]"));
		}
		public WebElement usernameListed(WebDriver driver)
		{
			return driver.findElement(By.xpath("/html/body/app-root/app-joblisting/div/div[2]/basic-example-data/ng2-smart-table/table/tbody/tr[1]/td[4]/ng2-smart-table-cell/table-cell-view-mode/div/div"));
		}
			
		public WebElement Edit()
		{
			return driver.findElement(By.xpath("/html/body/app-root/app-joblisting/div/div[2]/basic-example-data/ng2-smart-table/table/tbody/tr[1]/td[1]/ng2-st-tbody-edit-delete/a[1]"));
		}	
		
  }

