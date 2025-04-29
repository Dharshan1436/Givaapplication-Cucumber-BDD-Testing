package hooks;

import org.testng.annotations.AfterSuite;
import utils.ExtentReportManager;

public class TestCleanup {
    @AfterSuite
    public void tearDownReport() {
        ExtentReportManager.flushReport();
    }
}
