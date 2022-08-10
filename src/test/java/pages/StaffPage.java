package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class StaffPage {

     public  StaffPage(){
         PageFactory.initElements(Driver.getDriver(),this);
     }


    @FindBy(xpath = "//li[@id='account-menu']")// id ="header-tabs"
    public WebElement AccountMenu;

    @FindBy(xpath="//span[text()='Sign in']") //xpath //span[text()='Sign in']
    public WebElement SignIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement UsernameTextbox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement PasswordTextbox;

    @FindBy(xpath = "(//span[text()='Sign in'])[3]") // xpath //button[@class='btn btn-primary']
    public WebElement SignInButton;

    @FindBy(partialLinkText = "MY PAGES") // xpath //span[text()='MY PAGES']
    public WebElement MyPageButton;

    @FindBy(xpath = "//span[text()='Search Patient']")
    public WebElement SearchPatientButton;

    @FindBy(partialLinkText = "In Patient") //span[text()='In Patient']
    public WebElement InPatientButton;

    @FindBy(id = "fromDate")
    public WebElement FromDateTextbox;

    @FindBy(id = "toDate")
    public WebElement ToDateTextbox;

    @FindBy(xpath = "//table/thead/tr/th")
    public List<WebElement> allHeaders;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement SsnAramaTextbox;

    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement EditButton;

    @FindBy(xpath = "//input[@name='id']")
    public WebElement idTextbox;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstnameTextbox;

    @FindBy(xpath = "//input[@id='patient-lastName']")
    public WebElement lastnameTextbox;

    @FindBy(xpath = "//input[@id='patient-birthDate']")
    public WebElement birthdateTextbox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextbox;

    @FindBy(xpath = "//input[@id='patient-phone']")
    public WebElement phoneTextbox;

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropdownElement;

    @FindBy(xpath = "//select[@id='patient-bloodGroup']")
    public WebElement bloodGroupDropdownElement;

    @FindBy(xpath = "//input[@id='patient-adress']")
    public WebElement addressTextbox;

    @FindBy(xpath = "//textarea[@id='patient-description']")
    public WebElement descriptionTextbox;

    @FindBy(xpath = "//select[@id='patient-user']")
    public WebElement userDropdownElement;

    @FindBy(xpath = "//select[@id='patient-country']")
    public WebElement countryDropdownElement;

    @FindBy(xpath = "//select[@id='patient-cstate']")
    public WebElement stateDropdownElement;

    @FindBy(xpath = "//span[text()='Save']")         //(id= "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//*[contains(text(),'Registration Saved')]")
    public WebElement saveToastify; //div[@role='alert']
    //Toast Container: (xpath = "")

    @FindBy(xpath = "//a[@class='btn btn-info btn-sm']")
    public WebElement viewButton;

    @FindBy(xpath = "//b[text()='51252']")
    public WebElement patientYaziElement;

    @FindBy(xpath = "(//div[text()='This field is required.'])[1]")
    public WebElement deleteHataYazisi;

    @FindBy(id = "cancel-save")
    public WebElement backButton;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[3]")
    public WebElement deleteButton;

    @FindBy(xpath = "//tbody//tr[1]")
    public WebElement satirElementi;

    @FindBy(xpath = "//table//tr")
    public WebElement tableToblasu;


    public List<WebElement> tumHucreDegerleri() {
        List<WebElement> tabloSatiri=new ArrayList<>();

        WebElement istenenHucreDegeri =null;
        for (int i =1; i <16; i++) {
            String dinamikSatirXpath = "//tbody//tr//td[" + i + "]";
            istenenHucreDegeri = Driver.getDriver().findElement(By.xpath(dinamikSatirXpath));
            tabloSatiri.add(istenenHucreDegeri);
    } return tabloSatiri;

}
}



