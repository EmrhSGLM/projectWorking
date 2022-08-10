package pages;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class US005 {
    public US005() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement loginPageMakeAnAppointmentButton;
    @FindBy(xpath = "(//div[@class='section-title'])[2]")
    public WebElement makeAnAppointmentText;
    @FindBy(xpath = "//*[@for='firstName']")
    public WebElement makeAnAppointmentFirstNameAssert;
    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement makeAnAppointmentFirstNameBox;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement makeAnAppoinmentFirstNameFeedBack;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement makeAnAppoinmentLastNameFeedBack;
    @FindBy(xpath = "//*[@id='lastName']")
    public WebElement makeAnAppoinmentLastNameBox;
    @FindBy(xpath = "//*[@for='lastName']")
    public WebElement makeAnAppoinmentLastNameAssert;
    @FindBy(xpath = "//*[@for='ssn']")
    public WebElement makeAnAppointmentSSNAssert;
    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement makeAnAppointmentSSNbox;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement makeAnAppoinmentSSNFeedBack;
    @FindBy(xpath = "//div[text()='Your SSN is invalid']")
    public WebElement makeAnAppointmentSSNInvaliedFeedBack;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement makeAnAppoinmentEmailFeedBack;
    @FindBy(xpath = "//*[@for='email']")
    public WebElement makeAnAppoinmentEmailAssert;
    @FindBy(xpath = "//*[@id='email']")
    public WebElement makeAnAppoinmentEmailBox;
    @FindBy(xpath = "//*[@for='phone']")
    public WebElement makeAnAppointmentPhoneAssert;
    @FindBy(xpath = "//*[@id='phone']")
    public WebElement makeAnAppoinmentPhoneBox;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement makeAnAppoinmentPhoneFeedBack;
    @FindBy(xpath = "//div[text()='Phone number is required.']")
    public WebElement makeAnAppointmentPhoneTextBosUyariYazisi;
    @FindBy(xpath = "//div[text()='Phone number is invalid']")
    public WebElement makeAnAppointmentPhoneInvaliedFeedBack;
    @FindBy(xpath = "//div[text()='This field is invalid']")
    public WebElement makeAnAppointmentEmailInvaliedFeedBack;
    @FindBy(xpath = "//span[@style='color: red; font-size: 12px; border-color: red;']")
    public WebElement makeAnAppoinmentAppointmentDateTimeFeedBack;
    @FindBy(xpath = "//input[@id='appoDate']")
    public WebElement makeAnAppoinmentAppointmentAppoDate;
    @FindBy(xpath = "//*[@id='register-submit']")
    public WebElement sendAnAppointmentRequestButton;
    @FindBy (xpath = "//*[contains(text(),'Appointment registration saved')]")
    public WebElement toastContainer;
    @FindBy (xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement singInIcon;
    @FindBy (xpath = "//*[@id='login-item']")
    public WebElement singItem;
    @FindBy (xpath = "//*[@name='username']")
    public WebElement userNameBox;
    @FindBy (xpath = "//*[@name='password']")
    public WebElement passwordBox;
    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement singInButton;
    @FindBy (xpath = "//*[@class='svg-inline--fa fa-th-list fa-w-16 ']")
    public WebElement myPagesPatient;
    @FindBy (xpath = "(//*[@href='/patient-appointment'])[1]")
    public WebElement myPagesPatientMyAppointments;
    @FindBy (xpath = "//*[@id='appointment-heading']")
    public WebElement appointmentAssert;
    public String getScreenshot(String nOtFeedBack, WebElement PhoneFeedback) {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = PhoneFeedback.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/US005" + nOtFeedBack + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return target;
    }
}
///test-output/Screenshots/