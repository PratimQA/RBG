package com.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AppointmentPage {

	
	private WebDriver driver;


	// 1. By Locators: OR
	private By appoi_menu = By.xpath("//span[normalize-space()='Appointment']");
	private By create = By.xpath("//span[normalize-space()='Create']");
    
	  //*locators for entering name either manually or direct from contact*//
	  private By contact_field = By.xpath("//input[@placeholder='Eg. Name']");
	  private By add_manually_label = By.xpath("//button[normalize-space()='+ Add Manually']");
      private By last_name = By.xpath("//input[@placeholder='Last Name']");
	  private By email = By.xpath("//input[@placeholder='Email']");
	  private By phone = By.xpath("//input[@placeholder='Eg. (555) 555-1234']"); //Enter phone number- 2016262025
	  private By save_contact = By.xpath("//button[normalize-space()='Save Contact']");
	  private By verify = By.xpath("//button[normalize-space()='Verify']");
    	
	private By datepicker = By.xpath("//input[@placeholder='mm/dd/yyyy']");
	private By from = By.xpath("//div[@id='fromParent']//input[@type='text']");
	private By to = By.xpath("//div[@id='toParent']//input[@type='text']");

	
	public AppointmentPage(WebDriver ldriver) {
	      this.driver = ldriver;
	     	
		}
	
}
