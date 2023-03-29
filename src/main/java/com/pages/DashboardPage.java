package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DashboardPage {

	private WebDriver driver;
	//private WebDriver driver2;
	
	private By add_rvn_month = By.xpath("//select[@name='Additional Revenue']");
	private By recc_rvn_month = By.xpath("//select[@name='Monthly Recurring Revenue Growth']");
	
	public DashboardPage(WebDriver ldriver) {
      this.driver = ldriver;
     	
	}

	
	public String getDashPageTitle() throws InterruptedException {
		Thread.sleep(10000);
		return driver.getTitle();
	}
	
	
	public void selectMonthrecc_rvn_grwth() throws InterruptedException {
		driver.findElement(recc_rvn_month).click();
		Thread.sleep(10000);
        Select objSelect = new Select(driver.findElement(recc_rvn_month));
		//objSelect.selectByVisibleText("August");
		objSelect.selectByValue("October");
	}
	
	
	public void selectMonthaddit_rvn() throws InterruptedException {
		driver.findElement(add_rvn_month).click();
		Thread.sleep(10000);
        Select objSelect = new Select(driver.findElement(add_rvn_month));
		//objSelect.selectByVisibleText("August");
		objSelect.selectByValue("October");
	}
	
	
	
	public GymDetailsPage visitgym() {
		return new GymDetailsPage(driver);
	}
	
	public ProductPage visitprod() {
		return new ProductPage(driver);
	}
    
	public ProgramPage visitprog() {
		return new ProgramPage(driver);
	}
	
	public AppointmentPage appointpage() {
		return new AppointmentPage(driver);
	} 
	
	
    public ContactsPage contactpage() {
    	return new ContactsPage(driver);
    }
	
}