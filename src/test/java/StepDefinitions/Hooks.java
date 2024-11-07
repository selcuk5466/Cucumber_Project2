package StepDefinitions;

import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {   //Kanca


    // Cucumbera ait her senaryodan sonra çalışan
    // Annotation
    @After
    public void after(Scenario senaryo)
    {
        ExcelUtility.writeToExcel("src/test/java/_0_Source/TestSonuclari.xlsx",
                senaryo.getName(),senaryo.isFailed()? "Fail":"Passed");

        GWD.quitDriver();
    }

}
