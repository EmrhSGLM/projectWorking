package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_018_AdminPage {

    public US_018_AdminPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement aItemsTitleLinki;

    @FindBy(xpath = "//span[text()='Physician']")
    public WebElement aPhysicianLinki;

    @FindBy (xpath = "(//div[@class='table-responsive'])[2]")
    public WebElement aTableTumElementler;

    @FindBy(xpath = "//input[@id='physician-id']")
    public WebElement aPhysicianId;

    @FindBy(xpath = "//span[text()='Create a new Physician']")
    public WebElement aCreateAnewPhysicianbutonu;

    @FindBy(xpath = "//input[@id='useSSNSearch']")
    public WebElement aUseSearchCheckBox;

    @FindBy(xpath = "//input[@id='searchSSN']")
    public WebElement aSearchSsnTextBox;

    @FindBy(xpath = "//button[text()='Search User']")
    public WebElement aSearchUserButonu;

    @FindBy(xpath = "//input[@id='physician-firstName']")
    public WebElement aPhysicianFirstNameTextBox;

    @FindBy(xpath = "//input[@id='physician-lastName']")
    public WebElement aPhysicianLastNameTextBox;

    @FindBy(xpath = "//input[@id='physician1-birthDate']")
    public WebElement aDateElementi;

    @FindBy(xpath = "//input[@id='physician-adress']")
    public WebElement aAdresTextBox;

    @FindBy(xpath = "//select[@id='physician-speciality']")
    public WebElement aSpecialityDropDown;

    @FindBy(xpath = "//input[@id='file_image']")
    public WebElement aImageSecButonu;

    @FindBy(xpath = "//img[@style='max-height: 100px;']")
    public WebElement aKucukResimGoruntusu;

    @FindBy(xpath = "//select[@id='physician-user']")
    public WebElement aUserDropDown;

    @FindBy(xpath = "(//div[@class='form-group'])[22]")
    public WebElement aUserGoruntulemeElementi;

    @FindBy(xpath = "//input[@id='physician-examFee']")
    public WebElement aExamFeeTextBox;

    @FindBy(xpath = "//input[@id='physician-phone']")
    public WebElement aPhoneTextBox;

    @FindBy(xpath = "(//span[text()='Delete'])[21]")
    public WebElement aAlertDeleteButonu;

}
