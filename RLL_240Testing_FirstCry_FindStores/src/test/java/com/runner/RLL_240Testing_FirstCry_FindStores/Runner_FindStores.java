package com.runner.RLL_240Testing_FirstCry_FindStores;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resource/com/features/FindStores", // Corrected the path
    glue = "com.stepdefinition.RLL_240Testing_FirstCry_FindStores", // Adjust to your package
    plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class Runner_FindStores extends AbstractTestNGCucumberTests {
    // No changes needed here
}
