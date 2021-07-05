package com.technocredits.orghrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredefinedActions {

	static protected WebDriver driver;

	public static void start() {
		start("https://madhavikhasbage-trials71.orangehrmlive.com/auth/login", "Admin", "X@8yaTRn8R");
	}

	public static void start(String url, String username, String password) {
		System.getProperty("wedriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	static public void tearDown() {
		driver.close();
	}
}
