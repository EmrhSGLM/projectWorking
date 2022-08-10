package stepdefinitions.APIStepDefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.Room;
import pojos.RoomPost;
import utilities.ConfigReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static utilities.ApiUtils.*;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveRoomData;

public class US_16APİStepDefinitions {

    Room room;
    Response response;
    RoomPost roomPost;
    static String roomNumber="";
    static int price=0;
    static String createdDate="";
    String query="";

    @Given("Beklenen verileri {string}, {int}, {string} ve {string} olarak ayarlayın")
    public void beklenen_verileri_ve_olarak_ayarlayın(String description, int price, String roomType, String status) {
        Faker faker=new Faker();
        int number=faker.number().numberBetween(300,1000);
        boolean status2=Boolean.parseBoolean(status);
        roomPost= new RoomPost(description,price,number,roomType,status2);
    }
    @When("Kullanıcı {string} isteğini gönderdiğinde")
    public void kullanıcı_isteğini_gönderdiğinde(String arg0) throws Exception {
        switch (arg0){
            case "POST":
                response=postRequestRoom(generateToken(ConfigReader.getProperty("admin_username"),ConfigReader.getProperty("admin_password")),
                        ConfigReader.getProperty("base_url")+"/api/rooms",roomPost);
                break;
            case "GET":
                response=getRequest(generateToken(ConfigReader.getProperty("admin_username"),ConfigReader.getProperty("admin_password")),
                        ConfigReader.getProperty("base_url")+"/api/rooms");
                break;
            case "PUT":
                response=putRequestRoom(generateToken(ConfigReader.getProperty("admin_username"),ConfigReader.getProperty("admin_password")),
                        ConfigReader.getProperty("base_url")+"/api/rooms",room);
                break;
            default:
                break;
        }
    }

    @Then("Ardından yanıt gövdesinin beklenen bir veri olması gerektiğini doğrulayın.")
    public void ardından_yanıt_gövdesinin_beklenen_bir_veri_olması_gerektiğini_doğrulayın() throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        RoomPost actualRoom=objectMapper.readValue(response.asString(),RoomPost.class);

        assertEquals(roomPost.getDescription(),actualRoom.getDescription());
        assertEquals(roomPost.getPrice(),actualRoom.getPrice());
        assertEquals(roomPost.getRoomNumber(),actualRoom.getRoomNumber());
        assertEquals(roomPost.getRoomType(),actualRoom.getRoomType());
        assertEquals(roomPost.isStatus(),actualRoom.isStatus());
        JsonPath jsonPath=response.jsonPath();
        saveRoomData(String.valueOf(jsonPath.getInt("id")), jsonPath.getInt("price"), jsonPath.getString("createdDate") );
    }
    @Given("Beklenen verileri {string}, {int}, {int}, {string} ve {string} olarak ayarlayın")
    public void beklenen_verileri_ve_olarak_ayarlayın(String description, int price, int roomNumber, String roomType, String status){
        boolean status2=Boolean.parseBoolean(status);
        room=new Room(description,price,roomNumber,roomType,status2);
    }

    @Then("O zaman odalar için durum kodu {int} olmalıdır")
    public void o_zaman_odalar_için_durum_kodu_olmalıdır(int int1) {
        response.then().statusCode(int1);
    }
    @Then("Ardından yanıt gövdesinin beklenen tüm verileri içerdiğini doğrulayın")
    public void ardından_yanıt_gövdesinin_beklenen_tüm_verileri_içerdiğini_doğrulayın() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Room[] rooms = objectMapper.readValue(response.asString(), Room[].class);

        for (Room eachRoom : rooms
        ) {
            if (eachRoom.getRoomNumber() == room.getRoomNumber()) {
                assertEquals(room.getDescription(), eachRoom.getDescription());
                assertEquals(room.getPrice(), eachRoom.getPrice());
                assertEquals(room.getRoomType(), eachRoom.getRoomType());
                assertEquals(room.isStatus(), eachRoom.isStatus());
            }
        }
    }

    @Then("Ardından yanıt gövdesinin beklendiği gibi olması gerektiğini doğrulayın.")
    public void ardından_yanıt_gövdesinin_beklendiği_gibi_olması_gerektiğini_doğrulayın() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Room actualRoom = objectMapper.readValue(response.asString(), Room.class);

        assertEquals(room.getDescription(), actualRoom.getDescription());
        assertEquals(room.getPrice(), actualRoom.getPrice());
        assertEquals(room.getRoomNumber(), actualRoom.getRoomNumber());
        assertEquals(room.getRoomType(), actualRoom.getRoomType());
        assertEquals(room.isStatus(), actualRoom.isStatus());
    }
    @Given("Verilen kullanıcı silme isteği gönderir")
    public void verilen_kullanıcı_silme_isteği_gönderir() {
        int id=0;
        try{

            //identify file location
            FileReader fileReader = new FileReader("./src/test/resources/testdata/RoomData.txt");

            //Read the records of the file in given location
            BufferedReader br = new BufferedReader(fileReader);

            String line = br.readLine().substring(5,10);
            System.out.println(line);
            id = Integer.parseInt(line);
            System.out.println(id);

        }catch (Exception e){

            e.printStackTrace();

        }

        response=deleteRequest(generateToken(ConfigReader.getProperty("admin_username"),ConfigReader.getProperty("admin_password")),
                ConfigReader.getProperty("base_url")+"/api/rooms/"+id);


    }
    @Given("{int} için beklenen verileri {string}, {int}, {int}, {string} ve {string} olarak ayarlayın")
    public void için_beklenen_verileri_ve_olarak_ayarlayın(String description, int price, int roomNumber, String roomType, String status, int roomId) {
        boolean status2=Boolean.parseBoolean(status);
        room=new Room(description,price,roomNumber,roomType,status2);
        room.setId(roomId);
    }

}
