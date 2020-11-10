package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends _Parent {
    public FormContent(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//ms-text-field//input)[3]")
    private WebElement nameInput;
    @FindBy(xpath = "(//ms-text-field//input)[4]")
    private WebElement shortnameInput;
    @FindBy(xpath = "//ms-dialog-buttons//ms-save-button")
    private WebElement saveButton;

    WebElement myElemet;
    public void findElementAndClickFunction(String elemetName)
    {
        switch ("elemenName")
            {
            case "saveButton":
                myElemet = saveButton;
                break;
            }
    }

    public void findElementAndSendKeysFunction(String elemetName,String value)
    {
        switch ("elementName")
        {
            case "nameInput":
                myElemet=nameInput;
                break;

            case "shortnameInput":
                myElemet=shortnameInput;
                break;

        }
        sendKeysFunction(myElemet,value);
    }

}
