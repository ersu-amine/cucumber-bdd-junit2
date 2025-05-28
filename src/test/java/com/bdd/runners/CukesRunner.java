package com.bdd.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={
                "rerun:target/rerun.txt",
                "pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        publish = true,
        dryRun = false,
        tags = "",
        glue = "com/bdd/step_definitions",
        features = "src/test/resources/features"
)

public class CukesRunner {}
