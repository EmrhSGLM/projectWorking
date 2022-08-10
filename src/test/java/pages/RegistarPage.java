package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistarPage {
    public RegistarPage(){PageFactory.initElements(Driver.getDriver(),this);   }

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement firstnameyanlisdata;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])")
    public WebElement lastnameyanlısdata;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])")
    public WebElement emailyanlisdata;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailkutusu;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastnamekutusu;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstnamekutusu;

    @FindBy(xpath = "//div[@class='Toastify']")
    public WebElement settingsSavedYaziElementi;

    @FindBy (xpath = "//span[text()='Save']")

    public WebElement userSaveButonu;
    @FindBy(xpath = "//span[normalize-space()='Settings']")
    public WebElement settingsbutonu;
}
