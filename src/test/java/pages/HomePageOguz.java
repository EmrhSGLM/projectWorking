package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePageOguz {

    public HomePageOguz(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//input[@id='firstPassword']")
    public WebElement newPasswordBox;

    @FindBy(xpath = "//div[@class='jh-card card']//li[1]")
    public WebElement  passwordStrength1Red;

    @FindBy(xpath = "//div[@class='jh-card card']//li[2]")
    public WebElement  passwordStrength2orange;

    @FindBy(xpath = "//div[@class='jh-card card']//li[3]")
    public WebElement  passwordStrength3orange;

    @FindBy(xpath = "//div[@class='jh-card card']//li[4]")
    public WebElement  passwordStrength4green;

    @FindBy(xpath = "//div[@class='jh-card card']//li[5]")
    public WebElement  passwordStrength5green;


}
