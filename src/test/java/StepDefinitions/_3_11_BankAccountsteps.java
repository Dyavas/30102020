package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _3_11_BankAccountsteps {
    DialogContent dialogContent=new DialogContent();
    LeftNav leftNav=new LeftNav();
    FormContent formContent=new FormContent();
    @And("^Navigate to BankAccounts page$")
    public void navigateToBankAccountsPage() {
        leftNav.findElementAndClickFunction("setupOne");
        leftNav.findElementAndClickFunction("parameters");
        leftNav.findElementAndClickFunction("bankaccount");

    }

    @And("^Create a BankAccounts$")
    public void createABankAccounts() {
        formContent.findElementAndClickFunction("addBTN");
    }

    @When("^Create a BankAccounts name is \"([^\"]*)\" and Iban is \"([^\"]*)\"$")
    public void createABankAccountsNameIsAndIbanIs(String name, String code) {
        formContent.findElementAndSendKeysFunction("bankName",name);
        formContent.findElementAndClickFunction("ibanclick");
        formContent.findElementAndSendKeysFunction("ibanCode",code);

    }

    @Then("^Currency is currencyDoviz and Integration Code is \"([^\"]*)\"$")
    public void currencyIsCurrencyDovizAndIntegrationCodeIs(String code)  {
        formContent.findElementAndClickFunction("currencyClick");
        formContent.findElementAndClickFunction("currencyDoviz");
        formContent.findElementAndClickFunction("integrationClick");
        formContent.findElementAndSendKeysFunction("integrationCode",code);
        formContent.findElementAndClickFunction("saveButton");
    }

    @When("^Name is delete \"([^\"]*)\"$")
    public void nameIsDelete(String name)  {
        dialogContent.editAndDeleteFunction(name,"delete");
        dialogContent.findElementAndClickFunction("yesBtn");

    }
}
