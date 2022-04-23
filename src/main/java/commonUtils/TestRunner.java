package commonUtils;


import org.testng.annotations.AfterSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
        features = "src/test/resource/Features",
        glue = {"com.qureai.stepDefinitions"},dryRun = false,
        tags = {"@All"},plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"})


public class TestRunner extends AbstractTestNGCucumberTests  {


    @AfterSuite
    public static void setup()
    {
    	
    }
    
}