package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Us_023_024_Page {
    public Us_023_024_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@name='ssn']")
    public WebElement patientSSNbolumu;

    @FindBy (xpath = "//span[normalize-space()='Search Patient']")
    public WebElement searchPatientSekmesi;

    @FindBy (xpath = "(//span[@class='d-none d-md-inline'])[3]")
    public WebElement showAppointments;

    @FindBy (xpath = "//span[.='Payment / Invoice Process']")
    public WebElement paymentInvoiceElement;

    @FindBy (xpath = "(//span[@class='d-none d-md-inline'])[3]")
    public WebElement paymentInvoiceButon;

    @FindBy (xpath = "//a[@class='btn btn-success btn-sm']")
    public WebElement showInvoice;

    @FindBy (xpath = "//th[.='INVOICE']")
    public WebElement invoiceTextElementi;

    @FindBy (xpath = "//span[normalize-space()='My Appointments']")
    public WebElement myAppointments;

    @FindBy (xpath = "(//span[@class='d-none d-md-inline'])[1]")
    public WebElement showTests;

    @FindBy (xpath = "//span[normalize-space()='Tests']")
    public WebElement testTextElementi;

    @FindBy (xpath = "//span[contains(text(),'Show Invoice')]")
    public WebElement hastaShowInvoice;

    @FindBy (xpath = "//span[normalize-space()='My Appointments']")
    public WebElement patientMyAppointments;

    @FindBy (xpath = "//span[contains(text(),'Show Tests')]")
    public WebElement patientShowTest;

    @FindBy (xpath = "//span[normalize-space()='Tests']")
    public WebElement patientTestTextElementi;

    @FindBy (xpath = "//span[contains(text(),'Show Invoice')]")
    public WebElement patientShowInvoice;

    @FindBy (xpath = "//th[normalize-space()='INVOICE']")
    public WebElement patientInvoiceTextElementi;

    @FindBy (xpath = "//span[normalize-space()='MY PAGES']")
    public WebElement myPagesButton;

    @FindBy (xpath = "//span[normalize-space()='MY PAGES(PATIENT)']")
    public WebElement myPagesPatientButton;

    @FindBy (xpath = "//span[normalize-space()='MY PAGES']")
    public WebElement myPagesStaffButton;

    @FindBy (xpath = "//a[@href='/payment-detail/76305']")
    public WebElement paymentInvoiceButonButton;




}
