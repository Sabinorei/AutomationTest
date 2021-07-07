package com.example.pageobject;

import com.example.PageObject;
import com.example.WebDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaginaInicialPageObject extends PageObject {
	
	public PaginaInicialPageObject(WebDriverFactory webDriverFactory) {
		super(webDriverFactory);
	}
	
	@FindBy(id = "menu-item-226")
	private WebElement pesquisaQa;
	
	public void escolhePagina(String nome) {
		switch (nome) {
			case "Pesquisa - QA":
				pesquisaQa.click();
				break;
			default:
				throw new IllegalArgumentException("Opção " + nome + " indisponível no momento.");
		}
	}
}
