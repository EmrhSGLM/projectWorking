package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_017Pages {

    public US_017Pages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Emrah Admin']")
    public WebElement adminLoginNameTextElement;

    @FindBy(xpath = "//span[.='Items&Titles']")
    public WebElement itemsTitlesButtonElement;

    @FindBy(xpath = "//span[.='Test Item']")
    public WebElement testItemButtonElement;

    @FindBy(xpath = "//span[.='Create a new Test Item']")
    public WebElement createANewTestItemButtonElement;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameTestBoxElement;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButtonElement;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement toastOlusturulduTextElement;

    @FindBy(xpath = "(//li[@class='page-item'])[6]")
    public WebElement lastPageElement;

    @FindBy(xpath = "//tbody//tr//td[2]")
    public WebElement lastPageNameBoxElement;

    // TC_1703 Admin test öğelerini görüntüleyebilir.

    @FindBy(xpath = "//span[.='Test Items']")
    public WebElement testItemsTextElement;



}
