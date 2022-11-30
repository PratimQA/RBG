package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"src/test/resources/parallel"},
		glue = {"parallel"},
		plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/" 
                
        }
        //publish =true
        
		)


public class ParallelRun extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider
	public Object[][] scenarios(){
		return super.scenarios();
	
	
	}
	
}
