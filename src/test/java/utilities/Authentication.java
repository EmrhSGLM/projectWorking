package utilities;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {

    /*
    public static void main(String[] args) {

        System.out.println(generateToken("",""));
    }
    */


    public static String generateToken(String username, String password){
        //username = "ADMINEmrah";
        //password = "Amine2016+-";

        Map <String, Object> map=new HashMap <String, Object>();
        map.put("username", username);
        map.put("password", password);
        //map.put("remember me", "true");

        String endPoint = "https://www.medunna.com/api/authenticate";

        Response response = given().
                contentType(ContentType.JSON).
                contentType(ContentType.JSON).
                body(map).
                when().
                post(endPoint);

        //response.prettyPrint();
        JsonPath token = response.jsonPath();

        return token.getString("id_token");

    }
    public static String generateTokenCk() {
        String username = "Team83Admin";
        String password = "Batch44+";

        Map <String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("password",password);
        map.put("rememberme","true");

        String endPoint = "https://www.medunna.com/api/authenticate";

        Response response1 = given().contentType(ContentType.JSON).body(map).when().post(endPoint);

        JsonPath token = response1.jsonPath();

        return token.getString("id_token");
    }
}
