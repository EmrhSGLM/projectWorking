package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import pages.US005;
import pages.US021;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_021StepDefinations {

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    US005 us005 = new US005();
    US021 us021 = new US021();


    // ********************************TC_001******************************************
    @Given(": I-URL'e gider")
    public void ı_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("MedunnaUrl"));
    }
    @Then(": I-Sag ustte bulunan ikona tiklar")
    public void ı_sag_ustte_bulunan_ikona_tiklar() {
       us005.singInIcon.click();
        ReusableMethods.waitFor(2);
    }
    @Then(": I-Sign in'e tiklar")
    public void ı_sign_in_e_tiklar() {
       us005.singItem.click();
    }
    @Then(": I-Staff username girer")
    public void ı_staff_username_girer() {
       us005.userNameBox.sendKeys(ConfigReader.getProperty("StaffUsername"));
    }
    @Then(": I-Staff password girer")
    public void ı_staff_password_girer() {
        us005.passwordBox.sendKeys(ConfigReader.getProperty("StaffPassword"));
    }
    @Then(": I-Sign in buttonuna tiklar")
    public void ı_sign_in_buttonuna_tiklar() {
      us005.singInButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then(": I-My Pages buttonunna tiklar")
    public void ı_my_pages_buttonunna_tiklar() {
        us021.StaffMyPages.click();
        ReusableMethods.waitFor(2);
    }
    @Then(": I-Search Patient seçenegine tiklar")
    public void ı_search_patient_seçenegine_tiklar() {
        us021.StaffMyPagesSearchPatient.click();
        ReusableMethods.waitFor(2);
    }
    @Then(": I-Acilan sayfada Patients goruntulenir")
    public void ı_acilan_sayfada_patients_goruntulenir() {
       us021.PatientsHeading.isDisplayed();
        ReusableMethods.waitFor(2);
    }
    @Then(": I-Patient SSN ve box  goruntulenir")
    public void ı_patient_ssn_ve_box_goruntulenir() {
        us021.PatientSSN.isDisplayed();
        ReusableMethods.waitFor(2);
    }
    @Then(": I-SSN box'a Patient SSN girilir")
    public void ı_ssn_box_a_patient_ssn_girilir() {
       us021.PatientSSNBox.sendKeys(ConfigReader.getProperty("CorrectSSN"));
        ReusableMethods.waitFor(2);
    }
    @Then(": I-Patient name Kate Karen oldugu dogrulanir")
    public void ı_patient_name_kate_karen_oldugu_dogrulanir() {
        us021.KateAssert.isDisplayed();
        ReusableMethods.waitFor(2);
    }
    @Then(": I-Show Appoitments tiklanir")
    public void ı_show_appoitments_tiklanir() {
       us021.ShowAppointmentsButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then(": I-Acilan sayfada Edit tiklanir")
    public void ı_acilan_sayfada_edit_tiklanir() {
        us021.ShowAppEditButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then(": I-Status degistirilir")
    public void ı_status_degistirilir() {
        us021.EditStatus.click();
        ReusableMethods.waitFor(2);
    }
    @Then(": I-Prescription yazilir")
    public void ı_prescription_yazilir() {
        us021.EditStatusPENDING.click();
        ReusableMethods.waitFor(2);
    }
    @Then(": I-Save buttonuna tiklanilir")
    public void ı_save_buttonuna_tiklanilir() {
        js.executeScript("arguments[0].scrollIntoView ();",us021.EditSaveButton);
        ReusableMethods.waitFor(2);
        us021.EditSaveButton.click();
    }
    @Then(": I-Toast Conatainer goruntulenir")
    public void ı_toast_conatainer_goruntulenir() {
        us021.getScreenshot("ViewEdittoastContainer",us021.EditSaveToastContainer);
      // us021.EditSaveToastContainer.isDisplayed();
       ReusableMethods.waitFor(2);
    }
    @Then(": I-Tekrar  SSN box'a Patiet SSN girilir")
    public void ı_tekrar_ssn_box_a_patiet_ssn_girilir() {
       us021.PatientSSNBox.sendKeys(ConfigReader.getProperty("CorrectSSN"));
       ReusableMethods.waitFor(2);
    }
    @Then(": I-Edit tiklanir")
    public void ı_edit_tiklanir() {
        us021.AgainEditButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then(": I-Country degistirilir")
    public void ı_country_degistirilir() {
        js.executeScript("arguments[0].scrollIntoView ();",us021.EditCountry);
        us021.EditCountryGERMANY.click();
        ReusableMethods.waitFor(2);
    }
    @Then(": I-Save butonuna tiklanir")
    public void ı_save_butonuna_tiklanir() {
        js.executeScript("arguments[0].scrollIntoView ();",us021.EditSaveButton);
        us021.EditSaveButton.click();
    }
    @Then(": I-Kaydedilemedi toast containeri goruntulenir")
    public void ı_kaydedilemedi_toast_containeri_goruntulenir() {
        us021.EditSaveToastContainer.isDisplayed();
        ReusableMethods.waitFor(2);
    }


    // ********************************TC_002******************************************

    @Then(": I-Status PENDING olarak degistirilir")
    public void ı_status_pendıng_olarak_degistirilir() {
        us021.EditStatusPENDING.click();
        ReusableMethods.waitFor(2);
    }
    @Then(": I-Status UNAPPROVED olarak degistirilir")
    public void ı_status_unapproved_olarak_degistirilir() {
        us021.EditStatusUNAPPROVED.click();
        ReusableMethods.waitFor(2);
    }
    @Then(": I-Status CANCELLED olarak degistirilir")
    public void ı_status_cancelled_olarak_degistirilir() {
        us021.EditStatusCANCELLED.click();
        ReusableMethods.waitFor(2);
    }
    @Then(": I-Status COMPLATED olarak degistirilir")
    public void ı_status_complated_olarak_degistirilir() {
       us021.EditStatusCOMPLATED.isEnabled();
    }

    // ********************************TC_003******************************************

    @Then(": I-Anamnesis box girilemez")
    public void ı_anamnesis_box_girilemez() {
        us021.EditAnamnesisD.sendKeys("AAAAA");
        ReusableMethods.waitFor(2);

    }
    @Then(": I-Treatement box girilemez")
    public void ı_treatement_box_girilemez() {
        us021.EditTreatment.sendKeys("BBBBB");
        ReusableMethods.waitFor(2);

    }
    @Then(": I-Diagnosis  box girilemez")
    public void ı_diagnosis_box_girilemez() {
        us021.EditDiagnosis.sendKeys("CCCCC");

    }

    // ********************************TC_004******************************************
    @Then(": I-Patient icin gerekli Physician secilir")
    public void ı_patient_icin_gerekli_physician_secilir() {
        js.executeScript("arguments[0].scrollIntoView ();",us021.EditPhysician);
        ReusableMethods.waitFor(2);
        us021.EditPhysician.click();
        ReusableMethods.waitFor(20);
        us021.EditJonhKing.click();
        ReusableMethods.waitFor(2);
    }
    @Then(": I-Save buttonuna tiklanir")
    public void ı_save_buttonuna_tiklanir() {
       us021.EditSaveButton.click();
    }
    @Then(": I-Save toast container goruntulenir")
    public void ı_save_toast_container_goruntulenir() {
        us021.getScreenshot("ViewEdittoastContainer",us021.EditSaveToastContainer);

    }
}


