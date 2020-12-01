package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _3_7_1_MySubjectCat {

    LeftNav leftNav = new LeftNav();
    DialogContent dialogContent = new DialogContent();
    FormContent formContent = new FormContent();

    @Then("^Navigate to MySubjectCat page$")
    public void navigate_to_MySubjectCat_page(){
        leftNav.findElementAndClickFunction("education");
        leftNav.findElementAndClickFunction("setup");
        leftNav.findElementAndClickFunction("subjectCategories");
    }

    @When("^Create a MySubjectCat on SubjectCategories and Name is \"([^\"]*)\" and Code is \"([^\"]*)\"$")
    public void create_a_MySubjectCat_on_SubjectCategories_and_Name_is_and_Code_is(String name, String code)  {
        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("nameInput", name);
        dialogContent.findElementAndSendKeysFunction("codeInput", code);
        dialogContent.findElementAndClickFunction("saveBtn");
    }

    @When("^Create a new Subject and name is \"([^\"]*)\" and code ise \"([^\"]*)\"$")
    public void create_a_new_Subject_and_name_is_and_code_ise(String name, String code) {
        leftNav.findElementAndClickFunction("subjectCategories");
        leftNav.findElementAndClickFunction("subjects");
        dialogContent.waiting(500);
        dialogContent.findElementAndClickFunction("addButton");
        //formContent.findElementAndClickFunction("addBTN");
        dialogContent.findElementAndSendKeysFunction("subjectName",name);
        dialogContent.findElementAndClickFunction("subCodeClick");
        dialogContent.findElementAndSendKeysFunction("subjectCode",code);
    }

    @Then("^Select a Categories and Select a Style$")
    public void select_a_Categories_and_Select_a_Style() {
        dialogContent.findElementAndClickFunction("subCategoryClick");
        dialogContent.findElementAndClickFunction("subCategory");
        dialogContent.findElementAndClickFunction("styleClick");
        dialogContent.findElementAndClickFunction("styleInputBlue");
        dialogContent.findElementAndClickFunction("saveBtn");
    }

    @When("^User try delete the Category \"([^\"]*)\"$")
    public void user_try_delete_the_Category(String name)  {
        leftNav.findElementAndClickFunction("subjectCategories");
        dialogContent.editAndDeleteFunction(name,"delete");
        dialogContent.findElementAndClickFunction("yesBtn");
        dialogContent.findElementAndVerifyContainsText("msjContainer", "deleted");
    }



}
