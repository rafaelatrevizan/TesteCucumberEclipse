package br.com.RafaelaTrevinza.runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.BeforeClass;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/Features",
		glue = "br.com.RafaelaTrevizan.steps",
		plugin = {"pretty", "html:target/report-html", "json:target/report-json"},
		monochrome = false,		
		dryRun = false,
		strict = false,
		snippets = SnippetType.CAMELCASE,
		tags = {"@conta"}
		)
public class RunnerTest {
//	@BeforeClass
//	public static void reset() {
//		
//	}
}
