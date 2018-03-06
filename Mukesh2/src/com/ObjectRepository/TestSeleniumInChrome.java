package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSeleniumInChrome {
	ConfigReader config;
	@BeforeTest
	public void setup() {
		config=new ConfigReader();
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		System.out.println("===Setup is Ready===");
	}
	@Test
	public void TestChrome() {
		System.out.println("===Test Started===");
		WebDriver driver=new ChromeDriver();
		driver.get(config.getApplicationUrl());
		driver.quit();
		System.out.println("===Test Closed===");
	}
}
