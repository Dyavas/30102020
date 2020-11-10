package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class _03PositionsSteps {
    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();

    FormContent formContent=new FormContent();

    @And("^Navigate to Positions page$")
    public void navigateToPositionsPage() {
        leftNav.findElementAndClickFunction("humanResources");
        leftNav.findElementAndClickFunction("humanSetup");
        leftNav.findElementAndClickFunction("positions");

    }

    @When("^Create a Positions name as \"([^\"]*)\" shortName as\"([^\"]*)\"$")
    public void createAPositionsNameAsShortNameAs(String name, String shortName) {

        dialogContent.findElementAndClickFunction("addButton");
        formContent.findElementAndSendKeysFunction("nameInput", name);
        formContent.findElementAndSendKeysFunction("shortnameInput", shortName);
        formContent.findElementAndClickFunction("saveButton");
    }
}
