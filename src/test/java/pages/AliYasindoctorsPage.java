package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AliYasindoctorsPage {
    public AliYasindoctorsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[2]")
    public WebElement editButonu;
    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement showTestResultsButonu;
    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement viewResultsButonu;
    @FindBy(xpath = "//h2[@id='c-test-result-heading']")
    public WebElement testResultsYazisi;
    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement requestInpatientButonu;
    @FindBy (xpath = "//a[normalize-space()='333-22-0611:aliko hasta']")
    public WebElement hastaninIsmi;
    @FindBy (xpath = "//span[normalize-space()='My Inpatients']")
    public WebElement MyInpatientsButonu;
    @FindBy (xpath = "//select[@id='in-patient-status']")
    public WebElement statusBox;
    @FindBy (xpath = "//select[@id='in-patient-room']")
    public WebElement roomBox;
    @FindBy (xpath = "//input[@id='in-patient-id']")
    public WebElement inPatientEditId;

    @FindBy (xpath = "//input[@id='in-patient-createdDate']")
    public WebElement createDateBox;
}
