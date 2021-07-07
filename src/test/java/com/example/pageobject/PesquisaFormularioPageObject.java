package com.example.pageobject;

import com.example.PageObject;
import com.example.WebDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PesquisaFormularioPageObject extends PageObject {
	
	public PesquisaFormularioPageObject(WebDriverFactory webDriverFactory) {
		super(webDriverFactory);
	}
	
	@FindBy(id = "nf-field-5")
	private WebElement nome;

	@FindBy(id = "nf-field-6")
	private WebElement sobrenome;

	@FindBy(id = "nf-field-7")
	private WebElement email;

	@FindBy(id = "nf-field-8")
	private WebElement confirmacaoEmail;

	@FindBy(id = "nf-field-17")
	private WebElement telefone;

	@FindBy(id = "nf-label-class-field-11-0")
	private WebElement idadeTrintaEUmAteQuarentaNove;;

	@FindBy(id = "nf-field-11")
	private WebElement quantoTempoEstaNaArea;;

	@FindBy(id = "nf-field-12")
	private WebElement atraiuArea;;

	@FindBy(id = "nf-label-class-field-13-0")
	private WebElement precisaMelhorarTecnico;

	@FindBy(id = "nf-field-14")
	private WebElement liguagemInteressa;
	
	@FindBy(id = "nf-field-16")
	private WebElement enviar;
	
	public void preencherFormularioObrigatorio() {
		nome.sendKeys("Reinaldo");
		sobrenome.sendKeys("Alves Sabino");
		
		email.sendKeys("reisabino@hotmail.com");
		confirmacaoEmail.sendKeys("reisabino@hotmail.com");
		
		telefone.sendKeys("19998246565");

		idadeTrintaEUmAteQuarentaNove.click();
		
		new Select(quantoTempoEstaNaArea).selectByIndex(0);
		new Select(atraiuArea).selectByIndex(0);
		
		precisaMelhorarTecnico.click();
		
		liguagemInteressa.sendKeys("Java");
		
		enviar.click();
	}
}
