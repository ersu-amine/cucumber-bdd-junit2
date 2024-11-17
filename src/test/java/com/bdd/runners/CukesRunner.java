package com.bdd.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "pretty",
        },
        publish = true,
        dryRun = true,
        tags = "@wip",
        glue = "com/bdd/step_definitions",
        features = "src/test/resources/features"

)

public class CukesRunner {}
