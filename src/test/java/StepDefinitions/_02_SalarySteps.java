package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _02_SalarySteps {
    DialogContent dialogContent=new DialogContent();
    LeftNav leftNav=new LeftNav();
    @And("^Navigate to Salary page$")
    public void navigateToSalaryPage() {
        leftNav.findElementAndClickFunction("humanResources");
        leftNav.findElementAndClickFunction("humanSetup");
        leftNav.findElementAndClickFunction("positionSalary");
    }

    @When("^Create a Salary$")
    public void createASalary() {
        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("newInput","Herne");
        dialogContent.findElementAndClickFunction("saveBtn");

    }

    @Then("^Success message should be displayed$")
    public void successMessageShouldBeDisplayed() {
        dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
    }

    @When("^Name edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void nameEditTheTo(String salaryName, String newCountryName) {
        dialogContent.editAndDeleteFunction(salaryName,"edit");
        dialogContent.findElementAndSendKeysFunction("newInput",newCountryName);
        dialogContent.findElementAndClickFunction("saveBtn");

    }

    @When("^Name delete The \"([^\"]*)\"$")
    public void nameDeleteThe(String nameOfsalaryToDelete)  {
        dialogContent.editAndDeleteFunction(nameOfsalaryToDelete,"delete");
        dialogContent.findElementAndClickFunction("yesBtn");
    }
}
