package com.practce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Param {
	WebDriver driver = null;

	@Test
	public void launchBrowser() {
		String BROWSER = System.getProperty("BROWSER", "DEFAULT Value");
		String Message = System.getProperty("Message", "DEFAULT Message");
		
		System.out.println(BROWSER);
		if (BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://www.facebook.com");
			driver.close();
			System.out.println(Message);
		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.close();
			System.out.println(Message);
		}
	}
} 
