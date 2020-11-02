package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.Driver;
import org.testng.Assert;

import java.util.List;


public class _Parent {
    WebDriver driver;
    WebDriverWait wait;
    public _Parent(){
        driver=Driver.getDriver();
        wait=new WebDriverWait(driver,10);

    }
    public void clickFunction(WebElement element){
        waituntilClickable(element);//eleman klik yapilabilene kadar bekle
        scrollToElement(element);
        element.click();
    }
    public  void sendkeysFunction(WebElement element,String value){
       waitUntilvisible(element);
       scrollToElement(element);
       element.clear();
       element.sendKeys(value);
    }
    public void waituntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitUntilvisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView()",element);
    }
    public void waiting(int ms){
        try{
            Thread.sleep(ms);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList){
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;
}
    public void verifyElementContainsText(WebElement element,String text){
        wait.until(ExpectedConditions.textToBePresentInElement(element,text));
        System.out.println(element.getText());
        System.out.println(text);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));

    }

}
