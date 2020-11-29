package Pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class _Parent {
    /**
     * Bu dosya diğer bütün page ler için ortak click ve sendkeys
     * için bekleme, scroll ve clear gibi bütün işlemleri tek yerden
     * yapabilmek için eklendi.Bu class diğer pageler tarafından exten edilerek
     * kullanılacak.Böylece tüm pagelerdeki elemanların click ve sendkeys özelliği
     * hem bekleme hem scroll hem de clear özelliği kazanmış olacak.
     */

    WebDriver driver;
    WebDriverWait wait;

    public _Parent() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 20);
    }


    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element);// eleman clikable olana kadar bekle
        scrollToElement(element); // eleman kadar scroll yap
        System.out.println(element.toString());
        element.click();// click yap

    }


    public void sendKeysFunction(WebElement element, String value)
    {
        waitUntilVisible(element);// eleman görünüt olana kadar bekle
        scrollToElement(element);// elemana kadar scroll yap
        element.clear();// eleman clear yap
        element.sendKeys(value);// value yi gönder
    }


    public void waitUntilClickable(WebElement element){

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisible(WebElement element){
       wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element)
    {
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waiting(int ms)
    {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitVisibleListAllElement1(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));


    }
    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList){
       // wait.until(ExpectedConditions.visibilityOfAllElements(elementList));

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ms-add-button[@tooltip='POSITIONS.TITLE.ADD']")));
        return elementList;
    }

    public void verifyElementContainsText(WebElement element, String text){
        // waitUntilVisible(element);
       wait.until(ExpectedConditions.textToBePresentInElement(element,text));

        System.out.println(element.getText());
        System.out.println(text);

        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));

    }
    public boolean girdiSayiMi(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public void selectOptionByString(List<WebElement> elementList, String str) {
        str = str.trim();
        if (girdiSayiMi(str)) {
            if (Integer.parseInt(str) < elementList.size()) {
                clickFunction(selectOptions(elementList, Integer.parseInt(str)));
            }
        } else {
            clickFunction(selectOptions(elementList, str));
        }
    }

    public WebElement selectOptions(List<WebElement> elementList, String value) {
        WebElement elementSelected = null;
        for (WebElement element : elementList) {
            if (element.getText().toLowerCase().contains(value.toLowerCase())) {
                elementSelected = element;
                break;
            }
        }
        return elementSelected;
    }

    public WebElement selectOptions(List<WebElement> elementList, int index) {
        return elementList.get(index);
    }

}
