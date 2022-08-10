package stepdefinitions.UIStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AliYasindoctorsPage;
import pages.DoctorsPage;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_013_US_014StepDefinitions {

    DoctorsPage doctorsPage=new DoctorsPage();
    HomePage homePage=new HomePage();
    AliYasindoctorsPage doctorPage=new AliYasindoctorsPage();


    @When("Login ikonuna tiklar")
    public void login_ikonuna_tiklar() {
        homePage.ikonElement.click();
    }

    @When("Sign in sekmesine tiklar")
    public void sign_in_sekmesine_tiklar() { homePage.signInButtonElement.click();
    }
    @And("username girer")
    public void usernameGirer() {
        homePage.userNameBoxElement.sendKeys("doctorflower");
    }
    @And("password girer")
    public void passwordGirer() {
        homePage.passwordBoxElement.sendKeys("Gg17781903,.");
    }
    @And("sign in butonuna tiklar")
    public void signInButonunaTiklar() {
        homePage.signInGirisButtonElement.click();

    }
    @When("My pages sekmesine tiklar")
    public void my_pages_sekmesine_tiklar() { doctorsPage.myPagesButtonElement.click();

    }
    @When("My Appointments sekmesine tiklar")
    public void my_appointments_sekmesine_tiklar() {
        doctorsPage.myAppointmentsButtonElement.click();

    }
    @When("Test sonucunu görmek istedigi hastanin satirinda bulunan Edit butonuna tiklar")
    public void test_sonucunu_görmek_istedigi_hastanin_satirinda_bulunan_edit_butonuna_tiklar() {
        doctorPage.editButonu.click();

    }
    @When("Show Test Results butonuna tiklar")
    public void show_test_results_butonuna_tiklar() {
        doctorPage.showTestResultsButonu.click();
    }
    @When("doktor View Results butonuna tiklar")
    public void doktor_view_results_butonuna_tiklar() {
        doctorPage.viewResultsButonu.click();

    }
    @When("Test Resulsts sayfasinin acildigini gorur")
    public void test_resulsts_sayfasinin_acildigini_gorur() {
        Assert.assertTrue( doctorPage.testResultsYazisi.isDisplayed());
    }
    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) {   ReusableMethods.waitFor(saniye);}

    @And("Request Inpatient butonuna tiklar")
    public void requestInpatientButonunaTiklar() {
        doctorPage.requestInpatientButonu.click();
    }

    @And("In patients sayfasinda hastayi gorur")
    public void ınPatientsSayfasindaHastayiGorur() {
        String hasta=doctorPage.hastaninIsmi.getText();
        Assert.assertTrue( hasta.contains("aliko"));
    }

    @Then("duzenlemek istedigi hastanin satirindaki edit butonuna tiklar")
    public void duzenlemekIstedigiHastaninSatirindakiEditButonunaTiklar() {
        doctorPage.editButonu.click();

        
    }

    @And("My Inpatiens sekmesine tiklar")
    public void myInpatiensSekmesineTiklar() {
        doctorPage.MyInpatientsButonu.click();
        
    }

    @Then("Kutucuklardaki bilgileri gorur ve gunceller")
    public void kutucuklardakiBilgileriGorurVeGunceller() {
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(doctorPage.inPatientEditId).sendKeys("12345").perform();

    }
        


    @And("Guncelledigini dogrular")
    public void guncellediginiDogrular() {
    }

    @Then("Statusu gunceller")
    public void statusuGunceller() {
        Select select=new Select(doctorPage.statusBox);
        select.selectByIndex(1);
    }

    @Then("statusu guncelledigini dogrular")
    public void statusuGuncellediginiDogrular() {
        Select select=new Select(doctorPage.statusBox);
        List<WebElement> statusList=select.getOptions();
        String statusElementi=statusList.get(1).getText();
        Assert.assertTrue(statusElementi.contains("STAYING"));
    }
    @And("Room kutucugunu gunceller")
    public void roomKutucugunuGunceller() {
        Select select=new Select(doctorPage.roomBox);
        select.selectByIndex(1);  }

    @Then("room guncelledigini dogrular")
    public void roomGuncellediginiDogrular() {
        Select select=new Select(doctorPage.statusBox);
        List<WebElement> roomList=select.getOptions();
        String roomElementi=roomList.get(1).getText();
        Assert.assertTrue(roomElementi.contains("234405"));
    }
}

