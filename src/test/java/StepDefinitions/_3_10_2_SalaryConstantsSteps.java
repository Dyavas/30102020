package StepDefinitions;



import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.awt.*;
import java.util.List;

public class _3_10_2_SalaryConstantsSteps {
    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();
    FormContent formContent=new FormContent();
            //todo Sayfaya git
    @And("^Navigate to SalaryConstants page$")
    public void navigateToSalaryConstantsPage() {
        leftNav.findElementAndClickFunction("humanResources");
        leftNav.findElementAndClickFunction("humanSetup");
        leftNav.findElementAndClickFunction("salaryConstants");

    }

            //Todo Yeni Kayit Olsuturma Bolumu
    @When("^Create a SalaryConstants name$")
    public void createASalaryConstantsName(DataTable elements) throws AWTException {

        List<List<String>> elementList = elements.asLists(String.class);

        for (int i = 0; i < elementList.size(); i++)
        {
            if (i!=1) {
            formContent.findElementAndSendKeysFunction(elementList.get(i).get(0), elementList.get(i).get(1));
                formContent.waiting(200);
                }
            formContent.findElementAndClickFunction(elementList.get(i).get(0));
            formContent.findElementAndSendKeysFunction(elementList.get(i).get(0), elementList.get(i).get(1));
            formContent.waiting(200);
            formContent.findElementAndClickFunction("formDiv");
        }

    }

        //TODO Duzenleme Bolumu
        @And("^Name a SalaryConstants edit the \"([^\"]*)\"$")
        public void nameASalaryConstantsEditThe (String name){
            dialogContent.editAndDeleteFunction(name, "edit");

        }

        @When("^Name a SalaryConstants edit the$")
        public void nameASalaryConstantsEditThe (DataTable elements){
            List<List<String>> elementList = elements.asLists(String.class);

            for (int i = 0; i < elementList.size(); i++)
            {
                if (i!=1) {
                    formContent.findElementAndSendKeysFunction(elementList.get(i).get(0), elementList.get(i).get(1));
                    formContent.waiting(200);
                }
                formContent.findElementAndClickFunction(elementList.get(i).get(0));
                formContent.findElementAndSendKeysFunction(elementList.get(i).get(0), elementList.get(i).get(1));
                formContent.waiting(200);
                formContent.findElementAndClickFunction("formDiv");
            }
        }

        //TODO SILME  Bolumu
        @And("^Name a SalaryConstants delete the \"([^\"]*)\"$")
        public void nameASalaryConstantsDeleteThe (String name){
            dialogContent.editAndDeleteFunction(name, "delete");
            dialogContent.findElementAndClickFunction("yesBtn");
        }



}
