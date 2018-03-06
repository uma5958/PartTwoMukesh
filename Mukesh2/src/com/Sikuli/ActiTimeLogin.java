package com.Sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ActiTimeLogin {

	public static void main(String[] args) throws Exception {
		Screen scr=new Screen();
		Pattern img1=new Pattern("E:\\STS\\jars\\Sikuli_ActiTime\\un.PNG");
		Pattern img2=new Pattern("E:\\STS\\jars\\Sikuli_ActiTime\\pw.PNG");
		Pattern img3=new Pattern("E:\\STS\\jars\\Sikuli_ActiTime\\login.PNG");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		
		scr.wait(img1, 10);

		scr.type(img1, "admin");
		scr.type(img2, "manager");
		scr.click(img3);
		
		driver.quit();
	}

}
