package com.example.hook;

import com.example.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.Optional;

public class WebDriverHook {
	
	private final WebDriverFactory webDriverFactory;
	
	public WebDriverHook(WebDriverFactory webDriverFactory) {
		this.webDriverFactory = webDriverFactory;
	}
	
	@Before
	public void startDriver() {
		webDriverFactory.initWebDriver();
	}
	
	@After
	public void closeDriver() {
		Optional.ofNullable(webDriverFactory.getWebDriver())
				.ifPresent(driver -> {
					driver.close();
					driver.quit();
				});
	}
}
