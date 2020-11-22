package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class _3_9_2_SalaryTypesSteps {
    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();
    FormContent formContent=new FormContent();

    @And("^Navigate to SalaryTypes page$")
    public void navigateToSalaryTypesPage() {
        leftNav.findElementAndClickFunction("humanResources");
        leftNav.findElementAndClickFunction("humanSetup");
        leftNav.findElementAndClickFunction("salaryTypes");
        dialogContent.waiting(1000);

    }

    //todo ----------------------------------------------Create

    @And("^Click in the ReportExcelTemplate form$")
    public void clickInTheReportExcelTemplateForm() {

    }
//ekle Butonuna tiklanir
    @And("^Click on the element in the dialogContent class$")
    public void clickOnTheElementInTheDialogContentClass() {
        dialogContent.findElementAndClickFunction("addButton");
    }
//isim eklenir
    @When("^Create a SalaryTypes name as \"([^\"]*)\"$")
    public void createASalaryTypesNameAs(String name)  {
        dialogContent.findElementAndSendKeysFunction("nameInput",name);
    }
//dropdown ve save button
    @And("^Click in the SalaryTypes new SalaryTypes form$")
    public void clickInTheSalaryTypesNewSalaryTypesForm(DataTable elements) throws InterruptedException {

        List<String> elementsToClick=elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size() ; i++) {
            System.out.println("elementsToClick = " + elementsToClick.get(i));
            Thread.sleep(2000);
            formContent.findElementAndClickFunction(elementsToClick.get(i));

        }
    }
    //Save buttton
    @And("^Click  Click on the element in the dialogContent class$")
    public void clickClickOnTheElementInTheDialogContentClass() {
        dialogContent.findElementAndClickFunction("saveBtn");
    }

    //todo -------------------------------------------------edit

    @When("^Name a SalaryTypes edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void nameASalaryTypesEditTheTo(String altName, String newName) throws Throwable {
        dialogContent.editAndDeleteFunction(altName,"edit");
        dialogContent.findElementAndSendKeysFunction("nameInput",altName);
        dialogContent.findElementAndSendKeysFunction("nameInput",newName);
        dialogContent.findElementAndClickFunction("saveBtn");
    }

    @When("^Name a SalaryTypes delete The \"([^\"]*)\"$")
    public void nameASalaryTypesDeleteThe(String name)  {
        dialogContent.editAndDeleteFunction(name,"delete");
        dialogContent.findElementAndClickFunction("yesBtn");
    }

    @When("^Create a ReportExcelTemplate name as \"([^\"]*)\" and shortName as \"([^\"]*)\"$")
    public void createAReportExcelTemplateNameAsAndShortNameAs(String element, String name)  {
        dialogContent.findElementAndSendKeysFunction(element,name);
    }




}
