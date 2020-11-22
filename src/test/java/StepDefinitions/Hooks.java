package StepDefinitions;

import Utilities.Driver;
import Utilities.ExcelUtility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks {
    @Before// Seneryodan once
    public void before(Scenario scenario){
        System.out.println("Scenario Basladi ");
        System.out.println("Seneryonun Id'si"+scenario.getId());
        System.out.println("Seneryonun Adi: "+scenario.getName());
    }
    @After//Seneryodan sonra
    public void after (Scenario scenario){
        System.out.println("Seneryo bitti");
        System.out.println("Seneryonun sonucu"+scenario.getStatus());
        Date now=new Date();
        SimpleDateFormat DateFormat=new SimpleDateFormat("yyyy-MM-dd HH_mm_ss");
        String strDate=DateFormat.format(now);
        System.out.println(strDate);
        if (scenario.getStatus()=="failed"){
            String scebarioName=scenario.getName();
            TakesScreenshot screenshot=(TakesScreenshot) Driver.getDriver();
            File ekranDosyasi=screenshot.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(ekranDosyasi,new File("target/FailedScreenShots/"+
                        Driver.threadBrowserName.get()+scebarioName+strDate+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            ExcelUtility.exceleYaz(scenario,strDate,Driver.threadBrowserName.get());
        }
        Driver.quitDriver();
    }

}
