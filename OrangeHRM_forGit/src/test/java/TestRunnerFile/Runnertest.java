package TestRunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\featureFilesOrange"},    //\\login_withExamples.feature
		glue = {"stepDefinitionFiles"}	,
		dryRun=false,
		monochrome=true,
		plugin= {"html:report/htmlreport","json:report/jsonreport.json","junit:report/xmlreport.xml"} 
				)


public class Runnertest {

}
//C:/Users/creat/eclipse-workspace/OrangeHRM 