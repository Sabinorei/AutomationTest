package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;
import java.util.Optional;

public class WebDriverFactory {
	
	private WebDriver webDriver;
	
	public WebDriver getWebDriver() {
		return webDriver;
	}
	
	public void initWebDriver() {
		String path = Optional.ofNullable(WebDriverFactory.class.getClassLoader())
				.map(classLoader -> classLoader.getResource("chromedriver_91.exe"))
				.map(URL::getPath)
				.orElseThrow(() -> new RuntimeException("Arquivo do driver não encontrado."));
		
		System.setProperty("webdriver.chrome.driver", path);
		
		webDriver = new ChromeDriver();
	}
}
