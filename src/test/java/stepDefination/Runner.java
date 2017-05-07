 package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "./src/test/resources/features"
		,glue={"stepDefination"}
	    ,monochrome = true
	    ,plugin = {"pretty", "html:target/cucumber-html-report"}

		)

public class Runner {

}
