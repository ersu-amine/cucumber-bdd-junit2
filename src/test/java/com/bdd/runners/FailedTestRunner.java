package com.bdd.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
        "pretty",
        "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "@target/rerun.txt",
        glue = "com/bdd/step_definitions"
)

public class FailedTestRunner {
}
