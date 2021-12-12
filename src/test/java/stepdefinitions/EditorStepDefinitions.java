package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EditorPage;
import utilities.Driver;

public class EditorStepDefinitions {

    EditorPage editorPage = new EditorPage();
    Actions actions = new Actions(Driver.getDriver());

    @Then("new butonuna basar")
    public void new_butonuna_basar() {

    }

    @And("editor firstname kutusuna {string} bilgileri girer")
    public void editor_firstname_kutusuna_bilgileri_girer(String string) {

    }

    @And("editor lastname kutusuna {string} bilgileri girer")
    public void editor_lastname_kutusuna_bilgileri_girer(String string) {

    }

    @And("editor position kutusuna {string} bilgileri girer")
    public void editor_position_kutusuna_bilgileri_girer(String string) {

    }

    @And("editor office kutusuna {string} bilgileri girer")
    public void editor_office_kutusuna_bilgileri_girer(String string) {

    }

    @And("editor extension kutusuna {string} bilgileri girer")
    public void editor_extension_kutusuna_bilgileri_girer(String string) {

    }

    @And("editor startdate kutusuna {string} bilgileri girer")
    public void editor_startdate_kutusuna_bilgileri_girer(String string) {

    }

    @And("editor salary kutusuna {string} bilgileri girer")
    public void editor_salary_kutusuna_bilgileri_girer(String string) {

    }

    @And("Create tusuna basar")
    public void create_tusuna_basar() {

    }

    @And("ilgili kutulara {string}  {string}  {string}  {string}  {string} {string} {string} bilgilerini girer")
    public void ilgiliKutularaBilgileriniGirer(String firstname, String lastName, String position, String office, String extension, String startDate, String salary) {

        actions.
                sendKeys(firstname).
                sendKeys(Keys.TAB).
                sendKeys(lastName).
                sendKeys(Keys.TAB).
                sendKeys(position).
                sendKeys(Keys.TAB).
                sendKeys(office).
                sendKeys(Keys.TAB).
                sendKeys(extension).
                sendKeys(Keys.TAB).
                sendKeys(startDate).
                sendKeys(Keys.TAB).
                sendKeys(salary).
                click(editorPage.createButton).perform();


    }

    @Then("{string} ve {string} girerek kaydin tamamlandigini test eder")
    public void veGirerekKaydinTamamlandiginiTestEder(String firstname, String lastname) throws InterruptedException {

        Thread.sleep(2000);
        editorPage.searchKutusu.click();
        editorPage.searchKutusu.sendKeys(firstname + "     " + lastname + "dfdfdd");
        Assert.assertTrue(editorPage.isimAramaIlkSatir.isDisplayed());

    }
}
