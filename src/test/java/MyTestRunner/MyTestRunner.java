package MyTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = {"src/test/resources/AppFeatures"},
		features = {"src/test/resources/parallel/contactspage.feature"},
		glue = {"stepdefinitions", "parallel"},
		plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/"
                
              
        }
		//monochrome = true
        //publish =true
        
		
		
		
		)

public class MyTestRunner {

	
	
}
