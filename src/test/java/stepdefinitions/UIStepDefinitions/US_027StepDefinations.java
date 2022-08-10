package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import pages.US005;
import pages.US027;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_027StepDefinations {

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    US005 us005 = new US005();
    US027 us027 = new US027();

    // ***********************************************************************************
    // ****************************************TC_001*************************************
    // ***********************************************************************************
    @Given("I-URL'e gider")
    public void ı_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("MedunnaUrl"));

    }

    @Then("I-Sag ustte bulunan ikona tiklar")
    public void ı_sag_ustte_bulunan_ikona_tiklar() {
        us005.singInIcon.click();

    }

    @Then("I-Sign in'e tiklar")
    public void ı_sign_in_e_tiklar() {
        us005.singItem.click();

    }

    @Then("I-Admin username girer")
    public void ı_admin_username_girer() {
        us005.userNameBox.sendKeys(ConfigReader.getProperty("AdminUsername"));
        ReusableMethods.waitFor(2);

    }

    @Then("I-Admin password girer")
    public void ı_admin_password_girer() {
        us005.passwordBox.sendKeys(ConfigReader.getProperty("AdminPassword"));

    }

    @Then("I-Sign in buttonuna tiklar")
    public void ı_sign_in_buttonuna_tiklar() {
        us005.singInButton.click();
        ReusableMethods.waitFor(3);

    }

    @Then("I-Item Titles goruntulenir ve tiklanir")
    public void ı_ıtem_titles_goruntulenir_ve_tiklanir() {
        // us027.ItemTitles.isDisplayed();
        us027.ItemTitles.click();
        ReusableMethods.waitFor(2);

    }

    @Then("I-Cikan seceneklerde Messages tiklanir")
    public void ı_cikan_seceneklerde_messages_tiklanir() {
        us027.ItemTitlesMessages.click();
        ReusableMethods.waitFor(2);

    }

    @Then("I-Acilan sayfada Messages goruntulenir")
    public void ı_acilan_sayfada_messages_goruntulenir() {
        us027.HeadMessages.isDisplayed();
        ReusableMethods.waitFor(1);

    }

    @Then("I-Email basligi goruntulenir")
    public void ı_email_basligi_goruntulenir() {
        us027.MessagesEmail.isDisplayed();
        ReusableMethods.waitFor(1);

    }

    @Then("I-Name basligi goruntulenir")
    public void ı_name_basligi_goruntulenir() {
        us027.MessagesName.isDisplayed();
        ReusableMethods.waitFor(1);

    }

    @Then("I-View buttonuna tiklanir")
    public void ı_view_buttonuna_tiklanir() {
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID1);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID2);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID3);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID4);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID5);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID6);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID7);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID8);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID9);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID10);
        ReusableMethods.waitFor(3);

        us027.MessagesViewButton.click();
        ReusableMethods.waitFor(2);

    }

    @Then("I-Name goruntulenir")
    public void ı_name_goruntulenir() {
        us027.Messages77095Name.isDisplayed();

    }

    @Then("I-Email goruntulenir")
    public void ı_email_goruntulenir() throws IOException {
        us027.Messages77095Email.isDisplayed();
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("HeadMessages");

    }
    // ****************************************************************************
    // *********************************TC_002*************************************
    // ****************************************************************************

    @Then("I-Sag da bulunan Create a new Message goruntulenir")
    public void ı_sag_da_bulunan_create_a_new_message_goruntulenir() {
        us027.CreateANewMessageButton.isDisplayed();

    }

    @Then("I- Create a new Message buttonuna tiklanir")
    public void ı_create_a_new_message_buttonuna_tiklanir() {
        us027.CreateANewMessageButton.click();

    }

    @Then("I-Name box gorunutlenir ve name girilir")
    public void ı_name_box_gorunutlenir_ve_name_girilir() {
        us027.CreateMessageNameBox.isDisplayed();
        us027.CreateMessageNameBox.sendKeys("Kate");
        ReusableMethods.waitFor(2);

    }

    @Then("I-Email box gorutnulenir ve email girilir")
    public void ı_email_box_gorutnulenir_ve_email_girilir() {
        us027.CreateMessageEmailBox.isDisplayed();
        us027.CreateMessageEmailBox.sendKeys("katekaren@gmail.com");
        ReusableMethods.waitFor(2);

    }

    @Then("I-Subject box goruntulenir ve subject girilir")
    public void ı_subject_box_goruntulenir_ve_subject_girilir() {
        us027.CreateMessageSubjectBox.isDisplayed();
        us027.CreateMessageSubjectBox.sendKeys("important");
        ReusableMethods.waitFor(2);

    }

    @Then("I-Messages box gorutnulenir ve messages girilir")
    public void ı_messages_box_gorutnulenir_ve_messages_girilir() {
        us027.CreateMessageMessageBox.isDisplayed();
        us027.CreateMessageMessageBox.sendKeys("Patient is died");
        ReusableMethods.waitFor(2);

    }

    @Then("I-Save buttonuna tiklanir")
    public void ı_save_buttonuna_tiklanir() {
        us027.CreateMessageSaveButton.click();
        ReusableMethods.waitFor(1);

    }

    @Then("I-Save Toast container goruntulenir")
    public void ı_save_toast_container_goruntulenir() throws IOException {
        ReusableMethods.getScreenshot("HeadMessages");

    }

    @Then("I-Edit buttonunu goruntuler ve Edit buttonuna tiklar")
    public void ı_edit_buttonunu_goruntuler_ve_edit_buttonuna_tiklar() {
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID1);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID2);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID3);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID44);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID4);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID5);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID6);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID7);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID8);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID9);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView ();", us027.MessagesID10);
        ReusableMethods.waitFor(3);

        us027.MessageEditButton.click();
        ReusableMethods.waitFor(2);


    }

    @Then("I-Name box ve Subject box duzenlenir")
    public void ı_name_box_ve_subject_box_duzenlenir() {
        us027.CreateMessageNameBox.clear();
        ReusableMethods.waitFor(1);
        us027.CreateMessageNameBox.sendKeys("Nuruu");
        ReusableMethods.waitFor(1);
        us027.CreateMessageSubjectBox.clear();
        ReusableMethods.waitFor(1);
        us027.CreateMessageSubjectBox.sendKeys("Very important");
        ReusableMethods.waitFor(1);

    }

    @Then("I-Edit Save buttonuna tiklanir")
    public void ı_edit_save_buttonuna_tiklanir() {
        us027.CreateMessageSaveButton.click();
        ReusableMethods.waitFor(1);

    }

    @Then("I-Edit Toast Container goruntulenir")
    public void ı_edit_toast_container_goruntulenir() throws IOException {
        ReusableMethods.getScreenshot("EditMessages");

    }

    @Then("I-Delete buttonuna tiklanir")
    public void ı_delete_buttonuna_tiklanir() {

    }

    @Then("I-Confirm delete operation goruntulenir")
    public void ı_confirm_delete_operation_goruntulenir() {

    }

    @Then("I-Pop Up yazisi goruntulenir")
    public void ı_pop_up_yazisi_goruntulenir() {

    }

    @Then("I-Toast Container gorutulenir")
    public void ı_toast_container_gorutulenir() {

    }

    // ****************************************************************************
    // *********************************TC_003*************************************
    // ****************************************************************************


}
