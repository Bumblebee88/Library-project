package com.Library.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\features",
        glue = "com\\Library\\Step_Definitions",
        tags = "@opera",
        dryRun = false

)
public class CucumberRunner {

}
