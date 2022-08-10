package stepdefinitions.UIStepDefinitions;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.US005;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_005StepDefinations {
    US005 us005 = new US005();

    @Then("Make an Appointment be view")
    public void make_an_appointment_be_view(){
        Assert.assertTrue(us005.loginPageMakeAnAppointmentButton.isDisplayed());
    }
    @Then("Make an Appointment button click")
    public void make_an_appointment_button_click(){
        us005.loginPageMakeAnAppointmentButton.click();
    }
    @Then("Make an Appointment be view on the opened page")
    public void make_an_appointment_be_view_on_the_opened_page(){
        Assert.assertTrue(us005.makeAnAppointmentText.isDisplayed());
    }
    @Then("First Name box be view")
    public void first_name_box_be_view(){
        Assert.assertTrue(us005.makeAnAppointmentFirstNameAssert.isDisplayed());
    }
    @Then("First Name box is left blank")
    public void first_name_box_is_left_blank(){
        us005.makeAnAppointmentFirstNameBox.sendKeys(ConfigReader.getProperty("Empty")+ Keys.ENTER);
    }
    @Then("Your FirstName is required feedback be view")
    public void your_first_name_is_required_feedback_be_view(){
        Assert.assertTrue(us005.makeAnAppoinmentFirstNameFeedBack.isDisplayed());
    }
    @Then("Patient enters first name")
    public void patient_enters_first_name(){
        us005.makeAnAppointmentFirstNameBox.sendKeys(ConfigReader.getProperty("Firstname")+ Keys.ENTER);
    }
    @Then("Assert that the first name has been entered")
    public void assert_that_the_first_name_has_been_entered(){
        Assert.assertFalse(!us005.makeAnAppoinmentFirstNameFeedBack.isDisplayed());
    }
    // *******************************TC_002**********************************
    @Then("SSN box be view")
    public void ssn_box_be_view() {
        us005.makeAnAppointmentSSNAssert.isDisplayed();

    }
    @Then("SSN box is left blank")
    public void ssn_box_is_left_blank() {
        us005.makeAnAppointmentSSNbox.sendKeys(ConfigReader.getProperty("Empty") + Keys.ENTER);
    }
    @Then("Your SSN is required feedback be view")
    public void your_ssn_is_required_feedback_be_view() {
        us005.makeAnAppoinmentSSNFeedBack.isDisplayed();
    }
    @Then("Wrong SSN has been entered")
    public void wrong_ssn_has_been_entered() {
        us005.makeAnAppointmentSSNbox.sendKeys(ConfigReader.getProperty("WrongSSN") + Keys.ENTER);
    }
    @Then("Your SSN is invalid feedback be view")
    public void your_ssn_is_invalid_feedback_be_view() {
        us005.makeAnAppointmentSSNInvaliedFeedBack.isDisplayed();
    }
    @Then("Hasta {int} rakamli,  {int}. ve {int}. rakamlardan sonra {string} iceren SSN girer")
    public void hasta_rakamli_ve_rakamlardan_sonra_iceren_ssn_girer(Integer int1, Integer int2, Integer int3, String string) {
        us005.makeAnAppointmentSSNbox.sendKeys(ConfigReader.getProperty("CorrectSSN"));
    }
    @Then("Assert that the patient entered the corret SSN")
    public void assert_that_the_patient_entered_the_corret_ssn() {
        Assert.assertTrue(!us005.makeAnAppointmentSSNInvaliedFeedBack.isDisplayed());
    }
    // *******************TC_003*************************
    @Then("Last Name box be view")
    public void last_name_box_be_view() {
        us005.makeAnAppoinmentLastNameAssert.isDisplayed();
    }
    @Then("Last Name box is left blank")
    public void last_name_box_is_left_blank() {
        us005.makeAnAppoinmentLastNameBox.sendKeys(ConfigReader.getProperty("Empty") + Keys.ENTER);
    }
    @Then("Your LastName is required feedback be view")
    public void your_last_name_is_required_feedback_be_view() {
        us005.makeAnAppoinmentLastNameFeedBack.isDisplayed();
    }
    @Then("Patient enters last name")
    public void patient_enters_last_name() {
        us005.makeAnAppoinmentLastNameBox.sendKeys(ConfigReader.getProperty("Lastname") + Keys.ENTER);
    }
    @Then("Assert that the last name has been entered")
    public void assert_that_the_last_name_has_been_entered() {
        Assert.assertFalse(!us005.makeAnAppoinmentLastNameFeedBack.isDisplayed());
    }
    // ********************TC_004************************************
    @Then("Email box be view")
    public void email_box_be_view() {
        us005.makeAnAppoinmentEmailAssert.isDisplayed();
    }
    @Then("Email box is left blank")
    public void email_box_is_left_blank() {
        us005.makeAnAppoinmentEmailBox.sendKeys(ConfigReader.getProperty("Empty") + Keys.ENTER);
    }
    @Then("Your Email is required feedback be view")
    public void your_email_is_required_feedback_be_view() {
        us005.makeAnAppoinmentEmailFeedBack.isDisplayed();
    }
    @Then("Wrong Email has been entered")
    public void wrong_email_has_been_entered() {
        us005.makeAnAppoinmentEmailBox.sendKeys(ConfigReader.getProperty("WrongEmail") + Keys.ENTER );
    }
    @Then("Your Email is invalied feedback be view")
    public void your_email_is_invalied_feedback_be_view() {
        us005.makeAnAppointmentEmailInvaliedFeedBack.isDisplayed();
    }
    @Then("Hasta {string} ve {string} iceren email adresini girer")
    public void hasta_ve_iceren_email_adresini_girer(String string, String string2) {
        us005.makeAnAppoinmentEmailBox.clear();
        us005.makeAnAppoinmentEmailBox.sendKeys(ConfigReader.getProperty("CorrectEmail") + Keys.ENTER);
    }
    @Then("Assert that the patient entered the corret Email")
    public void assert_that_the_patient_entered_the_corret_email() {
        Assert.assertFalse(!us005.makeAnAppointmentEmailInvaliedFeedBack.isDisplayed());
    }
    //************************TC_005*************************
    @Then("Phone box be view")
    public void phone_box_be_view() {
        us005.makeAnAppointmentPhoneAssert.isDisplayed();
    }
    @Then("Phone box is left blank")
    public void phone_box_is_left_blank() {
        us005.makeAnAppoinmentPhoneBox.sendKeys(ConfigReader.getProperty("Empty")  + Keys.ENTER);
    }
    @Then("Your Phone is required feedback be view")
    public void your_phone_is_required_feedback_be_view() {
        us005.makeAnAppoinmentPhoneFeedBack.isDisplayed();
        ReusableMethods.waitFor(2);
    }
    @Then("Wrong Phone has been entered")
    public void wrong_phone_has_been_entered() {
        us005.makeAnAppoinmentPhoneBox.sendKeys(ConfigReader.getProperty("WrongPhone") + Keys.ENTER);
    }
    @Then("Your Phone is invalied feedback be view")
    public void your_phone_is_invalied_feedback_be_view() {
        us005.makeAnAppointmentPhoneInvaliedFeedBack.isDisplayed();
        ReusableMethods.waitFor(2);
    }
    @Then("{int}-Hasta {int} rakamli {int}. ve {int}. rakamdan sonra {string} iceren  phone numarasi girer")
    public void hasta_rakamli_ve_rakamdan_sonra_iceren_phone_numarasi_girer(Integer int1, Integer int2, Integer int3, Integer int4, String string) {
        us005.makeAnAppoinmentPhoneBox.clear();
    }
    @Then("Assert that the patient entered the correct Phone")
    public void assert_that_the_patient_entered_the_correct_phone() {
        us005.getScreenshot("NOtFeedBack",us005.makeAnAppoinmentPhoneBox);
        // Assert.assertFalse(!us005.makeAnAppointmentPhoneInvaliedFeedBack.isDisplayed());
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us005.makeAnAppointmentPhoneInvaliedFeedBack.isDisplayed());
        us005.makeAnAppoinmentPhoneBox.sendKeys(ConfigReader.getProperty("CorrectPhone") + Keys.TAB);
        ReusableMethods.waitFor(3);
    }
    @Then("{int}-Phone number {int} rakamli krakter girilir")
    public void phone_number_rakamli_krakter_girilir(Integer int1, Integer int2) {
        us005.makeAnAppoinmentPhoneBox.clear();
        us005.makeAnAppoinmentPhoneBox.sendKeys(ConfigReader.getProperty("TRUEBUTFALSE") + Keys.ENTER);
    }
    @Then("Your Phone is invalied feedback be view again")
    public void your_phone_is_invalied_feedback_be_view_again() {
        us005.makeAnAppointmentPhoneInvaliedFeedBack.isDisplayed();
    }
    // **************************TC_006***********************
    @Then("{int}-Hasta First Name girer")
    public void hasta_first_name_girer(Integer int1) {
        us005.makeAnAppointmentFirstNameBox.sendKeys(ConfigReader.getProperty("Username"));
    }
    @Then("{int}-Hasta  SSN girer")
    public void hasta_ssn_girer(Integer int1) {
        us005.makeAnAppointmentSSNbox.sendKeys(ConfigReader.getProperty("CorrectSSN"));
    }
    @Then("{int}-Hasta Last Name girer")
    public void hasta_last_name_girer(Integer int1) {
        us005.makeAnAppoinmentLastNameBox.sendKeys(ConfigReader.getProperty("Lastname"));
    }
    @Then("{int}-Hasta Email girer")
    public void hasta_email_girer(Integer int1) {
        us005.makeAnAppoinmentEmailBox.sendKeys(ConfigReader.getProperty("CorrectEmail"));
    }
    @Then("{int}-Hasta Phone girer")
    public void hasta_phone_girer(Integer int1) {
        us005.makeAnAppoinmentPhoneBox.sendKeys(ConfigReader.getProperty("CorrectPhone"));
    }
    @Then("{int}-Hasta Appointment DateTime girer")
    public void hasta_appointment_date_time_girer(Integer int1) {
        us005.makeAnAppoinmentAppointmentAppoDate.sendKeys(ConfigReader.getProperty("Date"));
        ReusableMethods.waitFor(2);
    }
    @Then("{int}-Send an Appointment Request butonuna tiklar")
    public void send_an_appointment_request_butonuna_tiklar(Integer int1) {
        us005.sendAnAppointmentRequestButton.click();
    }
    @Then("{int}-{string} bilgisi goruntulenir")
    public void bilgisi_goruntulenir(Integer int1, String string) {
        us005.toastContainer.isDisplayed();
        ReusableMethods.waitFor(2);
    }
    @Then("{int}-Sayfa da yukari cikilir ve User simgesi tiklanir")
    public void sayfa_da_yukari_cikilir_ve_user_simgesi_tiklanir(Integer int1) {
        us005.singInIcon.click();
        ReusableMethods.waitFor(2);
    }
    @Then("{int}-Sing in butonuna tiklanir")
    public void sing_in_butonuna_tiklanir(Integer int1) {
        us005.singItem.click();
        ReusableMethods.waitFor(2);
    }
    @Then("{int}-Hasta Username'ini girer")
    public void hasta_username_ini_girer(Integer int1) {
        us005.userNameBox.sendKeys(ConfigReader.getProperty("Username"));
    }
    @Then("{int}-Hasta Password'unu girer")
    public void hasta_password_unu_girer(Integer int1) {
        us005.passwordBox.sendKeys(ConfigReader.getProperty("Password"));
        ReusableMethods.waitFor(2);
    }
    @Then("{int}-Sing in butonuna tiklar")
    public void sing_in_butonuna_tiklar(Integer int1) {
        us005.singInButton.click();
    }
    @Then("{int}-Acilan sayfada  {string} butonuna tıklanir")
    public void acilan_sayfada_butonuna_tıklanir(Integer int1, String string) {
        us005.myPagesPatient.click();
    }
    @Then("{int}-My Appointments e tiklanir")
    public void my_appointments_e_tiklanir(Integer int1) {
        us005.myPagesPatientMyAppointments.click();
    }
    @Then("{int}-Acilan sayfa Appointments goruntulenir")
    public void acilan_sayfa_appointments_goruntulenir(Integer int1) {
        us005.appointmentAssert.isDisplayed();
    }
}