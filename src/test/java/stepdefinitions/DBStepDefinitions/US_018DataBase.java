package stepdefinitions.DBStepDefinitions;

import org.junit.Assert;
import org.junit.Test;
import utilities.DatabaseUtility;

import java.util.Collections;
import java.util.List;

public class US_018DataBase {


    @Test
    public void DBTest(){


        String url = "jdbc:postgresql://medunna.com:5432/medunna_db";
        String username="medunnadb_user";
        String password="Medunnadb_@129";


        DatabaseUtility.createConnection(url,username,password);

        String query="select * from physician";
        System.out.println(DatabaseUtility.getColumnNames(query));



        List<Object> nameList=DatabaseUtility.getColumnData(query,"first_name");

        Assert.assertTrue(nameList.containsAll(Collections.singleton("ozgur")));


    }

}
