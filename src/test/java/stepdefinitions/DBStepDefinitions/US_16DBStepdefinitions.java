package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DBUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static utilities.DBUtils.createConnection;
import static utilities.DBUtils.executeQuery;

public class US_16DBStepdefinitions {
    String query="";

    @Given("Verilen kullanıcı Veritabanına bağlanır")
    public void verilen_kullanıcı_veritabanına_bağlanır() {
        createConnection();
    }
    @When("Kullanici {string} icin {string} tablosundan {string} sectiginde")
    public void kullanici_icin_tablosundan_sectiginde(String arg0, String arg1, String arg2) {
        String query="Select "+arg0+" from "+arg1+" where "+ arg2;
        executeQuery(query);
    }
    @When("Ve verilerin {int}, {int}, {string}, {string}, {string}, {string} bilgilerini icerdigini dogrulayin")
    public void ve_verilerin_bilgilerini_icerdigini_dogrulayin(int id, int roomNumber, String price, String roomType, String status, String description) throws Exception {
        List<Map<String,Object>> actualRoomData= DBUtils.getQueryResultMap(query);
//        System.out.println(actualRoomData);
        System.out.println(price);
        Map<String,Object> expectedData=new HashMap<>();

        expectedData.put("price",price);
        expectedData.put("room_number",roomNumber);
        expectedData.put("description",description);
        expectedData.put("id",Long.valueOf(id));
        expectedData.put("room_type",roomType);
        expectedData.put("status",Boolean.parseBoolean(status));
        for (Map<String,Object> eachRoom:actualRoomData
        ) {

            if(eachRoom.get("room_number").equals(expectedData.get("room_number"))){
                System.out.println(eachRoom);
                assertEquals(eachRoom.get("id"),expectedData.get("id"));
                assertEquals(eachRoom.get("room_type"),expectedData.get("room_type"));
                assertEquals(eachRoom.get("status"),expectedData.get("status"));
                assertEquals( eachRoom.get("price").toString(), expectedData.get("price"));
                assertEquals(eachRoom.get("description"),expectedData.get("description"));

                break;

            }

        }
    }
    @Then("Ardından kullanıcı veritabanı bağlantısını kapatın")
    public void ardından_kullanıcı_veritabanı_bağlantısını_kapatın() {
    }

}
