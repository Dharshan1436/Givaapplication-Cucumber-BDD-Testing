package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ExtentReportManager;
import utils.configReader;

public class Hooks {

    @Before
    public void beforeScenario(Scenario scenario) {
        configReader.loadProperties();
        ExtentReportManager.initReport();
        ExtentReportManager.startTest(scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            ExtentReportManager.logFail("Scenario failed");
        } else {
            ExtentReportManager.logPass("Scenario passed");
        }
        ExtentReportManager.flushReport();
    }
}
