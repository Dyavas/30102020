package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class _3_4_CityCountryCreateAndDeleteSteps {
    LeftNav leftNav = new LeftNav();
    DialogContent dialogContent = new DialogContent();

    @And("^Create a city name as \"([^\"]*)\" and country name as \"([^\"]*)\"$")
    public void createACityNameAsAndCountryNameAs(String city, String country)  {
        dialogContent.waiting(1000);
        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndClickFunction("countryOfTheCity");
        dialogContent.findElementAndSelectOption("countryOfTheCityDropDown", country);
        dialogContent.findElementAndSendKeysFunction("cityAddName", city);
        dialogContent.findElementAndClickFunction("citySaveButton");

    }

    @And("^Success message must be displayed!$")
    public void successMessageMustBeDisplayed() {
        dialogContent.findElementAndVerifyContainsText("msjContainer", "successfully");
    }

    @And("^Error message should be displayed!$")
    public void errorMessageShouldBeDisplayed() {
        dialogContent.findElementAndVerifyContainsText("msjContainer", "deleted");
    }

    @And("^User try delete the City  \"([^\"]*)\"$")
    public void userTryDeleteTheCity(String nameOfCountryToDelete) {
        dialogContent.editAndDeleteFunction(nameOfCountryToDelete, "delete");
        dialogContent.findElementAndClickFunction("yesBtn");
    }

    @And("^Success message should be observed$")
    public void successMessageShouldBeObserved() {

        dialogContent.findElementAndVerifyContainsText("msjContainer", "deleted");
        dialogContent.findElementAndVerifyContainsText("msjContainer", "successfully");
    }
}
