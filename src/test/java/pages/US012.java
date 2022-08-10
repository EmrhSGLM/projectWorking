package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US012 {
    public US012() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//a[@aria-haspopup='true'])[1]")
    public WebElement DRMyPages;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement DRMyPagesMyAppointments;
    @FindBy(xpath = "//input[@id='fromDate']")
    public WebElement myAppointmentsFromDate;
    @FindBy(xpath = "//input[@id='toDate']")
    public WebElement myAppointmentsToDate;
    @FindBy(xpath = "(//*[@class='svg-inline--fa fa-sort fa-w-10 '])[4]")
    public WebElement statusAssert;
    @FindBy (xpath = "//*[contains(text(),'Days between begin date and end date must be 15 days')]")
    public WebElement dateToastContainer;
    @FindBy(xpath = "//div[text()='PENDING']")
    public WebElement drAppointmentsStatus;
    @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm'])[1]")
    public WebElement drAppointmentsEdit;
    @FindBy(xpath ="//*[@id='hospitalmsappfrontendApp.appointment.home.createOrEditLabel']")
    public WebElement createOrEditAssert;
    @FindBy(xpath ="//*[@class='btn btn-success btn-sm']")
    public WebElement resualtATestButton;
    @FindBy(xpath ="//*[text()='Test Items']")
    public WebElement testItems;
    @FindBy(xpath ="//*[@id='1402']")
    public WebElement Urea;
    @FindBy(xpath ="//*[@id='1403']")
    public WebElement Creatinine;
    @FindBy(xpath ="//*[@id='1404']")
    public WebElement Sodium;
    @FindBy(xpath ="//*[@id='1405']")
    public WebElement Potassium;
    @FindBy(xpath ="//*[@id='1406']")
    public WebElement Totalprotein;
    @FindBy(xpath ="//input[@name='1407']")
    public WebElement Albumin;
    @FindBy(xpath ="//*[@id='1401']")
    public WebElement Glucose;
    @FindBy(xpath ="//*[@id='1408']")
    public WebElement Hemoglobin;
    @FindBy(xpath ="//*[@id='save-entity']")
    public WebElement SaveButton;
    @FindBy(xpath ="//*[@id='30057']")
    public WebElement LDL;
    @FindBy(xpath ="//*[text()='Chau test']")
    public WebElement CHO;
    @FindBy(xpath ="//*[text()='cholestrol']")
    public WebElement Albumin2;
    @FindBy(xpath ="//*[text()='Brianxtest']")
    public WebElement SaveButton2;
}