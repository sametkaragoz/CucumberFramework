package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @When("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }


    @And("nutella icin arama yapar")
    public void nutellaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }


    @And("sonucun nutella icerdigini test eder")
    public void sonucunNutellaIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("Nutella"));
    }

    @Then("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("java icin arama yapar")
    public void java_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }

    @And("sonucun java icerdigini test eder")
    public void sonucun_java_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("Java"));
    }

    @And("ipad icin arama yapar")
    public void ipad_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("ipad" + Keys.ENTER);
    }

    @And("sonucun ipad icerdigini test eder")
    public void sonucun_ipad_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("ipad"));
    }

    @And("{string} icin arama yapar")
    public void icinAramaYapar(String arananKelime) {

        amazonPage.aramaKutusu.sendKeys(arananKelime + Keys.ENTER);
    }

    @Then("sonucun {string} icerdigini test eder")
    public void sonucunIcerdiginiTestEder(String arananKelime) {

        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains(arananKelime));
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String istenenUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("sonuc sayisini yazdirir")
    public void sonucSayisiniYazdirir() {
        System.out.println(amazonPage.sonucYazisiElementi.getText());
    }

    @Then("basligin {string} icerdigini test eder")
    public void basliginIcerdiginiTestEder(String arananKelime) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arananKelime));
    }
}
