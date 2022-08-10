package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_1101_DoctorsAndHomePage {
    public US_1101_DoctorsAndHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // HOME PAGE

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


    // DOCTORS PAGE

    @FindBy(xpath = "//textarea[@name='anamnesis']")
    public WebElement anamnesisTextBox;

    @FindBy(xpath = "(//div[@class='text-danger form-group'])[1]")
    public WebElement anamnesisTextBoxBosBirakilamazYazisi;

    @FindBy(xpath = "//textarea[@name='treatment']")
    public WebElement treatmentTextBox;

    @FindBy(xpath = "(//div[@class='text-danger form-group'])[3]")
    public WebElement treatmentTextBoxBosBirakilamazYazisi;

    @FindBy (xpath = "//textarea[@name='diagnosis']")
    public WebElement diagnosisTextBox;

    @FindBy(xpath = "(//div[@class='text-danger form-group'])[5]")
    public WebElement diagnosisTextBoxBosBirakilamazYazisi;

    @FindBy(xpath = "//textarea[@name='prescription']")
    public WebElement prescriptionTextBox;

    @FindBy (xpath = "//textarea[@name='description']")
    public WebElement descriptionTextBox;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButonu;

    @FindBy (xpath = "(//div[@class='form-group'])[4]")
    public WebElement statusElemanGoruntule;

    @FindBy(xpath = "//select[@id='appointment-status']")
    public WebElement statusDropdownElementi;



}


