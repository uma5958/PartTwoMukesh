package com.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	WebDriver driver;
	@BeforeClass
	public void SetupApplication() {
		Reporter.log("===Browser Session Strted===", true);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		Reporter.log("===Application Started===", true);
	}
	@AfterClass
	public void closeApplication() {
		driver.quit();
		Reporter.log("===Browser Session End===", true);
	}
}
