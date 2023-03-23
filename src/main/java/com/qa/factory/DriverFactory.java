package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
			
	public WebDriver init_driver(String browser) {
		
		System.out.println("browser value is:" + browser);
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			//tlDriver.set(new ChromeDriver());
//			ChromeOptions options = new ChromeOptions();
//			options.setHeadless(true);
//			options.addArguments("--no-sandbox");
//			options.addArguments("--disable-dev-shm-usage");
//			options.addArguments("--window-size=1920,1080");
//			options.addArguments("--start-maximized");
//			tlDriver.set(new ChromeDriver(options));
			tlDriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PRATIM\\eclipse-workspace\\RBG_Hybrid\\RBG_Hybrid\\Drivers\\geckodriver.exe");	
		driver = new FirefoxDriver();
		//WebDriverManager.firefoxdriver().setup();
		tlDriver.set(new FirefoxDriver());
		}
		else {
		  System.out.println("Please pass the correct browser value: " + browser);	
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}		
	
	
	public static WebDriver getDriver() {
		return tlDriver.get();
	}
}
