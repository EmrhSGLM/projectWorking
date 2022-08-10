package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_101_Registiration {

    public US_101_Registiration (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Registration']")
    public WebElement getRegistrationWindowTitle;
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement registrationSsnTextBox;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement registrationFirstName;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement registrationLastName;
    @FindBy(xpath = "//div[text()='Your FirstName is required.']")
    public WebElement firstnameTextBosElementi;
    @FindBy(xpath = "//div[text()='Your LastName is required.']")
    public WebElement lastnameTextBosElementi;
    @FindBy(xpath = "//div[text()='Your SSN is required.']")
    public WebElement ssnTextBosElementi;
    @FindBy(xpath = "//div[text()='Your SSN is invalid']")
    public WebElement ssnTextHataliElement;
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement randevuSsnTextBox;
    @FindBy(xpath = "//div[text()='Your FirstName is invalid']")
    public WebElement firstNameTextHataliElement;
    @FindBy(xpath = "//div[text()='Your LastName is invalid']")
    public WebElement lastNameTextHataliElement;
    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement passwordTextBox;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement registrationUsername;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement registrationEmail;
    @FindBy(xpath = "//input[@name='secondPassword']")
    public WebElement registrationSecondPassword;


}
