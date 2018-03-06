package com.BaseClass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginScript extends BaseClass {
	@Test (description="This TC will perform valid login")
	public void loginToApplication() throws Exception {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	}
	@Test (description="This TC will perform invalid login")
	public void loginToApplication1() throws Exception {
		driver.findElement(By.name("txtUsername")).sendKeys("admin1");
		driver.findElement(By.id("txtPassword")).sendKeys("admin2");
		driver.findElement(By.id("btnLogin")).click();
	}
}
