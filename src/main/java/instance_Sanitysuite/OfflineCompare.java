package instance_Sanitysuite;

import io.testproject.java.annotations.v2.Test;
import io.testproject.java.enums.TakeScreenshotConditionType;
import io.testproject.java.sdk.v2.drivers.WebDriver;
import io.testproject.java.sdk.v2.enums.ExecutionResult;
import io.testproject.java.sdk.v2.exceptions.FailureException;
import io.testproject.java.sdk.v2.reporters.TestReporter;
import io.testproject.java.sdk.v2.tests.WebTest;
import io.testproject.java.sdk.v2.tests.helpers.WebTestHelper;
import io.testproject.proxy.addon.ElementExtensions;
import io.testproject.proxy.addon.io.testproject.addons.element.web.DoubleClickNoJs;
import org.openqa.selenium.By;

/**
 * This class was automatically generated by TestProject
 * Project: Nutshell automation
 * Test: Mob App 07 (offline compare)
 * Generated by: Saranya Shanmugam (Saranya.Shanmugam@nutshellapps.co.uk)
 * Generated on Sun Nov 01 02:30:54 GMT 2020.
 */
@Test(
    name = "Mob App 07 (offline compare)",
    description = "This test was auto generated from steps of the 'Instance - Sanity tests' test",
    version = "1.0"
)
public class OfflineCompare implements WebTest {
  public ExecutionResult execute(WebTestHelper helper) throws FailureException {
    WebDriver driver = helper.getDriver();
    // set timeout for driver actions (similar to step timeout)
    driver.setTimeout(30000);
    TestReporter report = helper.getReporter();
    By by;
    boolean booleanResult;
    ExecutionResult executionresult;
    DoubleClickNoJs doubleClickNoJs;

    // 1. Double Click 'App07'
    doubleClickNoJs = ElementExtensions.getDoubleClickNoJs();
    by = By.id("microapp_2687");
    executionresult = helper.executeProxy(doubleClickNoJs, by);
    report.step("Double Click 'App07'", executionresult == ExecutionResult.PASSED, TakeScreenshotConditionType.Failure);

    // 2. Click 'Publish'
    by = By.cssSelector("#workflow_publish");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Publish'", booleanResult, TakeScreenshotConditionType.Failure);

    // 3. Click 'rest_data_format1'
    by = By.xpath("//div[4]/div/div/div/div[2]/div[2]/input");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'rest_data_format1'", booleanResult, TakeScreenshotConditionType.Failure);

    // 4. Click 'CONTINUE'
    by = By.cssSelector("#yes");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'CONTINUE'", booleanResult, TakeScreenshotConditionType.Failure);

    // 5. Click 'CONTINUE'
    by = By.cssSelector("#yes");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'CONTINUE'", booleanResult, TakeScreenshotConditionType.Failure);

    // 6. Click 'CONTINUE'
    by = By.cssSelector("#yes");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'CONTINUE'", booleanResult, TakeScreenshotConditionType.Failure);
    
  // 7. 'DIV10' contains text 'Successfully published to the Test community'?
    driver.setTimeout(30000);
    by = By.xpath("//body/div[4]/div/div");
    booleanResult = driver.testproject().containsText(by,"Successfully published");
    report.step("'DIV10' contains text 'Successfully published'?", booleanResult, TakeScreenshotConditionType.Failure);


    // 8. Click 'DIV6'
    by = By.cssSelector("#workflow-back");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'DIV6'", booleanResult, TakeScreenshotConditionType.Failure);

    // 9. Click 'workflow-back2'
    by = By.cssSelector("#workflow-back");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'workflow-back2'", booleanResult, TakeScreenshotConditionType.Failure);

    // 10. Click 'workflow_back_confirm1'
    by = By.cssSelector("#workflow_back_confirm");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'workflow_back_confirm1'", booleanResult, TakeScreenshotConditionType.Failure);

    return ExecutionResult.PASSED;
  }
}
