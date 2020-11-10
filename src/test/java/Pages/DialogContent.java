package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class DialogContent extends _Parent {
    WebElement myElement;

    //buradaki driver silindi çünkü Parentten geliyor.gerek kalmadı
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
    //ms-add-button[@tooltip='POSITIONS.TITLE.ADD']
    private WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='title']/input")
    private WebElement newInput;
    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']")
    private WebElement saveBtn;

    @FindBy(xpath = "//input[@matinput]")
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


        }
        clickFunction(myElement);
    }

        public void findElementAndSendKeysFunction (String ElementName, String value){
            /**
             * Buraya tıklanacak butonun adı gönderilecek
             * Burada adından hangi eleman olduğu bulunuyor
             * ve sonra tıklanıyor.
             */

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

        // yukarıdaki bölüm mesajlar kaybolmadan edit ve deleteye tıklatamıyordu ,
        // yukarıdaki kod ile bu eleman invisible olana kadar bekle dedik.

        // aşağıda editOrDelete den gelen edit veya delete kelimesine
        // göre hangi buton tipine tıklatılacaksa onun LİST i alınıyor.
        List<WebElement> btnList = new ArrayList<>();

       WebElement e;
        searchText("erstSearchName",Name);

        if (editOrDelete.equalsIgnoreCase("delete")) {
          //  btnList = waitVisibleListAllElement(deleteButtonList);

            wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("ms-delete-button>button"),1));
            e= driver.findElement(By.cssSelector("ms-delete-button>button"));
        }else{

          // btnList = waitVisibleListAllElement(editButtonList);
          //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table//*[contains(text(),'text')]")));
             wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("ms-edit-button>button"),1));
             e= driver.findElement(By.cssSelector("ms-edit-button>button"));

        }
        clickFunction(e);

        // nameList içerisinde (table ın 2 stunundaki isimlerin olduğu
        // liste) ülke adı aranıyor. bulunduğunda o indexteki butona
        // (edit veya delete) tıklanarak. Dialog penceresi açılıyor.


        // sayfa yenilendiğinde isimler değişiyor, bu yüzden
        // tekrar bulması için süre eklendi.(stale problemini burası çözdü)


//        List<WebElement> nameListNew = waitVisibleListAllElement(nameList);
//        for (int i = 0; i < nameListNew.size(); i++) {
//            System.out.println(i+" "+nameListNew.toString());
//            if (nameListNew.get(i).getText().equalsIgnoreCase(Name)) {
//                clickFunction(btnList.get(i));
//            }
//        }

        // ekranda tıklandıktan sonra izleyebilmek için kondu
        // waiting(5000);
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
