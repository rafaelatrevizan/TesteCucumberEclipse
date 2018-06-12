package br.com.Rafaela_Trevizan.TesteCucumber;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/java"},
		plugin = "pretty",
		monochrome = true,		
		dryRun = false,
		strict = false,
		snippets = SnippetType.CAMELCASE
		)
public class Runner {}
