package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.DoctorsPage;
import pages.HomePage;
import pages.Us_023_024_Page;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.waitFor;

public class US_023_024_StepDefinitions {

    Us_023_024_Page staff=new Us_023_024_Page();
    Us_023_024_Page patient=new Us_023_024_Page();
    HomePage staffC=new HomePage();
    DoctorsPage cStaff=new DoctorsPage();


    @Given("cstaff url gider")
    public void cstaffUrlGider() { Driver.getDriver().get(ConfigReader.getProperty("URL"));
    }
    @And("cLogin ikonuna tiklar")
    public void cloginIkonunaTiklar() {staffC.ikonElement.click();
    }
    @And("cSign in sekmesine tiklar")
    public void csignInSekmesineTiklar() {staffC.signInButtonElement.click();
    }
    @And("cusername girer")
    public void cusernameGirer() {staffC.userNameBoxElement.sendKeys("staffflower");
    }
    @And("cpassword girer")
    public void cpasswordGirer() {staffC.passwordBoxElement.sendKeys("Gg17781903,.");
    }
    @And("csign in butonuna tiklar")
    public void csignInButonunaTiklar() {staffC.signInGirisButtonElement.click();
    }
    @And("cMy pages sekmesine tiklar")
    public void cmyPagesSekmesineTiklar() {patient.myPagesStaffButton.click();
    }
    @And("cMy pages patient sekmesine tiklar")
    public void cmyPagesPatientSekmesineTiklar() {
        patient.myPagesPatientButton.click();
    }
    @Then("cSearch patient sekmesine tiklar")
    public void csearchPatientSekmesineTiklar() {staff.searchPatientSekmesi.click();
    }
    @Then("cPatient SSN kismina data girilir")
    public void cpatientSSNKisminaDataGirilir() {Actions actions=new Actions(Driver.getDriver());
        actions.click(staff.patientSSNbolumu).sendKeys("333-22-0612").perform();
    }
    @Then("cShow Appointments butonuna tiklar")
    public void cshowAppointmentsButonunaTiklar() {
        waitFor(1);
        staff.showAppointments.click();
        staff.paymentInvoiceElement.click();
    }
    @Then("cShow invoices butonuna tiklar \\(page down)")
    public void cshowInvoicesButonunaTiklarPageDown() {
        waitFor(1);
        staff.showInvoice.click();
    }
    @Then("cinvoices sayfasini gordugunu dogrular")
    public void cinvoicesSayfasiniGordugunuDogrular() { Assert.assertTrue(staff.invoiceTextElementi.isDisplayed());

    }
    @Given("cPatient url'e gider")
    public void cpatientUrlEGider() {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
    }

    @And("cPatient username ve password girer")
    public void cpatientUsernameVePasswordGirer() {
        staffC.userNameBoxElement.sendKeys("muslum");
        staffC.passwordBoxElement.sendKeys("Mm1234,.");
    }

    @Then("cMy Appointments sekmesine tiklar")
    public void cmyAppointmentsSekmesineTiklar() {
        patient.patientMyAppointments.click();
    }

    @Then("cShow test butonuna tiklar")
    public void cshowTestButonunaTiklar() {
        patient.patientShowTest.click();
    }

    @And("cTest sayfasinin acildigini dogrular")
    public void ctestSayfasininAcildiginiDogrular() {

        Assert.assertTrue( patient.patientTestTextElementi.isDisplayed());

    }

    @Then("Show invoice butonuna tiklar")
    public void showInvoiceButonunaTiklar() {
        patient.patientShowInvoice.click();
    }

    @Then("invoice syafasinin acildigini dogrular")
    public void invoiceSyafasininAcildiginiDogrular() {
        Assert.assertTrue(patient.patientInvoiceTextElementi.isDisplayed());
    }



}
