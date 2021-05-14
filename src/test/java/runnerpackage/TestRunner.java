package runnerpackage;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/connectresources/81124.feature", "src/main/java/connectresources/78740.feature"},


                               plugin = {"pretty","html:target/cucmber-html-report",
                            		   "json:target/cucucmber.json","junit:target/cucumber.xml"}, glue = {"test"})


public class TestRunner
{

}