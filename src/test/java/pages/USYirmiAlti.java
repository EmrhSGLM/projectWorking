package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class USYirmiAlti {
    public USYirmiAlti() {


        //PageFactory.initElements(Driver.getDriver(),this);
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='#'])[1]")
    public WebElement yikonElement;

    @FindBy(xpath="//span[text()='Sign in']") //xpath //span[text()='Sign in']

    public WebElement ysignInButtonElement;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement yuserNameBoxElement;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement ypasswordBoxElement;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement ysignInGirisButtonElement;
    @FindBy(xpath = "//a[class='d-flex align-items-center nav-link']")
    public WebElement ycontactButonu;
    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement ymesajKutusu;
    @FindBy(xpath = "(//div[@class='form-group'])[4]")
    public WebElement ymesajGörunurluk;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement yfirstnameKutusu;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ySsnKutusu;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement ylastNameKutusu;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement ynameKutusu;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement ysubjectKutusu;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement yemailKutusu;


    //textarea[@name='message']
//button[@type='submit']
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement ySendButonu;


    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement yYourMesajHasBeenYaziElementi;
    @FindBy(xpath = "//*[@id='login-item']")
    public WebElement sinButonu;
}