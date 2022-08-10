package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.DBUtils;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

import static utilities.DatabaseUtility.getColumnData;

public class DBAppointmensVerify {
    String query;
    String fileName;

    @Given("E1Kullanici DataBase baglantısini kurar")
    public void e1kullanici_data_base_baglantısini_kurar() {
        String url = "jdbc:postgresql://medunna.com:5432/medunna_db";
        String username = "medunnadb_user";
        String password = "Medunnadb_@129";

        DatabaseUtility.createConnection(url,username, password);
    }
    @Given("E1Kullanici {string} tablosundan {string} lari alir")
    public void e1kullanici_tablosundan_lari_alir(String table, String data) {
        query = "select "+ data +" from "+table;
        System.out.println(DatabaseUtility.getColumnNames(query)  + "\n");
    }
    @Given("E1Kullanici icin  {string} sutunundaki datalari okur")
    public void e1kullanici_icin_sutunundaki_datalari_okur(String column) {
        System.out.println("=====================ID LIST==================");
        List<Object> nameList = getColumnData(query, column);
        System.out.println(nameList + "\n");
        fileName = "src/test/resources/testData/EDBAppoinmentTestData";
        WriteToTxt.saveDBTestData(fileName, nameList);
    }

    @And("E {string} sutununun {string} appointments icerdigini dogrular")
    public void eSutunununAppointmentsIcerdiginiDogrular(String column, String aranan) {

        List<Object> actualTestItemNames = ReadTxt.returnTestItemNamesList(fileName);
        List<Object> expectedTestItemNames = new ArrayList<>();
        expectedTestItemNames.add(aranan);

        Assert.assertTrue("Isim UYUSMUYOR", actualTestItemNames.containsAll(expectedTestItemNames));

    }
    @Given("E1DataBase kapatir")
    public void e1data_base_kapatir() {
        DBUtils.closeConnection();
    }



}
