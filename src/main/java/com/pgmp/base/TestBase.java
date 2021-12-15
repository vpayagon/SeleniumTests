package com.pgmp.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import SeleniumTests.SeleniumTests.HomePage;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	
	public static void initialization() {
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "./src/main/java/com/pgmp/resources/chromedriver.exe");
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		caps.setCapability("acceptInsecureCerts", true);
		driver = new ChromeDriver(caps);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

}
