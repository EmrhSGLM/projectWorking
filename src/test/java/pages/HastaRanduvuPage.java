package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HastaRanduvuPage {

    public HastaRanduvuPage(){


       PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="(//a[@href='#'])[1]")
    public WebElement ikonElement;

    @FindBy (xpath="//span[.='Sign in']")
    public WebElement signInButtonElement;
    @FindBy (xpath="//input[@name='username']")
    public WebElement userNameBoxElement;

    @FindBy (xpath="//input[@name='password']")
    public WebElement passwordBoxElement;

    @FindBy (xpath="//button[@type='submit']")
    public WebElement signInGirisButtonElement;


    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstnameKutusu;


    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastnameKutusu;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnKutusu;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneKutusu;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement loginPageMakeAnAppointmentButton;

    @FindBy(xpath = "//span[@style='color: red; font-size: 12px; border-color: red;']")
    public WebElement makeAnAppoinmentAppointmentDateTimeFeedBack;

    @FindBy(xpath = "//input[@id='appoDate']")
    public WebElement dataTimeBox;

    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement appointRegistrationYaziElementi;

    @FindBy(xpath = "//span[@style='color: red; font-size: 12px; border-color: red;']")
    public WebElement appointmenGecersizTarihYaziElementi;

     @FindBy(xpath = "//li[@class='dropdown nav-item']")
    public WebElement myPagesButonu;

    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement sendAnAppoinment;




}
