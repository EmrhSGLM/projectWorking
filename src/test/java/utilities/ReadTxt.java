package utilities;

import pojos.Appointments;
import pojos.Jhi_user;
import pojos.Registrant;
import pojos.TestItem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTxt {


    public static List<Object> returnUser(String filePath){
        List<Object>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Jhi_user user = new Jhi_user();
                user.setLogin(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();

//                System.out.println(i++);

                all.add(user.getLogin());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }




    public static List<Object> returnTestItemNamesList(String filePath){
        List<Object>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();

            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                TestItem testItem = new TestItem();
                testItem.setName(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();

//                System.out.println(i++);

                all.add(testItem.getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }

    public static List<Object> returnAppointmentsIDsList(String filePath){
        List<Object>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Appointments dbTest = new Appointments();
                dbTest.setId(Integer.parseInt(line.split(",")[0]));
                sb.append(System.lineSeparator());
                line = br.readLine();

//                System.out.println(i++);

                all.add(dbTest.getId());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }

}