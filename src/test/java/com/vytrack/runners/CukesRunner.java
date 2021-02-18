package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                  "html:target/default-html-reports",
                  "rerun:target/rerun.txt"
                 },
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,   // we use dryRun only to get right away the undefined step definition, when it's TRUE.
                        // When it's FALSE, the code inside every defined steps will be executed until cucumber reaches
                        // the undefined steps.
        tags = "@smoke" // will execute specific test('s)

        // change the browser in terminal:
        // mvn verify -Dbrowser=firefox

        // change the tag from terminal:
        // mvn verify -Dcucumber.option="--tags @smoke"

        // change at same time:
        // mvn verify -Dcucumber.option="--tags @smoke" -Dbrowser=firefox

)
public class CukesRunner {
}
