package runner.com;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"/Volumes/Untitled 2/eclipse/BDDPrectice/ExpressLogIn.feature"},


monochrome = true, dryRun= true
 )

public class RunnerClass {
	

}
