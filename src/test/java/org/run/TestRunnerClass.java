package org.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Dell\\eclipse-workspace\\TestCucumber\\src\\test\\resources\\AdactinValidation.feature",
glue="org.run")
public class TestRunnerClass {

}
