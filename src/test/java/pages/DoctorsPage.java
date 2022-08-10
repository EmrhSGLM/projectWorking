package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class DoctorsPage {
    public DoctorsPage(){  PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath="(//a[@href='#'])[1]")
    public WebElement ikonElement;

    @FindBy (xpath="//span[.='Sign in']")
    public WebElement signInButtonElement;

    @FindBy (xpath="///a[@href='/logout']")
    public WebElement signOutButtonElement;

    @FindBy (xpath="//input[@name='username']")
    public WebElement userNameBoxElement;

    @FindBy (xpath="//input[@name='password']")
    public WebElement passwordBoxElement;

    @FindBy (xpath="//button[@type='submit']")
    public WebElement signInGirisButtonElement;

    @FindBy (xpath="//span[.='MY PAGES']")
    public WebElement myPagesButtonElement;

    @FindBy (xpath="(//a[@href='/physician-appointment'])[1]")
    public WebElement myAppointmentsButtonElement;

    @FindBy (xpath="//h2[@id='appointment-heading']")
    public WebElement appointmentsTextElement;

    @FindBy (xpath="//input[@name='fromDate']")
    public WebElement fromDateBoxElement;

    @FindBy (xpath="//input[@name='toDate']")
    public WebElement toDateBoxElement;

    @FindBy (xpath="//*[.='Start DateTime']")
    public WebElement startDateTimeBoxElement;

    @FindBy (xpath="//*[.='End DateTime']")
    public WebElement endDateTimeBoxElement;


}
