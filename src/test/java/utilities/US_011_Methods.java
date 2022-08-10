package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class US_011_Methods {

    public void getTableTitle(int sayi){

        String dinamikXpath ="//table//th["+sayi+"]";
        List<WebElement> expected= Driver.getDriver().findElements(By.xpath(dinamikXpath));
        for (WebElement each:expected) {
            System.err.println("=====  "+each.getText()+"  =====");
        }
    }
    public void getTableBody(int sayi){
        String dinamikXpath ="//tbody//tr//td["+sayi+"]";
        List<WebElement> expected=Driver.getDriver().findElements(By.xpath(dinamikXpath));
        int count=0;
        String listeId="";
        for (WebElement each:expected) {
            listeId=each.getText();
            System.out.println(++count+". "+listeId);
        }
    }

    public WebElement editButonuSec(int no){
        String xpath="(//span[text()='Edit'])["+no+"]";
        WebElement expected=Driver.getDriver().findElement(By.xpath(xpath));

        return expected;
    }
    public String getScreenshot(String name,WebElement istenilenAlaninGoruntusu) {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = istenilenAlaninGoruntusu.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return target;
    }

    public WebElement deleteButonuSec(int no){
        String xpath="(//span[text()='Delete'])["+no+"]";
        WebElement expected=Driver.getDriver().findElement(By.xpath(xpath));

        return expected;
    }
}
