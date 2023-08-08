package com.practce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Param {

	@Parameters("BROWSER")
	@Test
	public void launchBrowser(String BROWSER)
	{
		if (BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		} else {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
		}
	}
}