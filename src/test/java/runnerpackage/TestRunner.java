package runnerpackage;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/resource/Homepage.feature"},


                               plugin = {"pretty","html:target/cucmber-html-report"}, glue = {"test"})


public class TestRunner
{

}