package com.technocredits.orghrm.pages;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.technocredits.orghrm.base.PredefinedActions;

public class HomePage extends PredefinedActions {
	
	public boolean isWelcomeMessageDisplayed() {		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement welcome = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Welcome")));
		return welcome.isDisplayed();
	}

	public boolean isDashboardSelectedAsDefaultMenu() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement ele = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//li[@class='current main-menu-first-level-list-item']")));
		String attValue = ele.getAttribute("class");
		return attValue.startsWith("current") ? true : false;
	}
	
	public List<String> getVisibleMenuList() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElements(
				driver.findElements(By.xpath("//ul[@id='mainMenuFirstLevelUnorderedList']/li"))));
		
		List<String> menuTextList = new ArrayList<String>();
		for(WebElement element : list) {
			menuTextList.add(element.getText());
		}
		return menuTextList;
	}
}
