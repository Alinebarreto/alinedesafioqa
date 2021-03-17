package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobjects.HomePage;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.containsString;


public class HomePageSteps {

    public WebDriver driver;
    public HomePageSteps() {
        driver = Hooks.driver;
    }
    private pageobjects.HomePage homePage = new pageobjects.HomePage(Hooks.driver);

    String tituloHomePage = "Estratégia Concursos | Cursos Online para Concursos";


    @Given("^que eu acesse a home da estrategia concursos$")
    public void queEuAcesseAHomeDaEstrategiaConcursos() {
        homePage.loadPage();
        String titulo = homePage.getPageTitle();
        Assert.assertEquals(tituloHomePage, titulo);
    }

    @And("^pesquiso na secao Por Professor por Ena Loiola$")
    public void pesquisoNaSecaoPorProfessorPorEnaLoiola() {

        homePage.clicarEPesquisarTermo();
    }


//    @When("^eu acessor o detalhe do primeiro curso na lista de resultados$")
//    public void euAcessorODetalheDoPrimeiroCursoNaListaDeResultados() {
//
//    }
//
//    @Then("^a página de detalhes do curso e exibida$")
//    public void aPáginaDeDetalhesDoCursoEExibida() {
//
//    }
//
//    @And("^o valor a vista exibido do curso é equivalente ao resultado do parcelamento e ao valor da lista de resultados$")
//    public void oValorAVistaExibidoDoCursoÉEquivalenteAoResultadoDoParcelamentoEAoValorDaListaDeResultados() {
//
//    }
//
//    @When("^pesquiso no campo busca da home por teste$")
//    public void pesquisoNoCampoBuscaDaHomePorTeste() {
//
//    }
//
//    @Then("^retorna (\\d+) resultado com o curso Pacote Completo p/ Teste Preparatório ANPAD \\(Orientação Acadêmica\\) - (\\d+)$")
//    public void retornaResultadoComOCursoPacoteCompletoPTestePreparatórioANPADOrientaçãoAcadêmica(int arg0, int arg1) {
//
//    }
//
//    @And("^pesquiso na secao Por Região$")
//    public void pesquisoNaSecaoPorRegião() {
//
//    }
//
//    @When("^eu acessor a opção Minas Gerais$")
//    public void euAcessorAOpçãoMinasGerais() {
//
//    }
//
//    @Then("^Cursos em Minas Gerais são exibidos$")
//    public void cursosEmMinasGeraisSãoExibidos() {
//    }
}