package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(With(Cucumber.class)
@CucumberOptions( features="C://Users//User//IdeaProjects//SeleniumCucumberProject//Features//OrangeHRM.feature",
                  glue = "stepDefinitions")
public class TestRunner {

}
