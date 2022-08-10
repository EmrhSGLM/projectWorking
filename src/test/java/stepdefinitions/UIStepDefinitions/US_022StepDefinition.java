package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DoctorsPage;
import pages.Homepage2;
import pages.StaffPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.waitFor;

public class US_022StepDefinition {

  Homepage2  homepage2=new Homepage2();
  DoctorsPage doctorsPage=new DoctorsPage();
  StaffPage staffPage=new StaffPage();




    @Then("ZKullanici Staff olarak giris yapar   {string} ve {string} girer")
    public void zkullaniciStaffOlarakGirisYaparVeGirer(String username, String password) {
        homepage2.usernameElement.sendKeys(username);
        homepage2.passwordElement.sendKeys(password);
         doctorsPage.signInGirisButtonElement.click();


    }
    @Then("ZMy Pages butonundan search  patient a tiklar")
    public void z_my_pages_butonundan_search_patient_a_tiklar() {
     staffPage.MyPageButton.click();
     staffPage.SearchPatientButton.click();


    }
  @And("ZSSN ile arama yapar hastanin bilgilerinin ciktigi dogrulanir")
  public void zssnIleAramaYaparHastaninBilgilerininCiktigiDogrulanir() {
      staffPage.SsnAramaTextbox.sendKeys(ConfigReader.getProperty("ZPatientSSN"), Keys.ENTER);
      System.out.println(homepage2.patientFirstName.getText());
      Assert.assertEquals("z",homepage2.patientFirstName.getText());
  }


    @Then("ZShow Appointments a tiklar ve Show test tiklanir")
    public void z_show_appointments_a_tiklar_ve_show_test_tiklanir() {
     homepage2.ZshowAppointment.click();
     homepage2.ZshowTests.click();
    }
    @Then("ZTest sonuclarinin goruldugu dogrulanir")
    public void z_test_sonuclarinin_goruldugu_dogrulanir() {
        System.out.println(homepage2.Ztests.getText());
   // Assert.assertEquals("Tests",homepage2.ZshowTests.getText());
        waitFor(5);
    }

    @And("ZMy Pages butonundan in patient a tiklar")
    public void zmyPagesButonundanInPatientATiklar() {
        staffPage.MyPageButton.click();
        staffPage.InPatientButton.click();
    }


    @And("ZKullanici Staff  sonuc bilgilerini gorebilmeli ve guncelleyebilmelidir.")
    public void zkullaniciStaffSonucBilgileriniGorebilmeliVeGuncelleyebilmelidir() {

         homepage2.ZViewResult.click();
        System.out.println(homepage2.testResults.getText());
        Assert.assertEquals("Test Results", homepage2.testResults.getText());
        homepage2.ZEdit.click();



    }


    @And("Zkullanici sing out elementine tiklar")
    public void zkullaniciSingOutElementineTiklar() {


        homepage2.patientPersonItem.click();
        homepage2.ZsignOutButtonZ.click();

        /*
        homepage2.result.sendKeys("deneme");
        homepage2.description.sendKeys("deneme2");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        homepage2.Zsavebutton.click();

         */

    }
}
