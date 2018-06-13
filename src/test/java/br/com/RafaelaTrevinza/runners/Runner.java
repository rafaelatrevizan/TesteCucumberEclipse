package br.com.RafaelaTrevinza.runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/Features",
		glue = "br.com.RafaelaTrevizan.steps",
		plugin = "pretty",
		monochrome = true,		
		dryRun = false,
		strict = false,
		snippets = SnippetType.CAMELCASE,
		tags = {"@primeiro"}
		)
public class Runner {}
