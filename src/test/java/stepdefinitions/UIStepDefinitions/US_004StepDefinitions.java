package stepdefinitions.UIStepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Homepage2;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_004StepDefinitions {


    Homepage2 homepage2=new Homepage2();
    ReusableMethods reusableMethods= new ReusableMethods();
    Actions actions= new Actions(Driver.getDriver());



    @Given("Kullanici ikon elementine tiklar")
    public void kullanici_ikon_elementine_tiklar() {
     homepage2.ikonElement.click();
    }
    @Then("Kullanici sign in yapar")
    public void kullanici_sign_in_yapar() {
     homepage2.signInButtonElement.click();
    }
    @Then("Kullanici gecerli bilgilerle giris yapar")
    public void kullanici_gecerli_bilgilerle_giris_yapar() {
       homepage2.userNameBoxElement.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys("drzuhal"+ Keys.TAB).sendKeys("Drzuhal308*").perform();
        homepage2.signInGirisButtonElement.click();
    }
    @Then("Kullanicinin basarili giris yaptigini dogrulayiniz")
    public void kullanicinin_basarili_giris_yaptigini_dogrulayiniz() {

    }
    @Then("Kullanici gecersiz bilgilerle giris yapamaz")
    public void kullanici_gecersiz_bilgilerle_giris_yapamaz() {

    }


    /* *** US004-TC001 *** */
    @Given("Kullanıcı anasayfa uzerinden Sign-In butonuna tıklar")
    public void kullanıcı_anasayfa_uzerinden_sign_in_butonuna_tıklar() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        homepage2.userGirisElement.click();
        homepage2.userLoginElement.click();
    }
    @Given("Kullanıcı Sign-In ekranına bağlanır ve görür.")
    public void kullanıcı_sign_in_ekranına_bağlanır_ve_görür() {
        String expectedloginPageUrl="https://www.medunna.com/login";
        String actualloginPageUrl=Driver.getDriver().getCurrentUrl();
        System.out.println(actualloginPageUrl);
        Assert.assertEquals(expectedloginPageUrl, actualloginPageUrl);
    }
    @Given("Kullanıcı username girer.")
    public void kullanıcı_username_girer() {
        homepage2.usernameElement.sendKeys("drzuhal");
    }
    @Given("Kullanici password girer.")
    public void kullanici_password_girer() {
        homepage2.passwordElement.sendKeys("Drzuhal308*");
    }

    @And("Kullanici sign-in butonuna tıklar")
    public void kullaniciSignInButonunaTıklar() {
        homepage2.signInButton.click();
    }
    @Given("Kullanıcı profiline başarıyla erişir ve bunu doğrular.")
    public void kullanıcı_profiline_başarıyla_erişir_ve_bunu_doğrular() {
        Assert.assertTrue(homepage2.signedInButton.isDisplayed());
    }
    @Then("Kullanici profilinden çıkış yapar.")
    public void kullanici_profilinden_çıkış_yapar() {
        homepage2.signedInButton.click();
        homepage2.signOutButton.click();
    }

    /* *** US004 - TC002 *** */
    @Given("Kullanici kimlik bilgilerini kutulara yazar.")
    public void kullanici_kimlik_bilgilerini_kutulara_yazar() {
        homepage2.usernameElement.sendKeys("drzuhal");
        homepage2.passwordElement.sendKeys("Drzuhal308*");
    }
    @Given("Kullanici Remember Me kutusuna tıklar.")
    public void kullanici_kutusuna_tıklar(String string) {
        homepage2.rememberMeButton.click();
    }
    @Then("Kullanici bilgileri hatırlanır ve sign in ile giris yapar.")
    public void kullanici_bilgileri_hatırlanır_ve_sign_in_ile_giris_yapar() {
        homepage2.signInButton.click();
    }
    /* *** US004 - TC003 *** */
    @Then("Kullanici yanlış password ile giriş yapar.")
    public void kullanici_yanlış_password_ile_giriş_yapar() {
        homepage2.usernameElement.sendKeys("drzuhal");
        homepage2.passwordElement.sendKeys("123");
        homepage2.signInButton.click();
        reusableMethods.waitFor(5);
    }
    @Then("Kullanıcı Profiline bağlanamadığını görür.")
    public void kullanıcı_profiline_bağlanamadığını_görür() {
        Assert.assertTrue(homepage2.failedToSignInElement.isDisplayed());
    }
    @Then("Kullanici Did you forget your password? butonuna tıklar.")
    public void kullanici_butonuna_tıklar() {
        homepage2.didYouForgetYourPasswordElement.click();
    }
    @Then("Kullanici Did you forget your password? ekranına baglanır.")
    public void kullanici_ekranına_baglanır(String string) {
        Assert.assertTrue(homepage2.resetButtonText.isDisplayed());
    }
    @Then("Kullanici mail adresini yazar ve şifresini resetler.")
    public void kullanici_mail_adresini_yazar_ve_şifresini_resetler() {
        homepage2.resetPasswordEnterEmail.sendKeys("team91doctor@medunna.com");
        homepage2.resetPasswordButton.click();
        reusableMethods.waitFor(5);
    }
    @Then("Kullanici yeni şifresi ile profiline giriş  yapar.")
    public void kullanici_yeni_şifresi_ile_profiline_giriş_yapar() {
        homepage2.userGirisElement.click();
        homepage2.userLoginElement.click();
        homepage2.usernameElement.sendKeys("drzuhal");
        homepage2.passwordElement.sendKeys("Drzuhal308*");
        homepage2.signInButton.click();
    }
    @Then("Kullanici profiline bağlanabilidğini görür.")
    public void kullanici_profiline_bağlanabilidğini_görür() {
        Assert.assertTrue(homepage2.signedInButton.isDisplayed());
    }
    /* *** US004 - TC004 *** */
    @Given("Kullanici anasayfaya erisir.")
    public void kullanici_anasayfaya_erisir() {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
    }
    @Given("Kullanici Sign In butonu gorur.")
    public void kullanici_sign_in_butonu_gorur() {
        Assert.assertTrue(homepage2.userGirisElement.isDisplayed());
    }
    @Given("Kullanici Sign In butonuna tıklar.")
    public void kullanici_sign_in_butonuna_tiklar() {
        homepage2.userGirisElement.click();
        homepage2.userLoginElement.click();
    }
    @Then("Kullanici Sign In sayfasına erisir.")
    public void kullanici_sign_in_sayfasına_erisir() {
        Assert.assertTrue(homepage2.signInButton.isDisplayed());
    }
    @Then("Kullanici You don't have an account yet? Register a new account butonunu gorur.")
    public void kullanici_you_dont_have_an_account_yet_register_a_new_account_butonunu_gorur() {
        Assert.assertTrue(homepage2.registerNewAccountButton.isDisplayed());
    }
    @Then("Kullanici You don't have an account yet? Register a new account butonuna tıklar.")
    public void kullanici_you_dont_have_an_account_yet_register_a_new_account_butonuna_tıklar() {
        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
    }
    @Then("Kullanici Registration sayfasına erisir.")
    public void kullanici_registration_sayfasına_erisir() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        reusableMethods.waitFor(3);
        Assert.assertTrue(homepage2.registerButton.isDisplayed());
    }
    @Then("Kullanıcı anasayfaya geri doner.")
    public void kullanıcı_anasayfaya_geri_doner() {
        homepage2.homePageButton.click();
    }
    /* *** US004 - TC005 *** */
    @Then("Kullanici Cancel butonunu gorur.")
    public void kullanici_cancel_butonunu_gorur() {
        Assert.assertTrue(homepage2.cancelButton.isDisplayed());
    }
    @Then("Kullanıcı Cancel butonuna tıklar.")
    public void kullanıcı_cancel_butonuna_tıklar() {
        homepage2.cancelButton.click();
        homepage2.cancelButton.click();
    }
    @Then("Kullanici anasayfaya tekrar yonlendirildigini gorur.")
    public void kullanici_anasayfaya_tekrar_yonlendirildigini_gorur() {
        Assert.assertTrue(homepage2.homePageLogo.isDisplayed());
    }


}
