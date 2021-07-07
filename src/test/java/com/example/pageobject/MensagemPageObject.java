package com.example.pageobject;

import com.example.PageObject;
import com.example.WebDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class MensagemPageObject extends PageObject {
	
	public MensagemPageObject(WebDriverFactory webDriverFactory) {
		super(webDriverFactory);
	}
	
	@FindBy(className = "nf-response-msg")
	private WebElement mensagem;
	
	public boolean mensagemExibida() {
		return new FluentWait<>(mensagem)
				.withTimeout(Duration.ofSeconds(20))
				.until(WebElement::isDisplayed);
	}
}
