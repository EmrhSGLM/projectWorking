package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {


 public HomePage() {


  PageFactory.initElements(Driver.getDriver(), this);
 }


 @FindBy(xpath = "(//a[@href='#'])[1]")
 public WebElement ikonElement;
 @FindBy(xpath = "//span[.='Sign in']")
 public WebElement signInButtonElement;

 @FindBy (xpath="//input[@name='username']")
    public WebElement userNameBoxElement;

    @FindBy (xpath="//input[@name='password']")
    public WebElement passwordBoxElement;

    @FindBy (xpath="//button[@type='submit']")
    public WebElement signInGirisButtonElement;

    @FindBy(xpath = "//span[.='Register']")
    public WebElement registerButonElemnti;

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

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement makeAnAppoinmentSSNFeedBack;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement makeAnAppoinmentEmailFeedBack;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement makeAnAppoinmentPhoneFeedBack;

    @FindBy(xpath = "//span[@style='color: red; font-size: 12px; border-color: red;']")
    public WebElement makeAnAppoinmentAppointmentDateTimeFeedBack;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement makeAnAppointmentLastNameBox;
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement makeAnAppointmentSsnBox;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement makeAnAppointmentEmailBox;
    @FindBy(xpath = "//input[@id='phone']")
    public WebElement makeAnAppointmentPhoneBox;
    @FindBy(xpath = "//div[text()='Your FirstName is required.']")
    public WebElement makeAnAppointmentFirstnameTextBosUyariYazisi;
    @FindBy(xpath = "//div[text()='Your LastName is required.']")
    public WebElement makeAnAppointmentLastnameTextBosUyariYazisi;
    @FindBy(xpath = "//div[text()='Phone number is required.']")
    public WebElement makeAnAppointmentPhoneTextBosUyariYazisi;
    @FindBy(xpath = "//div[text()='Your SSN is required.']")
    public WebElement makeAnAppointmentSsnTextBosUyariYazisi;
    @FindBy(xpath = "//div[text()='Your SSN is invalid']")
    public WebElement makeAnAppointmentSsnTextHataliNumaraYazisi;
    @FindBy(xpath = "//div[text()='Your email is required.']")
    public WebElement makeAnAppointmentEmailTextBosUyariYazisi;
    @FindBy(xpath = "//input[@id='appoDate']")
    public WebElement makeAnAppointmentDateTimeBox;
    @FindBy (xpath = "//button[@id='register-submit']")
    public WebElement makeAnAppointmentSendAppointmentRequestButon;
    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement succesYaziElementi;

}

