package stepdefinitions.UIStepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import pages.US005;
import pages.US012;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
public class US_012StepDefinations  {
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    US005 us005 = new US005();
    US012 us012 = new US012();
    //*************************TC_001*************************

    @Given("Sag ustte bulunan sing in ikonuna tiklar")
    public void sag_ustte_bulunan_sing_in_ikonuna_tiklar() {
        us005.singInIcon.click();
    }
    @Given("Cikan seceneklerden {string} butonuna tiklar")
    public void cikan_seceneklerden_butonuna_tiklar(String string) {
        us005.singItem.click();
    }
    @Given("Doktor Username'inii girer")
    public void doktor_username_inii_girer() {
        us005.userNameBox.sendKeys(ConfigReader.getProperty("DR.Username"));
        ReusableMethods.waitFor(2);
    }
    @Given("Doktor Password'unu girer")
    public void doktor_password_unu_girer() {
        us005.passwordBox.sendKeys(ConfigReader.getProperty("DR.Password"));
        ReusableMethods.waitFor(2);
    }
    @Given("{string} butonuna tiklar")
    public void butonuna_tiklar(String string) {
        us005.singInButton.click();
        ReusableMethods.waitFor(2);
    }
    @Given("{string} sekmesine tiklar")
    public void sekmesine_tiklar(String string) {
        us012.DRMyPages.click();
        ReusableMethods.waitFor(2);
    }
    @Given("{string} secenegine tiklar")
    public void secenegine_tiklar(String string) {
        us012.DRMyPagesMyAppointments.click();
    }
    @Given("{string} secenegi girilir")
    public void secenegi_girilir(String string) {
        us012.myAppointmentsFromDate.sendKeys(ConfigReader.getProperty("FromDate"));
        us012.myAppointmentsToDate.sendKeys(ConfigReader.getProperty("ToDate"));
        ReusableMethods.waitFor(13);
    }
    /*
    @Given("Max {int} gunluk randevular goruntulenir toastContainer mesaji görünür")
    public void max_gunluk_randevular_goruntulenir_toast_container_mesaji_görünür(Integer int1) {
        us012.dateToastContainer.isDisplayed();
        ReusableMethods.waitFor(6);
    }
     */
    @Given("Status {string} goruntulenir")
    public void status_goruntulenir(String string) {
        us012.statusAssert.isDisplayed();
    }
    @Given("PENDING gorunen hastanin sagindaki {string} butonu tiklanir")
    public void pendıng_gorunen_hastanin_sagindaki_butonu_tiklanir(String string) {
        us012.drAppointmentsEdit.click();
    }
    @Given("Acilan sayfada {string} goruntulenir")
    public void acilan_sayfada_goruntulenir(String string) {
        us012.createOrEditAssert.isDisplayed();
        ReusableMethods.waitFor(2);
    }
    @Given("{string} butonu tiklanir")
    public void butonu_tiklanir(String string) {
        us012.resualtATestButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("Acilan sayfada {string} gorunur")
    public void acilan_sayfada_gorunur(String string) {
        us012.testItems.isDisplayed();
    }
    // ********************************TC_002******************************************
    // JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Then("{string} tiklanir")
    public void tiklanir(String string) {
        ReusableMethods.waitFor(1);
        us012.Urea.click();
        ReusableMethods.waitFor(1);
        us012.Creatinine.click();
        ReusableMethods.waitFor(1);
        us012.Sodium.click();
        ReusableMethods.waitFor(1);
        us012.Potassium.click();
        ReusableMethods.waitFor(1);
        //js.executeScript("arguments[0].scrollBy(0,500);",us012.Hemoglobin);
        us012.Totalprotein.click();
        ReusableMethods.waitFor(1);
        us012.Hemoglobin.click();
        ReusableMethods.waitFor(1);
        // js.executeScript("arguments[0].scrollBy(500,900);",us012.Albumin2);
        js.executeScript("arguments[0].scrollIntoView ();",us012.Albumin2);
        ReusableMethods.waitFor(2);
        us012.Albumin.click();
        ReusableMethods.waitFor(1);
        js.executeScript("arguments[0].scrollIntoView ();",us012.CHO);
        ReusableMethods.waitFor(2);
        us012.Glucose.click();
        ReusableMethods.waitFor(2);
        js.executeScript("arguments[0].scrollIntoView ();",us012.SaveButton2);
        ReusableMethods.waitFor(2);
        us012.SaveButton.isDisplayed();
    }
    @Then("Sayfanin en altinda bulunan {string} butonuna tiklanir")
    public void sayfanin_en_altinda_bulunan_butonuna_tiklanir(String string) {
        //  js.executeScript("arguments[0].scrollIntoView ();",us012.SaveButton2);
        us012.SaveButton.click();
    }
    @Then("{string} toastContainer'i goruntulenmeli")
    public void toast_container_i_goruntulenmeli(String string) {
    }
}