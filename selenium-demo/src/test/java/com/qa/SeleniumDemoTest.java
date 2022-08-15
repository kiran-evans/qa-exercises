package com.qa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDemoTest {
	
	private RemoteWebDriver driver;
	
	@BeforeEach
	void setup() {
		this.driver = new EdgeDriver();
		this.driver.manage().window().maximize();
	}
	
	@Test
	void demoTest() {
		this.driver.get("http://automationpractice.com/index.php");
		
		WebElement search = this.driver.findElement(By.cssSelector("#search_query_top")); // Find search bar
		search.sendKeys("dress");
		search.sendKeys(Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
		WebElement result = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#center_column > ul > li:nth-child(1) > div > div.right-block > h5 > a")));
		
		assertEquals("Printed Summer Dress", result.getText());
	}
	
	@AfterEach
	void tearDown() {
		this.driver.close();
	}
}
