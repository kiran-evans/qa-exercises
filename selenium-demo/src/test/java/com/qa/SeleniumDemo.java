package com.qa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumDemo {
	
	private RemoteWebDriver driver;
	
	@BeforeEach
	void setup() {
		this.driver = new ChromeDriver();
	}
	
	@Test
	void demoTest() {
		this.driver.get("http://automationpractice.com/index.php");
		
		WebElement search = this.driver.findElement(By.cssSelector("#search_query_top")); // Find search bar
		search.sendKeys("dress");
		search.sendKeys(Keys.ENTER);
		
		WebElement result = this.driver.findElement(By.cssSelector("#center_column > ul > li:nth-child(1) > div > div.right-block > h5 > a"));
		
		assertEquals("Printed Summer Dress", result.getText());
	}
	
	@AfterEach
	void tearDown() {
		this.driver.close();
	}
}
