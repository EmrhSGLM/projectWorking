package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.DBUtils;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

import static utilities.DatabaseUtility.getColumnData;

public class DBTestItemVerify {
    String query;
    String fileName1;

    @Given("EKullanici DataBase baglantısini kurar")
    public void ekullanici_data_base_baglantısini_kurar() {

        String url = "jdbc:postgresql://medunna.com:5432/medunna_db";
        String username = "medunnadb_user";
        String password = "Medunnadb_@129";

        DatabaseUtility.createConnection(url,username, password);

    }


    @Given("EKullanici {string} tablosundan {string} lari alir")
    public void ekullanici_tablosundan_lari_alir(String table, String data) {
        query = "select "+ data +" from "+table;
        System.out.println(DatabaseUtility.getColumnNames(query)  + "\n");
    }


    @Given("EKullanici {string} sutunundaki datalari okur")
    public void ekullanici_sutunundaki_datalari_okur(String column) {
        System.out.println("=====================NAME LIST==================");
        List<Object> nameList = getColumnData(query, column);
        System.out.println(nameList + "\n");
        fileName1 = "src/test/resources/testData/EDBTestItemTestData";
        WriteToTxt.saveDBTestData(fileName1, nameList);
    }

    @Given("E{string} sutununun {string} icerdigini dogrular")
    public void esutununun_icerdigini_dogrular(String column, String aranan) {

        List<Object> actualTestItemNames = ReadTxt.returnTestItemNamesList(fileName1);
        List<Object> expectedTestItemNames = new ArrayList<>();
        expectedTestItemNames.add(aranan);

       Assert.assertTrue("Isim UYUSMUYOR", actualTestItemNames.containsAll(expectedTestItemNames));
        System.out.println("\nISLEM SONUCU\n");
       System.out.println("DataBase den dogrulama islemi BASARIYLA GERCEKLESTIRILDI");

    }


    @Given("EDataBase kapatir")
    public void edata_base_kapatir() {
        DBUtils.closeConnection();
    }



}
