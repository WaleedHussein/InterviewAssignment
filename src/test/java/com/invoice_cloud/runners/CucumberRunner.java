package com.invoice_cloud.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
        },
        features = "src/test/resources/features",
        glue = "com/invoice_cloud/step_definitions",
        dryRun = false,
        tags = "@wip"

)
public class CucumberRunner {
}
