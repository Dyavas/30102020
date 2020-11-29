package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class _3_1_CountrySteps {
    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();

    @And("^Navigate to country page$")
    public void navigateToCountryPage() {
        leftNav.findElementAndClickFunction("setupOne");
        leftNav.findElementAndClickFunction("parameters");
        leftNav.findElementAndClickFunction("countries");

    }

    @When("^Create a country name as \"([^\"]*)\" and code as \"([^\"]*)\"$")
    public void createACountryNameAsAndCodeAs(String name, String code)  {
        dialogContent.waiting(1000);
        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("nameInput", name);
        dialogContent.findElementAndSendKeysFunction("codeInput", code);
        dialogContent.findElementAndClickFunction("saveBtn");
    }
}
