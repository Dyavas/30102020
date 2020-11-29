package StepDefinitions;



import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class _3_10_1_SalaryModifiersSteps {
    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent =new DialogContent();
    FormContent formContent=new FormContent();
    //SlaryModifiers Sec
    @And("^Navigate to SalaryModifiers page$")
    public void navigateToSalaryModifiersPage() {
        leftNav.findElementAndClickFunction("humanResources");
        leftNav.findElementAndClickFunction("humanSetup");
        leftNav.findElementAndClickFunction("salaryModifiers");
    }
    //Add buttona tikla
    @And("^Click to addButton$")
    public void clickToAddButton() {
        formContent.findElementAndClickFunction("formAddButton");
        formContent.waiting(1000);
    }

    //Form elemanlarini gir
    @When("^Create a SalaryModifiers name$")
    public void createASalaryModifiersName(DataTable elements) {
        List<List<String>> elementlist=elements.asLists(String.class);
        for (int i = 0; i < elementlist.size() ; i++) {
            formContent.findElementAndSendKeysFunction(elementlist.get(i).get(0),elementlist.get(i).get(1));
        }
        formContent.findElementAndClickFunction("formSaveButton");
    }

    @And("^Click Save Button$")
    public void clickSaveButton() {
        formContent.waiting(500);
        formContent.findElementAndClickFunction("formSaveButton");
    }



    @When("^Name a SalaryModifiers edit the$")
    public void nameASalaryModifiersEditThe(DataTable elements) {

        List<List<String>> elementList=elements.asLists(String.class);
        for (int i = 0; i < elementList.size() ; i++) {
            formContent.findElementAndSendKeysFunction(elementList.get(i).get(0),elementList.get(i).get(1));
            }

    }

    @When("^Name a SalaryModifiers delete$")
    public void nameASalaryModifiersDelete(DataTable elements) {
        dialogContent.waiting(500);
        List<List<String>> elementList=elements.asLists(String.class);
        dialogContent.waiting(1000);
        for (int i = 0; i < elementList.size() ; i++) {
            formContent.findElementAndSendKeysFunction(elementList.get(i).get(0),elementList.get(i).get(1));
        }
    }


    @And("^Name a SalaryModifiers edit the \"([^\"]*)\"$")
    public void nameASalaryModifiersEditThe(String name)  {
        dialogContent.editAndDeleteFunction(name,"edit");
    }

    @And("^Name a SalaryModifiers delete the \"([^\"]*)\"$")
    public void nameASalaryModifiersDeleteThe(String name)  {
        dialogContent.editAndDeleteFunction(name,"delete");
        dialogContent.findElementAndClickFunction("yesBtn");
    }
}
