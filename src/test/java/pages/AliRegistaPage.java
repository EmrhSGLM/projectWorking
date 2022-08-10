package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AliRegistaPage {
    public AliRegistaPage(){PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//*[@name='ssn']")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//*[contains(text(),'Registration Saved')]")
    public WebElement successMessageToastContainer;

    @FindBy(xpath = "//*[@name='firstName']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//*[@name='lastName']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailTextBox;

    @FindBy (xpath = "//div[@class='invalid-feedback']")
    public WebElement yourUsernameIsRequiredYazisi;

    @FindBy(id = "account-menu")
    public WebElement loginIkonu;

    @FindBy (xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement loginRegisterSekmesi;

    @FindBy (xpath = "//input[@id='ssn']")
    public WebElement SSNBox;

    @FindBy (xpath = "//div[@class='invalid-feedback']")
    public WebElement thisFieldIsInvalid;

    @FindBy (xpath = "//button[@id='register-submit']")
    public WebElement registerButonu;
    @FindBy (xpath = "//div[@class='invalid-feedback']")
    public WebElement yourEmailIsRequired;


}
