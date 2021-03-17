package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class HomePage extends BaseClass{

	public HomePage(WebDriver driver){
		super(driver);
	}

	By abaPorProfessor = By.xpath("//div/*[text()='Por professor']");
	By campoDePesquisa = By.cssSelector(".search input");
	By botaoNaoPopUp = By.cssSelector("#onesignal-slidedown-cancel-button");
	By primeiroItemDaListaDeDestaques = By.xpath("//*[text()='Promoção - Cursos para Concurso MPDFT']");


	String url = "https://www.estrategiaconcursos.com.br";
	public void loadPage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}

	public void negarNotificacao() {
		click(botaoNaoPopUp);
	}

	public void clicarNaAbaPorProfessorPelaHomePage() {
		negarNotificacao();
		clicarNaAbaPorProfessor();
	}

	public void clicarNaAbaPorProfessor() {
		click(abaPorProfessor);
		String tituloPorProfessor = "Cursos por professor | Estratégia Concursos";
		String titulo = getPageTitle();
		Assert.assertEquals(tituloPorProfessor, titulo);
	}

	public void pesquisarPorEnaLoiola() {
		String termo = "Ena Loiola";
		click(campoDePesquisa);
		setText(campoDePesquisa, termo);
		//isDisplayed(primeiroItemDaListaDeDestaques);
		acionarEnter(campoDePesquisa);
		acionarEnter(campoDePesquisa);
	}

	public void clicarEPesquisarTermo(){
		clicarNaAbaPorProfessorPelaHomePage();
		pesquisarPorEnaLoiola();
	}

	public String getPageTitle() {
		String titulo = driver.getTitle();
		return titulo;
	}


}