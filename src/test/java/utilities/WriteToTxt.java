package utilities;

import pojos.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToTxt {

    public static void saveTestItemData(TestItem testItem) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("testItemData_Path"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(testItem + "\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveDBTestData(String fileName, List<Object> id){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));

            for (int i=0; i< id.size(); i++)
                writer.append(id.get(i).toString()+",\n");

            writer.close();
        } catch (IOException e){
        }
    }


    //================Cck=====================
    public static void saveEmailData(String fileName, Registrant [] registrants) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i = 0; i < registrants.length; i++) {
                writer.append(registrants[i].getEmail() + ",\n");
            }
            writer.close();
        } catch (Exception e) {
        }
    }


    public static void savePatientdata(Patients_US015 patients_us015) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("PatientData_Path"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(patients_us015 + "\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveRoomData(String roomNumber, int price, String createdDate){
        try{

            FileWriter fileWriter = new FileWriter("./src/test/resources/testdata/RoomData.txt", false);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            writer.append("Room "+roomNumber+"\n");

            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }


    }


}

