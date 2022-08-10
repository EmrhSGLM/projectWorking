package stepdefinitions.UIStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US015Admin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_015StepDefinitions {
    US015Admin us015Admin=new US015Admin();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();
    public String firstname=faker.name().firstName();
    public String lastname=faker.name().lastName();

    @When("Yonetici url gider")
    public void yonetici_url_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
    }
    @When("Sign in ikonuna tiklar")
    public void sign_in_ikonuna_tiklar() {
        us015Admin.accountWebElement.click();
        us015Admin.singInWebElement.click();
    }
    @When("Yonetici username ve password bilgileri girer")
    public void yonetici_username_ve_password_bilgileri_girer() {
        us015Admin.usernameTextBox.click();
        us015Admin.usernameTextBox.sendKeys("Team88Admin");
        us015Admin.passwordTextBox.click();
        us015Admin.passwordTextBox.sendKeys("Batch44+");
    }
    @When("Sign in buttonuna tiklar")
    public void sign_in_buttonuna_tiklar() {
        us015Admin.singInButton.click();
    }
    @When("Items&Titles sekmesini tiklar")
    public void items_titles_sekmesini_tiklar() {
        us015Admin.itemsTitlesButtonu.click();
    }
    @Then("Patient secenegini secer ve tiklar")
    public void patient_secenegini_secer_ve_tiklar() {
        ReusableMethods.waitFor(1);
        us015Admin.itemsAltindakiPatientButtonu.click();
    }
    @Then("Create a new Patient buttonuna tiklar")
    public void create_a_new_patient_buttonuna_tiklar() {
        ReusableMethods.waitFor(1);
        us015Admin.createanewPatient.click();
    }
    @Then("First Name buttonunu tiklar ve bilgileri girer")
    public void first_name_buttonunu_tiklar_ve_bilgileri_girer() {
        ReusableMethods.waitFor(1);
        us015Admin.firstName.sendKeys(firstname);
    }
    @Then("Last Name buttonunu tiklar ve bilgileri girer")
    public void last_name_buttonunu_tiklar_ve_bilgileri_girer() {
        ReusableMethods.waitFor(1);
        us015Admin.patientLastName.sendKeys(lastname);
    }
    @Then("Birth Date buttonuna tiklar ve bilgileri girer")
    public void birth_date_buttonuna_tiklar_ve_bilgileri_girer() {
        ReusableMethods.waitFor(1);
        us015Admin.birthDate.sendKeys(faker.date().birthday(21,35).toString());
    }
    @When("Email buttonuna tiklar ve bilgileri girer")
    public void email_buttonuna_tiklar_ve_bilgileri_girer() {
        ReusableMethods.waitFor(1);
        us015Admin.patientEmail.sendKeys(faker.internet().emailAddress());
    }
    @When("Phone buttonuna tiklar ve bilgileri girer")
    public void phone_buttonuna_tiklar_ve_bilgileri_girer() {
        ReusableMethods.waitFor(1);
        us015Admin.patientPhone.sendKeys("8888888888");
    }
    @When("Gender sekmesini tiklar ve FEMALE secer")
    public void gender_sekmesini_tiklar_ve_female_secer() {
        ReusableMethods.waitFor(1);
        us015Admin.gender.sendKeys("FEMALE");
    }
    @When("Bloud Group sekmesini tiklar ve kan grubunu secer")
    public void bloud_group_sekmesini_tiklar_ve_kan_grubunu_secer() {
        ReusableMethods.waitFor(1);
        us015Admin.patientBloodGroup.sendKeys("A+");
    }
    @When("Description buttonuna tiklar ve hasta tanimini yazar")
    public void description_buttonuna_tiklar_ve_hasta_tanimini_yazar() {
        ReusableMethods.waitFor(1);
        us015Admin.patientDescription.sendKeys("null");
        //   JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        // jse.executeScript("arguments[0].scrollIntoView(true);", us015Admin.savebuttonu);
    }
    @Then("User sekmesini tiklar ve system secenegini secer")
    public void user_sekmesini_tiklar_ve_system_secenegini_secer() {
       //ReusableMethods.waitFor(1);
       us015Admin.userid.sendKeys("cokhasta" + Keys.ENTER);
    }
    @Then("Country sekmesini tiklar ve US secenegini secer")
    public void country_sekmesini_tiklar_ve_us_secenegini_secer() {
        //ReusableMethods.waitFor(1);
        Select obj2=new Select(us015Admin.patientCountry);
        obj2.selectByIndex(0);
    }
    @Then("State City sekmesini tiklar ve Alabana secenegini secer")
    public void state_city_sekmesini_tiklar_ve_alaska_secenegini_secer() {
        ReusableMethods.waitFor(1);
        Select obj1=new Select(us015Admin.state);
        obj1.selectByIndex(0);
        ReusableMethods.waitFor(1);
    }
    @Then("Save buttonuna tiklar ve hastayi kayit eder")
    public void save_buttonuna_tiklar_ve_hastayi_kayit_eder() {
        ReusableMethods.waitFor(1);
        us015Admin.savebuttonu.click();
        us015Admin.accountWebElement.click();
        us015Admin.signOutButtonu.click();
    }
    //TC002
    @Then("A new Patient is created alert yazisini dogrular")
    public void a_new_patient_is_created_alert_yazisini_dogrular() {
        ReusableMethods.waitFor(1);

        Assert.assertTrue(us015Admin.successCreatedMessage.isEnabled());
    }

    @And("Ilk satirdaki hastanin View buttonuna tiklar")
    public void ilkSatirdakiHastaninViewButtonunaTiklar() {
        ReusableMethods.waitFor(1);
        us015Admin.viewHastaIlkSatirButtonu.click();
    }

    @Then("Patient yazisi altindaki bilgiler dogrulanir")
    public void patientYazisiAltindakiBilgilerDogrulanir() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us015Admin.ssnView.isEnabled());
        Assert.assertTrue(us015Admin.firstNameView.isEnabled());
        Assert.assertTrue(us015Admin.lastNameView.isEnabled());
        Assert.assertTrue(us015Admin.birthDateView.isEnabled());
        Assert.assertTrue(us015Admin.phoneView.isEnabled());
        Assert.assertTrue(us015Admin.genderView.isEnabled());
        Assert.assertTrue(us015Admin.bloodGroupView.isEnabled());
        Assert.assertTrue(us015Admin.descriptionView.isEnabled());
        Assert.assertTrue(us015Admin.userView.isEnabled());
        Assert.assertTrue(us015Admin.countryView.isEnabled());
        Assert.assertTrue(us015Admin.stateCityView.isEnabled());
        us015Admin.accountWebElement.click();
        us015Admin.signOutButtonu.click();
    }
    //TC003
    @And("Ilk satirdaki hastanin Edit buttonuna tiklar")
    public void ilkSatirdakiHastaninEditButtonunaTiklar() {
        ReusableMethods.waitFor(1);
        us015Admin.firstEditButton.click();
    }

    @Then("Hastanin id boxunu dogurular")
    public void hastaninIdBoxunuDogurular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us015Admin.idTextBox.isEnabled());
        us015Admin.accountWebElement.click();
        us015Admin.signOutButtonu.click();
    }
    //TC004
    @Given("Appointment secenegini secer ve tiklar")
    public void appointmentSeceneginiSecerVeTiklar() {
        ReusableMethods.waitFor(1);
        us015Admin.itemsAltindakiAppointment.click();
    }

    @And("Yonetici Hastaya Doktor atar")
    public void yoneticiHastayaDoktorAtar() {
        ReusableMethods.waitFor(1);
        us015Admin.physicianAssign.sendKeys("10505:Johny John");
    }

    @And("Yonetici Doktora Hasta atar")
    public void yoneticiDoktoraHastaAtar() {
        ReusableMethods.waitFor(1);
        us015Admin.patientAssign.sendKeys("2551"); //atamiyor
    }

    @And("Assign sonrasi save buttonuna tiklar")
    public void assignSonrasiSaveButtonunaTiklar() {
        ReusableMethods.waitFor(1);
        us015Admin.savebuttonu.click();
    }
    @Then("The Appointment is update mesajini dogrular")
    public void theAppointmentIsUpdateMesajiniDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us015Admin.successfulUpdateMessage.isEnabled());
        us015Admin.accountWebElement.click();
        us015Admin.signOutButtonu.click();
    }
    //TC005
    @Given("State City secenegini secer ve tiklar")
    public void stateCitySeceneginiSecerVeTiklar() {
        ReusableMethods.waitFor(1);
        us015Admin.itemsAltindakiState.click();
    }

    @And("Create a new State City buttonuna tiklar")
    public void createANewStateCityButtonunaTiklar() {
        ReusableMethods.waitFor(1);
        us015Admin.stateCreateButtonu.click();
    }

    @And("Name textboxna tiklar ve isim yazar")
    public void nameTextboxnaTiklarVeIsimYazar() {
        ReusableMethods.waitFor(1);
        us015Admin.stateCreateName.sendKeys("Hayal" + Keys.ENTER);
    }

    @Then("State City sekmesine tiklar ve Us secenegini secer")
    public void stateCitySekmesineTiklarVeUsSeceneginiSecer() {
        ReusableMethods.waitFor(1);
        //us015Admin.stateTextBox.click();
        Select objee=new Select(us015Admin.stateTextBox);
        objee.selectByIndex(0);
    }

    @And("Save buttonuna tiklar")
    public void saveButtonunaTiklar() {
        ReusableMethods.waitFor(1);
        us015Admin.savebuttonu.click();
    }
    @And("Successful mesajini goruldugunu dogrular")
    public void successfulMesajiniGoruldugunuDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us015Admin.failMessageToastContainer.isDisplayed());
        ReusableMethods.waitFor(2);
        us015Admin.accountWebElement.click();
        us015Admin.signOutButtonu.click();

    }
    //TC006
    @And("Ilk satirdaki hastanin Delete buttonuna tiklar")
    public void ilkSatirdakiHastaninDeleteButtonunaTiklar() {
        ReusableMethods.waitFor(1);
        us015Admin.firstDeleteButton.click();
    }

    @Then("Confirm delete operation yazisi altindaki Delete buttonuna tiklar")
    public void confirmDeleteOperationYazisiAltindakiDeleteButtonunaTiklar() {
        ReusableMethods.waitFor(1);
        us015Admin.confirmationDeleteButton.click();
    }

    @And("Successful mesajini dogrular")
    public void successfulMesajiniDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us015Admin.failMessageToastContainer.isEnabled());
        ReusableMethods.waitFor(1);
        us015Admin.deletesonrasıCancel.click();
        us015Admin.accountWebElement.click();
        us015Admin.signOutButtonu.click();
    }
}