package com.bdd.step_definitions;

import com.bdd.utilities.BrowserUtilities;
import com.bdd.utilities.ConfigurationReader;
import com.bdd.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {
    //import the @Before coming from io.cucumber.java
    @Before
    public void setupMethod() {

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @After
    public void teardownMethod(Scenario scenario) throws InterruptedException {

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        BrowserUtilities.sleep(2);
        Driver.closeDriver();
    }
}
