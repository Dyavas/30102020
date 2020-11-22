package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.apache.poi.ss.formula.functions.Now;
import org.apache.poi.ss.usermodel.DataFormat;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;

public class _3_10_2_SalaryConstantsSteps {
    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();
    FormContent formContent=new FormContent();
    @And("^Navigate to SalaryConstants page$")
    public void navigateToSalaryConstantsPage() {
        leftNav.findElementAndClickFunction("humanResources");
        leftNav.findElementAndClickFunction("humanSetup");
        leftNav.findElementAndClickFunction("salaryConstants");

    }

    //Yeni Kayit Olsuturma Bolumu
    @When("^Create a SalaryConstants name$")
    public void createASalaryConstantsName(DataTable elements)  {
        List<List<String>> elementList=elements.asLists(String.class);
        for (int i = 0; i < elementList.size() ; i++) {
            formContent.findElementAndSendKeysFunction(elementList.get(i).get(0),elementList.get(i).get(1));
          }
    }


        //Duzenleme Bolumu
    @And("^Name a SalaryConstants edit the \"([^\"]*)\"$")
    public void nameASalaryConstantsEditThe(String name) {
        dialogContent.editAndDeleteFunction(name,"edit");

    }

    @When("^Name a SalaryConstants edit the$")
    public void nameASalaryConstantsEditThe(DataTable elements) {
        List<List<String>> elementList=elements.asLists(String.class);
        for (int i = 0; i < elementList.size() ; i++) {
            formContent.findElementAndSendKeysFunction(elementList.get(i).get(0),elementList.get(i).get(1));
        }
    }

        //Tarih  ekleme Bolumu
    @And("^Click Date Button$")
    public void clickDateButton() throws AWTException {
        //robot clas ilede eklenebiliyor.
//        Robot robot=new Robot();
        formContent.findElementAndClickFunction("formDateInput");
        formContent.findElementAndClickFunction("formDateInput2");

//       // formContent.findElementAndClickFunction("formDateInput");
//        robot.keyPress(KeyEvent.VK_ENTER);
//        formContent.waiting(500);
//        robot.keyPress(KeyEvent.VK_ENTER);
    }

    @And("^Name a SalaryConstants delete the \"([^\"]*)\"$")
    public void nameASalaryConstantsDeleteThe(String name)  {
        dialogContent.editAndDeleteFunction(name,"delete");
        dialogContent.findElementAndClickFunction("yesBtn");
    }
}
