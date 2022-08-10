package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.Homepage2;
import utilities.Driver;

public class US_028StepDefinitions {

    Homepage2 homepage2=new Homepage2();
Actions actions=new Actions(Driver.getDriver());

    @Then("ZItems Titles e tiklanir  Country secilir")
    public void zItemsTitlesETiklanirCountrySecilir() {
        homepage2.ZitemButtonu.click();
        homepage2.Zcountry.click();
    }

    @And("ZCreate a new country tiklanir Name ve Created Date  doldurulur")
    public void zcreateANewCountryTiklanirNameVeCreatedDateDoldurulur() {

         homepage2.createANewCountry.click();
        homepage2.ZnameCountry.sendKeys("Okyanusya");

         homepage2.Zsave.click();

    }

    @Then("ZYeni country olusturuldugu dogrulanir")
    public void zyeniCountryOlusturulduguDogrulanir() {

    }



    @And("ZItems Titles e tiklanir  StateCity secilir")
    public void zıtemsTitlesETiklanirStateCitySecilir() {
        homepage2.ZitemButtonu.click();
        homepage2.Zstate.click();
    }

    @And("ZCreate a new StateCity tiklanir Name Created Date ve StateCity doldurulur  Save tiklanir")
    public void zcreateANewStateCityTiklanirNameCreatedDateVeStateCityDoldurulurSaveTiklanir() {
        homepage2.ZcreateState.click();
       homepage2.ZStateName.sendKeys("deniz");
       //
       homepage2.ZStateCountry.sendKeys("Okyanusya");
       homepage2.Zsave.click();
    }

    @And("ZStateCity  olusturuldugu dogrulanir")
    public void zstatecityOlusturulduguDogrulanir() {

    }

    @And("ZKullanici delete tiklar country siler")
    public void zkullaniciDeleteTiklarCountrySiler() {
        homepage2.ZDelete.click();
        homepage2.ZDeleteButtonu.click();
    }
}
