package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class _3_5_SubjectCategoriesSteps {
    DialogContent dialogContent=new DialogContent();
    LeftNav leftNav=new LeftNav();
    @And("^Navigate to SubjectCategories page$")
    public void navigateToSubjectCategoriesPage() {
        leftNav.findElementAndClickFunction("education");
        leftNav.findElementAndClickFunction("setup");
        leftNav.findElementAndClickFunction("subjectCategories");

    }

    @When("^Create a SubjectCategories name is \"([^\"]*)\" and code is \"([^\"]*)\"$")
    public void createASubjectCategoriesNameIsAndCodeIs(String name, String code) {
        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("nameInput", name);
        dialogContent.findElementAndSendKeysFunction("codeInput", code);
        dialogContent.findElementAndClickFunction("saveBtn");
    }

    @When("^Name is delete the \"([^\"]*)\"$")
    public void nameIsDeleteThe(String name) {
        dialogContent.editAndDeleteFunction(name,"delete");
        dialogContent.findElementAndClickFunction("yesBtn");

    }
}
