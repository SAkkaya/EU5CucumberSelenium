package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // JUnit class to run login.feature

@CucumberOptions(  //to tell Intellij where is my feature file you have to run
        /*
        - CukesRunner does not know where is my feature file and step-definitions
        - if I do not put the features keyword CukesRunner looks for feture file under the runners package
         */
        //json=> store the information in key and value structure(API related)
        plugin = {"json:target/cucumber.json",  // gives json report under target folder called cucumber.json
                "html:target/default-html-reports", // gives html report under target folder called default-html-reports
                "rerun:target/rerun.txt" }, //tells me which feature file and line of the failed scenario

        features = "src/test/resources/features",            // "features" keyword create connection with features
            glue = "com/vytrack/step_definitions",           // where is exactly step definitions are, "glue" keyword create connection with features  => java nin altinda oldugu icin direk com dan itibaren path i aldi
            dryRun = false,                                  // dryRun =true --> to get only the undefined definition in steps definition
            tags = "@smoke"

//        tags = "not @calc"  cal haric hepsini calistiriyor

)


public class CukesRunner {

}
