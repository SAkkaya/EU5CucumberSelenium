package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // JUnit class to run login.feature

@CucumberOptions(
        /*
        - CukesRunner does not know where is my feature file and step-definitions
        - if I do not put the features keyword CukesRunner looks for feture file under the runners package
         */
        plugin = {"json:target/cucumber.json"},              //json=> store the information in key and value structure(API related)
        features = "src/test/resources/features",            // "features" keyword create connection with features
            glue = "com/vytrack/step_definitions",           // "glue" keyword create connection with features  => java nin altinda oldugu icin direk com dan itibaren path i aldi
            dryRun = false,                                  // dryRun =true --> to get only the undefined definition in steps definition
            tags = "@wip"

)


public class CukesRunner {
}
