package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminFundaPage {

    public AdminFundaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Funda Yay']")
    public WebElement adminIsmi;

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement itemstitles;

    @FindBy(xpath = "//span[text()='Room']")
    public WebElement room;

    @FindBy(xpath = "//span[text()='Create a new Room']")
    public WebElement CreateANewRoom;

    @FindBy(xpath = "//input[@name='roomNumber']")
    public WebElement roomNumber;

    @FindBy(xpath = "//select[@id='room-roomType']")
    public WebElement roomType;

    @FindBy(xpath = "//input[@id='room-status']")
    public WebElement status;

    @FindBy(xpath = "//input[@id='room-price']")
    public WebElement price;

    @FindBy(xpath = "//input[@id='room-description']")
    public WebElement description;

    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement date;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement save;

    @FindBy(xpath = "//*[contains(text(),'A new Room is created with identifier')]")
    public WebElement saveToastify;

    @FindBy(xpath = "//div[.='This field is required.']")
    public WebElement hataMesaji;

    @FindBy(xpath = "//span[text()='Rooms']")
    public  WebElement roomsTalosu;

    @FindBy(xpath = "//thead//tr//th[3]")
    public WebElement roomTypeTablo;

    @FindBy(xpath = "//thead/tr/th[1]")
    public WebElement idTablosu;

    @FindBy(xpath ="//tbody/tr")
    public List<WebElement> allRows;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[1]/a")
    public List<WebElement> idDatalari;

    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement edit;


    @FindBy(xpath = "//a[.='»»']")
    public WebElement lastPage;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public List<WebElement> invalidFeedbacks;

    @FindBy(id = "jhi-confirm-delete-room")
    public WebElement deleteConfirm;

    @FindBy(xpath = "//span/span[.='Delete']")
    public List<WebElement> deleteElements;

    @FindBy(xpath = "//span/span[.='Edit']")
    public List<WebElement> editElements;


}
