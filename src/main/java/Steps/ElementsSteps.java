package Steps;

import Flows.ElementsFlows;
import Flows.MainPageFlows;
import Resources.Wrapper;
import org.openqa.selenium.WebDriver;

public class ElementsSteps extends Wrapper {

    public ElementsSteps(WebDriver driver) {
        super(driver);
    }

    public static void buttonsOptions(){
        MainPageFlows.selectOption("Elements","Buttons");
        ElementsFlows.selectButtons();
        ElementsFlows.validateButtonsActions();
        ElementsFlows.clearActions();
    }

    public static void checkBoxOptions(){
        MainPageFlows.selectOption("Elements","CheckBox");
        ElementsFlows.updateCheckBoxOptions();
        ElementsFlows.validateOptionAttributes();
    }

    public static void radioOptions(String name, int option){
        MainPageFlows.selectOption("Elements","RadioButton");
        ElementsFlows.validateRadioOptions(option);
        ElementsFlows.validateMessages(name, option);
    }

    public static void textBoxOptions() {

        MainPageFlows.selectOption("Elements","TextBox");
        ElementsFlows.validateErrors();
        ElementsFlows.EnterDataNValidate("Ares", "cesar@mail.com" , "This is for testing");
    }


}

