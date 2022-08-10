package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.USYirmiAlti;
import utilities.ConfigReader;
import utilities.Driver;

public class US_026StepDefinetions {


    USYirmiAlti mesajgönderme= new USYirmiAlti();

    @Given("yKullanıcı url girer")
    public void y_kullanıcı_url_girer() {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));

    }
  //  @Given("Yikona tıklar")
  //  public void yikona_tıklar() {
      //  mesajgönderme.yikonElement.click();
       // ReusableMethods.waitFor(2000);

   // }
 //   @Given("Ysign in butonuna tıklar")
   // public void ysign_in_butonuna_tıklar() {
     //   mesajgönderme.sinButonu.click();
       // ReusableMethods.waitFor(1000);
      // clickElementByJS(mesajgönderme.yikonElement);

  //  }
    public static void clickElementByJS(WebElement element) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].click();", element);
    }
    @Given("Yonctact butonuna tıklar")
    public void yonctact_butonuna_tıklar() {
     clickElementByJS(mesajgönderme.ycontactButonu);
    }
    @Given("Ymesaj kısmını görür")
    public void ymesaj_kısmını_görür() {
        Assert.assertTrue(mesajgönderme.ymesajGörunurluk.isDisplayed());

    }

    @Given("Yhasta olarak giris yapar")
    public void yhasta_olarak_giris_yapar() {
        mesajgönderme.yikonElement.click();
        mesajgönderme.ysignInGirisButtonElement.click();


    }
    @Given("Ylastnama ,password girer")
    public void ylastnama_password_girer() {
        mesajgönderme.yuserNameBoxElement.sendKeys("yksl");
        mesajgönderme.ypasswordBoxElement.sendKeys("123456789");
        mesajgönderme.ysignInGirisButtonElement.click();

    }

    
    @Given("YAcılan sayfanin altinda \"name\"alanini doldurur.")
    public void y_acılan_sayfanin_altinda_name_alanini_doldurur() {
        mesajgönderme.ynameKutusu.sendKeys("hstyksl");

    }
    @Given("YEmail girer")
    public void y_email_girer() {
        mesajgönderme.yemailKutusu.sendKeys("yksl@gmai.com");

    }
    @Given("YSubject girer")
    public void y_subject_girer() {
        mesajgönderme.ysubjectKutusu.sendKeys("koray");

    }
    @Given("YMessage kutusuna mesajini yazar")
    public void y_message_kutusuna_mesajini_yazar() {
        mesajgönderme.ymesajKutusu.sendKeys("Hasteneninizin temizlik ve danısman ekibinden memnun kaldım ve ayrıca" +
                " tahlil sonuclarımın mail adresine gönderilmesini rica ediyorum");

    }
    @Given("YSend butonuna tıklar")
    public void y_send_butonuna_tıklar() {
        mesajgönderme.ySendButonu.click();

    }
    @Given("Y\"Your messege has bean recerved\" yazisini girer.")
    public void y_your_messege_has_bean_recerved_yazisini_girer() {
        Assert.assertTrue(mesajgönderme.yYourMesajHasBeenYaziElementi.isDisplayed());
        Driver.closeDriver();

    }
}
