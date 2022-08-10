package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DoctorsPage;
import utilities.ConfigReader;

public class US_010StepDefinitions {

    DoctorsPage doctor = new DoctorsPage();

    @Then("Sign in sayfasina gider")
    public void sign_in_sayfasina_gider() {
        doctor.ikonElement.click();
        doctor.signInButtonElement.click();
    }

    @And("Doktor username ve password girer")
    public void doktorUsernameVePasswordGirer() {
        doctor.userNameBoxElement.sendKeys(ConfigReader.getProperty("drUserName"));
        doctor.passwordBoxElement.sendKeys(ConfigReader.getProperty("drPassword"));
    }

    @Then("Sign in butonuna basar")
    public void sign_in_butonuna_basar() {
        doctor.signInGirisButtonElement.click();
    }
    @Then("My Appointments butonuna basar")
    public void my_appointments_butonuna_basar() throws InterruptedException {
        doctor.myPagesButtonElement.click();
        Thread.sleep(2000);
        doctor.myAppointmentsButtonElement.click();
    }
    @Then("Randevu listesine ulaşildigini gorur")
    public void randevu_listesine_ulaşildigini_gorur() {
        Assert.assertTrue(doctor.appointmentsTextElement.isDisplayed());
    }
    @Then("Zaman dilimleri kutusuna erisebildigini gorur")
    public void zaman_dilimleri_kutusuna_erisebildigini_gorur() {
        Assert.assertTrue(doctor.fromDateBoxElement.isEnabled());
        Assert.assertTrue(doctor.toDateBoxElement.isEnabled());
    }

    // Scenario TC_1001

    @Then("patient id, start date, end date, status bilgilerini gorur")
    public void patient_id_start_date_end_date_status_bilgilerini_gorur() {
        Assert.assertTrue(doctor.startDateTimeBoxElement.isDisplayed());
        Assert.assertTrue(doctor.endDateTimeBoxElement.isDisplayed());
    }


}
