package com.runner.RLL_240Testing_FirstCry_FindStores;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resource/com/features/FindStores", 
    glue = "com.runner.RLL_240Testing_FirstCry_FindStores",
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    tags = "@Find_Stores or @Selecting_All",
    monochrome = true
)
public class RunnerTestNg extends AbstractTestNGCucumberTests {
    // No changes needed here
}
