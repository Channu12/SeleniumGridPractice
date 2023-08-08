package com.practce;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Param {
	WebDriver driver = null;
	@Parameters("BROWSER")
	@Test
	public void launchBrowser(String BROWSER) {
		if(Objects.isNull(BROWSER))
		{
			BROWSER=System.getProperty("BROWSER","DEFAULT MESSAGE");
		}
		System.out.println(BROWSER);
		if (BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.close();
		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.close();
		}
	}
}
