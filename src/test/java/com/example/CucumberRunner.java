package com.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue = "com.example.stepdefs",
		tags = "not @ignore",
		features = "classpath:features"
)
public class CucumberRunner {}
