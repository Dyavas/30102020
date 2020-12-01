package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.io.DataInput;
import java.util.List;

public class _3_12_BudgetSteps {
    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();
    FormContent formContent=new FormContent();
    @And("^Navigate to Budget page$")
    public void navigateToBudgetPage() {
        leftNav.findElementAndClickFunction("budget");
        leftNav.findElementAndClickFunction("budgetSetup");
        leftNav.findElementAndClickFunction("costCenter");
    }

    @And("^Create a Budget$")
    public void createABudget() {

        dialogContent.waiting(500);
        dialogContent.findElementAndClickFunction("addButton");
    }

    @When("^Create a Budget name$")
    public void createABudgetName(DataTable elements) {
        List<List<String>> elementList = elements.asLists(String.class);

        for (int i = 0; i < elementList.size(); i++) {

            formContent.findElementAndSendKeysFunction(elementList.get(i).get(0), elementList.get(i).get(1));

        }

    }

    @And("^Click in the Type new Type form$")
    public void clickInTheTypeNewTypeForm() {
        formContent.findElementAndClickFunction("typeSelect");

    }

    @And("^Create a Select name as \"([^\"]*)\" and value as \"([^\"]*)\"$")
    public void createASelectNameAsAndValueAs(String name, String value) {
        dialogContent.findElementAndSelectOption(name,value);
    }

    @And("^Click expenseSelect Button$")
    public void clickExpenseSelectButton() {
        formContent.findElementAndClickFunction("salaryUserType");
    }

    @And("^Create a codeInput name as \"([^\"]*)\" and value as \"([^\"]*)\"$")
    public void createACodeInputNameAsAndValueAs(String name, String value) {
        formContent.findElementAndSendKeysFunction(name, value);
    }

    @And("^Name a Budget edit the \"([^\"]*)\"$")
    public void nameABudgetEditThe(String value)  {

        formContent.findElementAndClickFunction("firstValue");
    }

    @When("^Name is delete$")
    public void nameIsDelete() {
        formContent.findElementAndClickFunction("secondValue");
        dialogContent.findElementAndClickFunction("yesBtn");
    }
}
