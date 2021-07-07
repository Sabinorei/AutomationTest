package com.example;

import org.openqa.selenium.support.PageFactory;
import org.picocontainer.annotations.Inject;

import java.util.concurrent.TimeUnit;

public abstract class PageObject {

	private final WebDriverFactory webDriverFactory;
	
	public PageObject(WebDriverFactory webDriverFactory) {
		this.webDriverFactory = webDriverFactory;
		
		PageFactory.initElements(this.webDriverFactory.getWebDriver(), this);
		
		webDriverFactory.getWebDriver()
				.manage().timeouts()
				.implicitlyWait(15L, TimeUnit.SECONDS);
	}
}
