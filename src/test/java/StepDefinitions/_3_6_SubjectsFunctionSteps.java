package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _3_6_SubjectsFunctionSteps {
    DialogContent dialogContent=new DialogContent();
    LeftNav leftNav=new LeftNav();
    FormContent formContent=new FormContent();
    @And("^Navigate to Subjects page$")
    public void navigateToSubjectsPage() {
        leftNav.findElementAndClickFunction("education");
        leftNav.findElementAndClickFunction("setup");
        leftNav.findElementAndClickFunction("subjects");
    }

    @When("^Create a Subjects name is \"([^\"]*)\" and code is \"([^\"]*)\"$")
    public void createASubjectsNameIsAndCodeIs(String name, String code)  {
        formContent.findElementAndClickFunction("addBTN");
        dialogContent.findElementAndSendKeysFunction("subjectName",name);
        dialogContent.findElementAndClickFunction("subCodeClick");
        dialogContent.findElementAndSendKeysFunction("subjectCode",code);
    }

    @And("^Create a new Category name is \"([^\"]*)\" and code is \"([^\"]*)\"$")
    public void createANewCategoryNameIsAndCodeIs(String name, String code) {
        dialogContent.findElementAndClickFunction("smallAddBtn");
        dialogContent.findElementAndSendKeysFunction("newNameInput",name);
        dialogContent.findElementAndClickFunction("newCodeClick");
        dialogContent.findElementAndSendKeysFunction("newCodeInput",code);
        dialogContent.findElementAndClickFunction("smallsaveBtn");
    }

    @Then("^Select a Category and Select a Style$")
    public void selectACategoryAndSelectAStyle() {
        dialogContent.findElementAndClickFunction("subCategoryClick");
        dialogContent.findElementAndClickFunction("subCategory");
        dialogContent.findElementAndClickFunction("styleClick");
        dialogContent.findElementAndClickFunction("styleInputBlue");
        dialogContent.findElementAndClickFunction("saveBtn");

    }

    @When("^Name is \"([^\"]*)\"$")
    public void nameIs(String name)  {
        dialogContent.editAndDeleteFunction(name,"delete");
        dialogContent.findElementAndClickFunction("yesBtn");
    }
}
