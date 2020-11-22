package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class _3_9_1_ReportExcelTemplateSteps {
    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();
    @And("^Navigate to ReportExcelTemplate page$")
    public void navigateToReportExcelTemplatePage() {
        leftNav.findElementAndClickFunction("reports");
        leftNav.findElementAndClickFunction("reportSetup");
        leftNav.findElementAndClickFunction("excelTemplate");


    }

    @When("^Create a ReportExcelTemplate name as \"([^\"]*)\"$")
    public void createAReportExcelTemplateNameAs(String name) {
        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("nameInput",name);
        dialogContent.findElementAndClickFunction("saveBtn");
        dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
    }

    @When("^Name a ReportExcelTemplate edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void nameAReportExcelTemplateEditTheTo(String altName, String newName)  {
        dialogContent.editAndDeleteFunction(altName,"edit");
        dialogContent.findElementAndSendKeysFunction("nameInput",newName);
        dialogContent.findElementAndClickFunction("saveBtn");
        dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
    }

    @When("^Name a ReportExcelTemplate delete The \"([^\"]*)\"$")
    public void nameAReportExcelTemplateDeleteThe(String name)  {
        dialogContent.editAndDeleteFunction(name,"delete");
        dialogContent.findElementAndClickFunction("yesBtn");
        dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
    }
}
