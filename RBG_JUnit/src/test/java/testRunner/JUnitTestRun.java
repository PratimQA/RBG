package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
               (
               features=".//Features",
               glue={"stepDefinitions"},
               //dryRun=true,
               //monochrome=true,
               plugin= {"pretty",
            		   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
            	       "timeline:test-output-thread/"	   
               },
               publish =true
               )


public class JUnitTestRun {

}
