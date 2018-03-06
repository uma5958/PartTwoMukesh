package com.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestChromeOnGrid {
	@Test 
	public void Test1() throws MalformedURLException {
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WINDOWS);
		URL url=new URL("http://localhost:4445/wd/hub"); 
		WebDriver driver=new RemoteWebDriver(url, cap);
		driver.get("http://learn-automation.com");
		System.out.println("Title is: "+driver.getTitle());
		driver.quit();
	}
}
