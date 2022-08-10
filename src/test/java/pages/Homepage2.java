package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Homepage2 {

    public Homepage2(){PageFactory.initElements(Driver.getDriver(),this); }

         /* US004 - TC001 */
         @FindBy(xpath ="//a[@class='d-flex align-items-center dropdown-toggle nav-link']//*[name()='svg']")
         public WebElement userGirisElement;
         @FindBy (xpath="//a[@id='login-item']")
         public WebElement userLoginElement;
         @FindBy (xpath = "//input[@id='username']")
         public WebElement usernameElement;
         @FindBy (xpath = "//input[@id='password']")
         public WebElement passwordElement;
         @FindBy (xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
         public WebElement signInButton;
         @FindBy (xpath = "//span[normalize-space()='Cancel']")
         public WebElement cancelButton;
            //span[normalize-space()='team 91']
         @FindBy (xpath = "//li[@id='account-menu']")
         public WebElement signedInButton;
         @FindBy (xpath = "//li[@id='account-menu']//a[3]")
         public WebElement signOutButton;
         @FindBy(xpath = "(//a[@href='#'])[2]")
         public WebElement signOutButtonZ;
         @FindBy (xpath = "//h5[@class='modal-title']//span[contains(text(),'Sign in')]")
         public WebElement signInTextElement;
         /* US004 - TC002 */
         //input[@id='rememberMe']
         @FindBy (xpath = "//input[@value='false']")
         public WebElement rememberMeButton;
         /* US004 - TC003 */
         @FindBy (xpath = "(//div[@class='col-md-12'])[1]")
         public WebElement failedToSignInElement;
         @FindBy (xpath = "//span[normalize-space()='Did you forget your password?']")
         public WebElement didYouForgetYourPasswordElement;
         @FindBy (xpath = "//span[normalize-space()='Reset your password']")
         public WebElement resetYourPasswordElement;
         @FindBy (xpath = "//input[@id='email']")
         public WebElement resetPasswordEnterEmail;
         //button[@type='submit']
         @FindBy (xpath = "//button[@type='submit']")
         public WebElement resetPasswordButton1;
         //span[text()='Reset your password']
         @FindBy (xpath = "//span[text()='Reset your password']")
         public WebElement resetButtonText;
         @FindBy (xpath = "//span[normalize-space()='Reset password']")
         public WebElement resetPasswordButton;
         /* US004 - TC004 */
         //span[normalize-space()='Register a new account']
         //span[contains(text(),'Register a new account')]
         @FindBy (xpath = "//span[contains(text(),'Register a new account')]")
         public WebElement registerNewAccountButton;
         @FindBy (xpath = "//button[@id='register-submit']//span[contains(text(),'Register')]")
         public WebElement registerButton;
         @FindBy (xpath = "//span[contains(text(),'HOME')]")
         public WebElement homePageButton;
         /* US004 - TC005 */
         @FindBy (xpath = "//button[@class='btn btn-secondary']")
         public WebElement userGirisCancelButton;
         @FindBy (xpath = "//img[@alt='Logo']")
         public WebElement homePageLogo;

        @FindBy(xpath="(//a[@href='#'])[1]")
        public WebElement ikonElement;
        @FindBy (xpath="//span[.='Sign in']")
        public WebElement signInButtonElement;

        @FindBy (xpath="//input[@name='username']")
        public WebElement userNameBoxElement;

        @FindBy (xpath="//input[@name='password']")
        public WebElement passwordBoxElement;

        @FindBy (xpath="//button[@type='submit']")
        public WebElement signInGirisButtonElement;

        @FindBy(xpath = "//span[.='Register']")
        public WebElement registerButonElemnti;

        @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
        public WebElement loginPageMakeAnAppointmentButton;

        @FindBy(xpath = "(//div[@class='section-title'])[2]")
        public WebElement makeAnAppointmentText;

        @FindBy(xpath = "//*[@for='firstName']")
        public WebElement makeAnAppointmentFirstNameAssert;

        @FindBy(xpath = "//input[@id='firstName']")
        public WebElement makeAnAppointmentFirstNameBox;

        @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
        public WebElement makeAnAppoinmentFirstNameFeedBack;

        @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
        public WebElement makeAnAppoinmentLastNameFeedBack;

        @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
        public WebElement makeAnAppoinmentSSNFeedBack;

        @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
        public WebElement makeAnAppoinmentEmailFeedBack;

        @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
        public WebElement makeAnAppoinmentPhoneFeedBack;

        @FindBy(xpath = "//span[@style='color: red; font-size: 12px; border-color: red;']")
        public WebElement makeAnAppoinmentAppointmentDateTimeFeedBack;


        @FindBy (xpath ="//*[@id='app-view-container']/div/div/div/div[2]/div/table/tbody/tr/td[3]")
        public WebElement patientFirstName;

        @FindBy(xpath = "(//a[@href='#'])[3]")
        public WebElement us017;

        @FindBy(xpath = "(//a[@href='#'])[2]")
        public WebElement patientPersonItem;

        @FindBy(xpath = "//span[text()='Sign out']")
        public WebElement ZsignOutButtonZ;

        @FindBy(xpath = "(//span[text()='Show Appointments'])[2]")
        public WebElement ZshowAppointment;

    @FindBy(xpath = "//span[text()='Show Tests']")
    public WebElement ZshowTests;
    @FindBy(xpath = "//h2[@id='c-test-heading']")
    public WebElement Ztests;//span[text()='Tests']

    @FindBy(xpath = "(//span[text()='Edit'])[1]")
    public WebElement ZEdit;

    //span[text()='Edit'][1]

    @FindBy(xpath = "//input[@name='startDate']")
    public WebElement ZStartdate;

    @FindBy(xpath = "//input[@name='endDate']")
    public WebElement ZEnddate ;

    @FindBy (xpath = "//span[text()='View Results']")
    public WebElement ZViewResult;

    @FindBy(xpath = "//span[text()='Test Results']")
    public WebElement testResults;

    @FindBy(xpath = "//input[@name='result']")
    public WebElement  result;

    @FindBy (xpath = "//input[@name='description']")
    public WebElement  description;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement Zsavebutton;
    //span[text()='Items&Titles']

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement ZitemButtonu;

    @FindBy(xpath ="//span[text()='Country']")
    public WebElement Zcountry;

    @FindBy(xpath = "//span[contains(text(),'Create a new Country')]")
    public WebElement createANewCountry;

    //input[@id='country-name']
    @FindBy(xpath = "//input[@id='country-name']")
    public WebElement ZnameCountry;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[7]")
    public WebElement Zstate;

    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement ZcreateState;

    @FindBy(xpath = "//input[@id='c-state-name']")
    public WebElement ZStateName;

    @FindBy(xpath = "//select[@name='state.id']")
    public WebElement ZStateCountry;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement Zsave;

    @FindBy(xpath ="(//span[text()='Delete'])[1]")
    public WebElement ZDelete;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement ZDeleteButtonu;



}
