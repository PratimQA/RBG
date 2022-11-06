package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DashboardPage {

	private WebDriver driver;
	
	private By add_dropdown = By.xpath("//div[@class='widgetContent']//div[1]//div[1]//div[1]//div[2]");
	private By add_rvn_month = By.xpath("select[name='Additional Revenue']");
	
	public DashboardPage(WebDriver ldriver) {
      this.driver = ldriver;
     	
	}

	
	public String getDashPageTitle() throws InterruptedException {
		Thread.sleep(10000);
		return driver.getTitle();
	}
	
	
	public void selectMonthadd_rvn() {
		driver.findElement(add_dropdown).click();
		Select objSelect = new Select(driver.findElement(add_rvn_month));
		//objSelect.selectByVisibleText("August");
		objSelect.selectByValue("August");
	}
	
}
