package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US021 {

    public US021(){
     PageFactory.initElements(Driver.getDriver(), this);
}
   @FindBy(xpath ="(//*[@class='d-flex align-items-center dropdown-toggle nav-link'])[1]")
    public WebElement StaffMyPages;

    @FindBy(xpath ="(//*[@class='svg-inline--fa fa-search fa-w-16 fa-fw '])[1]")
    public WebElement StaffMyPagesSearchPatient;

    @FindBy(xpath ="//*[@id='patient-heading']")
    public WebElement PatientsHeading;

    @FindBy(xpath ="//*[@class='col-sm-1']")
    public WebElement PatientSSN;

    @FindBy(xpath ="//*[@name='ssn']")
    public WebElement PatientSSNBox;

    @FindBy(xpath ="//*[text()='Kate']")
    public WebElement KateAssert;

    @FindBy(xpath ="//*[text()='Show Appointments']")
    public WebElement ShowAppointmentsButton;

    @FindBy(xpath ="(//*[@class='d-none d-md-inline'])[1]")
    public WebElement ShowAppEditButton;

    @FindBy(xpath ="//*[@id='appointment-status']")
    public WebElement EditStatus;

    @FindBy(xpath ="//*[text()='PENDING']")
    public WebElement EditStatusPENDING;

    @FindBy(xpath ="//*[@id='save-entity']")
    public WebElement EditSaveButton;

    @FindBy(xpath ="//*[contains(text(),'The Appointment is update with identifier 57761')]")
    public WebElement EditSaveToastContainer;

    @FindBy(xpath ="//*[text()='GERMANY']")
    public WebElement EditCountryGERMANY;

    @FindBy(xpath ="//*[@id='patient-country']")
    public WebElement EditCountry;

     @FindBy(xpath =" (//*[@class='btn btn-primary btn-sm'])[1]")
     public WebElement AgainEditButton;

     @FindBy(xpath ="//*[text()='UNAPPROVED']")
     public WebElement EditStatusUNAPPROVED;

     @FindBy(xpath ="//*[text()='CANCELLED']")
     public WebElement EditStatusCANCELLED;

     @FindBy(xpath ="//*[text()='COMPLATED']")
     public WebElement EditStatusCOMPLATED;

     @FindBy(xpath ="//*[@id='appointment-anamnesis']")
     public WebElement EditAnamnesisD;

     @FindBy(xpath ="//*[@id='appointment-treatment']")
     public WebElement EditTreatment;

    @FindBy(xpath ="//*[@id='appointment-diagnosis']")
    public WebElement EditDiagnosis;

 @FindBy(xpath ="//*[@id='appointment-physician']")
 public WebElement EditPhysician;

 @FindBy(xpath ="//*[text()='10524:emre dr:PSYCHIATRY']")
 public WebElement EditJonhKing;



 public void getScreenshot(String viewtoastContainer, WebElement editSaveToastContainer) {
 }
}