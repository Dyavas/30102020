package Pages;

import okhttp3.internal.connection.RouteSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DialogContent extends _Parent {

    public DialogContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;
    @FindBy(linkText = "Got it!")
    private WebElement gotItBtn;

    @FindAll({
            @FindBy(linkText = "Got it!")
    })
    private List<WebElement>goItBtns;
    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindAll({
            @FindBy(xpath = "//div[@id='toast-container']")
    })
    private List<WebElement> msjContainers;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement ErrorMessage;

    @FindBy(xpath = "//ms-add-button//button")
    private WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='title']/input")
    private WebElement newInput;
    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']")
    private WebElement saveBtn;
    @FindBy(xpath = "(//input[@matinput])[1]")
    private WebElement erstSearchName;
    @FindBy(xpath = "//span[text()=' Search ']")
    private WebElement SearchBtn;
    @FindBy(xpath = "ms-table#ms-table-6 > div > table > tbody > tr > td:nth-of-type(2)")
    private WebElement Searchsnc;
    @FindAll({
            @FindBy(xpath = "//table/tbody/tr/td[2]")
    })
    private List<WebElement>nameList;
    @FindAll({
            @FindBy(xpath = "//ms-delete-button/button")
    })
    private List<WebElement>deleteButtonList;
    @FindAll({
            @FindBy(xpath = "//ms-edit-button/button")
    })
    private List<WebElement>editButtonList;

    @FindAll({
            @FindBy(xpath = "//span[@class='mat-option-text']")
    })
    public List<WebElement> userTypeAllOptions;
    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortnameInput;
    @FindBy(xpath = "//ms-dialog-buttons//ms-save-button")
    private WebElement saveButton;

