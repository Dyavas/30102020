package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class FormContent extends _Parent {
    WebElement myElement;
    private String elementName;
    private String value;

    public FormContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;
    @FindBy(xpath = "(//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortnameInput;
    @FindBy (xpath = "//ms-text-field[@formcontrolname='code']/input")//ayni
    private WebElement codeInput;
    @FindBy(xpath = "//ms-dialog-buttons//ms-save-button")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-table-toolbar//button")
    private WebElement formAddButton;

    @FindBy(xpath = "//mat-chip-list//input")
    private WebElement salaryUserType;
    @FindBy(xpath = "//mat-option[@role='option'][1]")
    private WebElement option1;
    @FindBy(xpath = "(//mat-form-field//input)[1]")
    private WebElement description;
    @FindBy(xpath = "(//mat-form-field//input)[2]")
    private WebElement variable;
    @FindBy(xpath = "(//mat-form-field//input)[5]")
    private WebElement amount;
    @FindBy(xpath = "//ms-save-button//button")
    private WebElement formSaveButton;
    @FindBy(xpath = "(//ms-dialog-content//input)[1]")
    private WebElement formNameInput;
    @FindBy(xpath = "//input[@data-placeholder='Valid From']")
    private WebElement formDateInput;
    @FindBy(xpath = "//div[@class='cdk-overlay-container']")
    private WebElement formDiv;
    @FindBy(xpath = "(//ms-dialog-content//input)[4]")
    private WebElement formKeyInput;
    @FindBy(xpath = "(//ms-dialog-content//input)[5]")
    private WebElement formValueInput;
    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[8]/fa-icon")
    private WebElement addBTN;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement bankName;
    @FindBy(xpath = "//ms-masked-text-field[@formcontrolname='iban']/input")
    private WebElement ibanclick;
    @FindBy(xpath = "//ms-masked-text-field[@formcontrolname='iban']/input")
    private WebElement ibanCode;
    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    private WebElement currencyClick;
    @FindBy(xpath = "//span[text()=' USD ']")
    private WebElement currencyDoviz;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='integrationCode']/input")
    private WebElement integrationClick;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='integrationCode']/input")
    private WebElement integrationCode;
    @FindBy(xpath = "(//mat-select[@role='combobox'])[2]")
    private WebElement typeSelect;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='orderNo']/input")
    private WebElement orderInput;
    @FindBy(xpath = "(//ms-edit-button/button)[1]")
    private WebElement firstValue;
    @FindBy(xpath = "(//ms-delete-button/button)[1]")
    private WebElement secondValue;



    public void findElementAndClickFunction(String ElementName) {
        switch (ElementName) {
            case "saveButton":
                myElement = saveButton;
                break;
            case "salaryUserType":
                myElement = salaryUserType;
                break;
            case "option1":
                myElement = option1;
                break;
            case "formAddButton":
                myElement = formAddButton;
                break;
            case "formSaveButton":
                myElement = formSaveButton;
                break;

            case "formDateInput":
                myElement = formDateInput;
                break;
            case "formDiv":
                myElement = formDiv;
                break;
            case "addBTN":
                myElement = addBTN;
                break;
            case "ibanclick":
                myElement = ibanclick;
                break;
            case "currencyClick":
                myElement = currencyClick;
                break;
            case "integrationClick":
                myElement = integrationClick;
                break;

            case "currencyDoviz":
                myElement = currencyDoviz;
                break;
            case "typeSelect":
                myElement = typeSelect;
                break;
            case "firstValue":
                myElement = firstValue;
                break;
            case "secondValue":
                myElement = secondValue;
                break;


        }
        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String elementName,String value)
    {

        switch (elementName)
        {
            case "nameInput":
                myElement=nameInput;
                break;

            case "shortnameInput":
                myElement=shortnameInput;
                break;
            case "description":
                myElement=description;
                break;
            case "variable":
                myElement=variable;
                break;
            case "amount":
                myElement=amount;
                break;
            case "formNameInput":
                myElement=formNameInput;
                break;
            case "formDateInput":
                myElement=formDateInput;
                break;
            case "formValueInput":
                myElement=formValueInput;
                break;
            case "formKeyInput":
                myElement=formKeyInput;
                break;
            case "ibanCode":
                myElement = ibanCode;
                break;
            case "currencyDoviz":
                myElement = currencyDoviz;
                break;
            case "integrationCode":
                myElement = integrationCode;
                break;
            case "bankName":
                myElement = bankName;
                break;
            case "orderInput":
                myElement = orderInput;
                break;
            case "codeInput":
                myElement = codeInput;
                break;

        }
        sendKeysFunction(myElement,value);
    }

}
