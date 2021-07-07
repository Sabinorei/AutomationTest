package com.example.stepdefs;

import com.example.WebDriverFactory;
import com.example.pageobject.MensagemPageObject;
import com.example.pageobject.PaginaInicialPageObject;
import com.example.pageobject.PesquisaFormularioPageObject;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class PesquisaQAStepdefs {
	
	private final WebDriverFactory webDriverFactory;
	private final PaginaInicialPageObject paginaInicialPageObject;
	private final PesquisaFormularioPageObject pesquisaFormularioPageObject;
	private final MensagemPageObject mensagemPageObject;
	
	public PesquisaQAStepdefs(WebDriverFactory webDriverFactory,
	                          PaginaInicialPageObject paginaInicialPageObject,
	                          PesquisaFormularioPageObject pesquisaFormularioPageObject,
	                          MensagemPageObject mensagemPageObject) {
		this.webDriverFactory = webDriverFactory;
		this.paginaInicialPageObject = paginaInicialPageObject;
		this.pesquisaFormularioPageObject = pesquisaFormularioPageObject;
		this.mensagemPageObject = mensagemPageObject;
	}
	
	@Dado("que eu acesse a página da VV Test")
	public void acessarPagina() {
		webDriverFactory.getWebDriver()
				.navigate().to("https://bit.ly/3jOMrR9");
	}
	
	@E("acesse o menu {string}")
	public void escolherOpcaMenu(String opcao) {
		paginaInicialPageObject.escolhePagina(opcao);
	}
	
	@Quando("eu preencher todos os campos obrigatórios")
	public void preencherCamposObrigatorios() {
		pesquisaFormularioPageObject.preencherFormularioObrigatorio();
	}
	
	@Então("deve ser direcionado para uma página de sucesso")
	public void deveDirecionarPaginaSucesso() {
		Assert.assertTrue(mensagemPageObject.mensagemExibida());
	}
}
