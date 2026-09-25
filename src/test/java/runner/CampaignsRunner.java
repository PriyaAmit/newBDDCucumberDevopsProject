package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\Campaigns.feature"},
		
		glue = {"steps","hooks"},
		
		plugin = {"pretty"},
	//	tags="@sanity"
	//	tags="@sanity or @regression"
		//tags="@sanity and @regression"
	//	tags="not(@sanity or @regression)"
		
		//tags="not(@sanity and @regression)"
		//tags="campaigns"
		tags = "sanity"

	)	

public class CampaignsRunner extends AbstractTestNGCucumberTests{

}
