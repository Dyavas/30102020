package StepDefinitions;

import Pages.DialogContent;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;

public class _3_2_CountryDeleteSteps {
    DialogContent dialogContent=new DialogContent();
    @When("^User delete the \"([^\"]*)\"$")
    public void userDeleteThe(String nameOfCountryToDelete)  {

        dialogContent.editAndDeleteFunction(nameOfCountryToDelete, "delete");
        dialogContent.findElementAndClickFunction("yesBtn");

    }
}
