package com.testexamples.cucumber;


import com.testexamples.BrowserStackSerenityTest;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/googleTest.feature")
public class GoogleTest extends BrowserStackSerenityTest { }
