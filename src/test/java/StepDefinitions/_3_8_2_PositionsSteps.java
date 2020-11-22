package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class _3_8_2_PositionsSteps {
    LeftNav leftNav = new LeftNav();
    DialogContent dialogContent = new DialogContent();
    FormContent formContent=new FormContent();



    @And("^Navigate to Positions page$")
    public void navigateToPositionsPage()  {
        leftNav.findElementAndClickFunction("humanResources");
        leftNav.findElementAndClickFunction("humanSetup");
        leftNav.findElementAndClickFunction("positions");

    }


    @When("^Create a Positions name as \"([^\"]*)\" and shortName as \"([^\"]*)\"$")
    public void createAPositionsNameAsAndShortNameAs(String name, String shortName)  {

        dialogContent.findElementAndClickFunction("addButton");
        formContent.findElementAndSendKeysFunction("nameInput", name);
        dialogContent.findElementAndSendKeysFunction("shortnameInput", shortName);
        dialogContent.findElementAndClickFunction("saveBtn");
    }

    @When("^Name a Positions edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void nameAPositionsEditTheTo(String positionsName, String newName) {
        dialogContent.editAndDeleteFunction(positionsName, "edit");
        dialogContent.findElementAndSendKeysFunction("nameInput", newName);
        dialogContent.findElementAndClickFunction("saveBtn");
    }

    @When("^Name a Positions delete The \"([^\"]*)\"$")
    public void nameAPositionsDeleteThe(String nameOfsalaryToDelete)  {
        dialogContent.editAndDeleteFunction(nameOfsalaryToDelete,"delete");
        dialogContent.findElementAndClickFunction("yesBtn");
    }
}
