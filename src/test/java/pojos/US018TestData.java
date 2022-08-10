package pojos;

import java.util.HashMap;

public class US018TestData {

    public HashMap<String,Object> setupData(){

        HashMap<String,Object> user=new HashMap<>();
        user.put("firstName","Tara");
        user.put("lastName","Kis");
        user.put("activated",true);

        HashMap<String,Object> expectedData=new HashMap<>();
        expectedData.put("firstName","ozgur");
        expectedData.put("lastName","bt");
        expectedData.put("phone","5896589863");
        expectedData.put("user",user);


        return expectedData;
    }

}