//zeynep hanim method

    @FindBy(xpath = "(//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button)[2]")
    private WebElement countyCity;
    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input)[3]")
    private WebElement countryNameInput;
    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.CODE']/input")//ayni
    private WebElement countryCodeInput;
    @FindBy(xpath = "(//ms-save-button//button)[2]")
    private WebElement countrySaveButton;
    @FindBy(xpath = "//mat-form-field[@formgroupname='country']")
    private WebElement countryOfTheCity;
    @FindBy (xpath = "//ms-text-field[@formcontrolname='code']/input")//ayni
    private WebElement codeInput;

    @FindAll({
             @FindBy(css = "mat-option[role='option']")//ayni
            })
    public List<WebElement> countryOfTheCityDropDown;
        @FindAll({
            @FindBy(css = "mat-option[role='option']")//ayni
    })
    private List<WebElement> option;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")//ayni
    private WebElement cityAddName;
    @FindBy(xpath = "//ms-save-button//button")
    private WebElement citySaveButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")//ayni
    private WebElement subjectName;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")//ayni
    private WebElement subCodeClick;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")//ayni
    private WebElement subjectCode;
    @FindBy(xpath = "(//span[@class='mat-button-wrapper']/fa-icon)[38]")
    private WebElement smallAddBtn;
    @FindBy(xpath = "(//ms-text-field[@formcontrolname='name']/input)[2]")
    private WebElement newNameInput;
    @FindBy(xpath = "(//ms-text-field[@formcontrolname='code']/input)[2]")//ayni
    private WebElement newCodeClick;
    @FindBy(xpath = "(//ms-text-field[@formcontrolname='code']/input)[2]")//ayni
    private WebElement newCodeInput;
    @FindBy(xpath = "(//ms-save-button[@class='ng-star-inserted'])[2]")
    private WebElement smallsaveBtn;
    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    private WebElement subCategoryClick;
    @FindBy(xpath = "(//mat-option[@role='option'])[1]")//ayni
    private WebElement subCategory;
    @FindBy(xpath = "(//mat-select[@role='combobox'])[4]")
    private WebElement styleClick;
    @FindBy(xpath = "(//div[@role='listbox']/mat-option)[4]")
    private WebElement styleInputBlue;



    WebElement myElement;


    public void findElementAndSelectOption(String listName, String secenek) {
        selectOptionByString(findWebElementList(listName), secenek);

    }

    List<WebElement> myElementList=new ArrayList<>();

    public List<WebElement> findWebElementList(String webElementListName) {
        switch (webElementListName) {

            case "deleteButtonList":
                myElementList = deleteButtonList;

            case "nameList":
                myElementList = nameList;
                break;
            case "countryOfTheCityDropDown":
                myElementList = countryOfTheCityDropDown;

            case "option":
                myElementList = option;
                break;
        }
        return myElementList;
    }

    //mothod bitisi
    public void findElementAndClickFunction(String ElementName) {
        /**
         * Buraya tıklanacak butonun adı gönderilecek
         * Burada adından hangi eleman olduğu bulunuyor
         * ve sonra tıklanıyor.
         */

        switch (ElementName) {
            case "loginButton":
                myElement = loginButton;
                break;

            case "gotItBtn":
                if (goItBtns.size()==0)
                    return;
                myElement = gotItBtn;
                break;

            case "addButton":
                myElement = addButton;
                break;
            case "saveBtn":
                myElement = saveBtn;
                break;
            case "SearchBtn":
                myElement = SearchBtn;
                break;
            case "yesBtn":
                myElement = yesBtn;
                break;
            case "countyCity":
                myElement = countyCity;
                break;
            case "countrySaveButton":
                myElement = countrySaveButton;
                break;

            case "countryOfTheCity":
                myElement = countryOfTheCity;
                break;

            case "citySaveButton":
                myElement = citySaveButton;
                break;
            case "subCodeClick":
                myElement = subCodeClick;
                break;
            case "smallAddBtn":
                myElement = smallAddBtn;
                break;
            case "newCodeClick":
                myElement = newCodeClick;
                break;
            case "smallsaveBtn":
                myElement = smallsaveBtn;
                break;
            case "subCategoryClick":
                myElement = subCategoryClick;
                break;
            case "subCategory":
                myElement = subCategory;
                break;
            case "styleClick":
                myElement = styleClick;
                break;
            case "styleInputBlue":
                myElement = styleInputBlue;
                break;



        }
        clickFunction(myElement);
    }

        public void findElementAndSendKeysFunction (String ElementName, String value){
            /**
             * Buraya tıklanacak butonun adı gönderilecek
             * Burada adından hangi eleman olduğu bulunuyor
             * ve sonra tıklanıyor.
             */
//            List<WebElement> itemNameList = driver.findElements(By.xpath("//span[text()='Add to Cart']"));
//            itemNameList.get(0).click();//incelenecek

            switch (ElementName) {
                case "username":
                    myElement = username;
                    break;
                case "password":
                    myElement = password;
                    break;
                case "newInput":
                    myElement = newInput;
                    break;
                case "erstSearchName":
                    myElement = erstSearchName;
                    break;
                case "nameInput":
                    myElement = nameInput;
                    break;
                case "shortnameInput":
                    myElement = shortnameInput;
                    break;
                case "countryCodeInput":
                    myElement = countryCodeInput;
                    break;
                case "codeInput":
                    myElement = codeInput;
                    break;
                case "countryNameInput":
                    myElement = countryNameInput;
                    break;
                case "cityAddName":
                    myElement = cityAddName;
                    break;
                case "subCodeClick":
                    myElement = subCodeClick;
                    break;
                case "subjectName":
                    myElement = subjectName;
                    break;
                case "subjectCode":
                    myElement = subjectCode;
                    break;
                case "newNameInput":
                    myElement = newNameInput;
                    break;
                case "newCodeInput":
                    myElement = newCodeInput;
                    break;


            }

            sendKeysFunction(myElement, value);
        }


    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "msjContainer":
                myElement = msjContainer;
                break;

            case "ErrorMessage":
                myElement = ErrorMessage;
                break;
        }

        verifyElementContainsText(myElement, msg);
    }

    public void searchText(String elementName,String text ) {
        switch (elementName) {
            case "erstSearchName":
                myElement = erstSearchName;
                break;
        }
        sendKeysFunction(myElement, text);
        clickFunction(SearchBtn);
    }


    public void editAndDeleteFunction(String Name, String editOrDelete) {

        // invisible olma beklemesini, display ise şartına bağladık, yani
        // gözüküyorsa kaybolana kadar bekle.

       if (msjContainers.size()>0) {
           if (msjContainer.isDisplayed())
               wait.until(ExpectedConditions.invisibilityOfAllElements(msjContainer));
       }


       WebElement e;
        searchText("erstSearchName",Name);

        if (editOrDelete.equalsIgnoreCase("delete")) {

            wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("ms-delete-button>button"),1));
            e= driver.findElement(By.cssSelector("ms-delete-button>button"));
        }else{


             wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("ms-edit-button>button"),1));
             e= driver.findElement(By.cssSelector("ms-edit-button>button"));

        }
        clickFunction(e);
    }


    public void selectUserType(String userType) {

        for (WebElement n : userTypeAllOptions) {
            if (n.getText().contains(userType)) {
                clickFunction(n);
                break;
            }
        }
    }

}
