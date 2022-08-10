package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US027 {
    public US027() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="(//*[@class='d-flex align-items-center dropdown-toggle nav-link'])[1]")
    public WebElement ItemTitles;

    @FindBy(xpath = "(//*[@href='/c-message'])[1]")
    public WebElement ItemTitlesMessages;

    @FindBy (xpath = "//*[@id='c-message-heading']")
    public WebElement HeadMessages;

    @FindBy(xpath = "(//*[@class='hand'])[3]")
    public WebElement MessagesEmail;

    @FindBy(xpath = "(//*[@class='hand'])[2]")
    public WebElement MessagesName;

    @FindBy(xpath = "(//*[@href='/c-message/77095'])[2]")
    public WebElement MessagesViewButton;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement Messages77095Email;

    @FindBy(xpath ="//*[@id='name']")
    public WebElement Messages77095Name;

    @FindBy(xpath = "(//*[@href='/c-message/77069'])[1]")
    public WebElement MessagesID1;

    @FindBy(xpath = "(//*[@href='/c-message/70951'])[1]")
    public WebElement MessagesID2;

    @FindBy(xpath = "(//*[@href='/c-message/70966'])[1]")
    public WebElement MessagesID3;

    @FindBy(xpath = "(//*[@href='/c-message/71928'])[1]")
    public WebElement MessagesID4;

    @FindBy(xpath = "(//*[@href='/c-message/70999'])[1]")
    public WebElement MessagesID44;

    @FindBy(xpath = "(//*[@href='/c-message/71940'])[1]")
    public WebElement MessagesID5;

    @FindBy(xpath = "(//*[@href='/c-message/77052'])[1]")
    public WebElement MessagesID6;

    @FindBy(xpath = "(//*[@href='/c-message/77064'])[1]")
    public WebElement MessagesID7;

    @FindBy(xpath = "(//*[@href='/c-message/77073'])[1]")
    public WebElement MessagesID8;

    @FindBy(xpath = "(//*[@href='/c-message/77082'])[1]")
    public WebElement MessagesID9;

    @FindBy(xpath = "(//*[@href='/c-message/77092'])[1]")
    public WebElement MessagesID10;

    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement CreateANewMessageButton;

    @FindBy(xpath ="//*[@id='c-message-name']")
    public WebElement CreateMessageNameBox;

    @FindBy(xpath ="//*[@id='c-message-email']")
    public WebElement CreateMessageEmailBox;

    @FindBy(xpath ="//*[@id='c-message-subject']")
    public WebElement CreateMessageSubjectBox;

    @FindBy(xpath ="//*[@id='c-message-message']")
    public WebElement CreateMessageMessageBox;

    @FindBy(xpath ="//*[@id='save-entity']")
    public WebElement CreateMessageSaveButton;

    @FindBy(xpath ="//*[@href='/c-message/77095/edit']")
    public WebElement MessageEditButton;







}
