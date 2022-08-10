package stepdefinitions.UIStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.StaffPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.IOException;
import java.util.List;

public class US_009StepDefinitions {

    StaffPage staff = new StaffPage();

    @Then("Account-menu tıklanır")
    public void account_menu_tıklanır() throws InterruptedException {

        Thread.sleep(1500);
        staff.AccountMenu.click();
        staff.SignIn.click();
        Thread.sleep(1500);
    }

    @Then("Sing in tıklanır")
    public void sing_in_buttonuna_tıklanır() {
        //staff.SignIn.click();
    }

    @Then("username girilir")
    public void username_girilir() {staff.UsernameTextbox.sendKeys(ConfigReader.getProperty("StafFundaUsername"));}

    @Then("password girilir")
    public void password_girilir() {staff.PasswordTextbox.sendKeys(ConfigReader.getProperty("StafFudndaPasswor"));}

    @Then("Singin buttonuna tıklanır")
    public void singin_buttonuna_tıklanır() {staff.SignInButton.click();}

    @Then("My pages buttonu tıklanır")
    public void my_pages_buttonu_tıklanır() {staff.MyPageButton.click();}

    @Then("Search patient tıklanır")
    public void search_patient_tıklanır() {staff.SearchPatientButton.click();}

    @Given("Hasta bilgileri görülür")
    public void hasta_bilgileri_görülür() {
        String urlsearchPatient= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(urlsearchPatient.contains("search-patient"));
    }
    @Given("Patient SSN box'ına hasta {string} bilgisi girilir")
    public void patient_ssn_box_ına_hasta_bilgisi_girilir(String SSN) {staff.SsnAramaTextbox.sendKeys(SSN+ Keys.ENTER);}


    @Then("Edit buttonu tıklanır")
    public void edit_buttonu_tıklanır() {staff.EditButton.click();}

    @Then("Create or edit a Patient formu geçerli bilgiler ile güncellenir")
    public void create_or_edit_a_patient_formu_geçerli_bilgiler_ile_güncellenir() throws InterruptedException {

        Thread.sleep(1000);
        staff.firstnameTextbox.click();
        staff.firstnameTextbox.clear();
        staff.firstnameTextbox.click();
        Actions actions=new Actions(Driver.getDriver());
        Faker faker= new Faker();
        actions.sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB)
                .sendKeys("04.04.2022"+Keys.TAB).sendKeys("24:00").sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB)
                .sendKeys("888-999-9999"+Keys.TAB).perform();
        Thread.sleep(1000);

        Select select = new Select(staff.genderDropdownElement);
        select.selectByIndex(0);
        Thread.sleep(3000);

        Select  select1 = new Select(staff.bloodGroupDropdownElement);
        select1.selectByIndex(1);
        Thread.sleep(3000);
        staff.addressTextbox.clear();
        staff.addressTextbox.sendKeys(ConfigReader.getProperty("US09hastaAddress"));
        staff.descriptionTextbox.clear();
        staff.descriptionTextbox.sendKeys(ConfigReader.getProperty("US09hastaDescription"));
        Select select2 = new Select(staff.userDropdownElement);
        select2.selectByIndex(2);
        Select select3 = new Select(staff.countryDropdownElement);
        select3.selectByIndex(2);
        Select   select4 = new Select(staff.stateDropdownElement);
        select4.selectByVisibleText("İzmir");

//  ssn 365-34-2321

    }
    @Then("Save tıklanır")
    public void save_tıklanır() throws InterruptedException {
        ReusableMethods.waitForClickablility(staff.saveButton,5);}


    @Then("Kayıt yapıldığı doğrulanır")
    public void kayıt_yapıldığı_doğrulanır() throws InterruptedException {
        Thread.sleep(6000);
        Assert.assertTrue(staff.saveToastify.isDisplayed());}

    @Given("View tıklanır")
    public void view_tıklanır() {staff.viewButton.click();}

    @Then("Hasta bilgilerinin doldurulduğu kontrol edilir")
    public void hasta_bilgilerinin_doldurulduğu_kontrol_edilir() throws IOException {

        List<WebElement> satirelementi=staff.tumHucreDegerleri();
        for (int i = 0; i < satirelementi.size() ; i++) {
            if (satirelementi.isEmpty()){
                ReusableMethods.getScreenshot("HELLO");
            }else {
                Assert.assertFalse(satirelementi.isEmpty());

            }
            System.out.println( i+ ".satirelementi = " + satirelementi.get(i).getText());

        }
    }

    @Then("Her hangi bir hasata bilgisi silebilir")
    public void her_hangi_bir_hasata_bilgisi_silebilir() throws IOException {
        Actions actions =new Actions(Driver.getDriver());
        ReusableMethods.waitForClickablility(staff.tableToblasu,2);
        actions.sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).perform();
        ReusableMethods.getScreenshot("Delete");
        System.out.println(staff.deleteButton.getText());
        Assert.assertFalse(staff.deleteButton.getText().contains("Delete"));

    }
    @Then("Silinme isleminden sonra {string} uyarisi cikmaz.")
    public void silinme_isleminden_sonra_uyarisi_cikmaz(String uyariyazisi) throws IOException {
        ReusableMethods.getScreenshot("This field is required.");
        Assert.assertEquals(uyariyazisi,staff.deleteHataYazisi.getText());
        //Assert.assertTrue(staff.deleteHataYazisi.isDisplayed());
    }

    @Then("Staff hasta silememeli")
    public void staff_hasta_silememli() {
//        System.out.println(staff.deleteButton.getText());
        Assert.assertFalse(staff.deleteButton.getText().contains("Delete"));
    }


}
