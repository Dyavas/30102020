package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class _3_3_CityStepsAndCreatesteps {
    LeftNav leftNav = new LeftNav();
    DialogContent dialogContent = new DialogContent();
    @And("^Navigate to city page$")
    public void navigateToCityPage() {
        leftNav.findElementAndClickFunction("setupOne");
        leftNav.findElementAndClickFunction("parameters");
        leftNav.findElementAndClickFunction("city");

    }

    @When("^Create a city name as \"([^\"]*)\" and country name as \"([^\"]*)\" and code as \"([^\"]*)\"$")
    public void createACityNameAsAndCountryNameAsAndCodeAs(String city, String country, String code)  {
        dialogContent.waiting(1000);
        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndClickFunction("countyCity");
        dialogContent.findElementAndSendKeysFunction("countryNameInput",country);
        dialogContent.findElementAndSendKeysFunction("countryCodeInput",code);
        dialogContent.findElementAndClickFunction("countrySaveButton");
        dialogContent.findElementAndClickFunction("countryOfTheCity");
        dialogContent.findElementAndSelectOption("countryOfTheCityDropDown",country);
        dialogContent.findElementAndSendKeysFunction("cityAddName", city);
        dialogContent.findElementAndClickFunction("citySaveButton");

    }
}
