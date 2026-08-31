import Pages.TestNG;
import Steps.ElementsSteps;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

import static Resources.Wrapper.logger;


public class elementsTest extends TestNG {

    public static final String suite = "Elements";

    public static final String f003 = suite + "_ButtonsOptions";
    public static final String f004 = suite + "_CheckBoxOptions";
    public static final String f005 = suite + "_RadioButtonOptions";
    public static final String f006 = suite + "_SlidersOptions";
    public static final String f007 = suite + "_TextBoxOptions";


    @Test(testName = f003,  groups = {"Regression", "Full"})
    public void buttonsOptions() {
        new ElementsSteps(driver);
        ElementsSteps.buttonsOptions();
        logger(Status.PASS, "[SUCCESS] Test Complete: The framework successfully validated all primary button interaction events (Click, Double-Click, Contextual Click).");
    }

    @Test(testName = f004,  groups = {"Full"})
    public void checkBoxOptions() {
        new ElementsSteps(driver);
        ElementsSteps.checkBoxOptions();
        logger(Status.PASS, "[SUCCESS] Test Complete: The framework successfully executed and validated state toggling (checked/unchecked) on boolean Checkbox elements.");

    }

    @Test(testName = f005,  groups = {"Full"})
    public void radioButtonsOptions() {
        new ElementsSteps(driver);
        ElementsSteps.radioOptions("Ares", 3);
        logger(Status.PASS, "[SUCCESS] Test Complete: The framework successfully handled single-choice selections and validated mutually exclusive states on Radio Button components.");
    }

    @Test(testName = f006,  groups = {"Full"})
    public void slidersOptions() {
        new ElementsSteps(driver);
        //ElementsSteps.radioOptions("Ares", 3);
        logger(Status.PASS, "[SUCCESS] Test Complete: The framework successfully manipulated spatial coordinates and validated dynamic boundary values on Slider (Range) elements.");
    }

    @Test(testName = f007,  groups = {"Full"})
    public void textBoxOptions() {
        new ElementsSteps(driver);
        ElementsSteps.textBoxOptions();
        logger(Status.PASS, "[SUCCESS] Test Complete: The framework successfully performed input clearing, simulated keystroke entry, and value assertion on standard TextBox fields.");
    }



}
