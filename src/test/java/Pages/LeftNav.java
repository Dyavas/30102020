package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends _Parent{
public LeftNav(){
    PageFactory.initElements(driver,this);
}
//findby locatorlar buraya yazilacak
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
        private WebElement setupOne;
    @FindBy(xpath = "//span[text()='Parameters']")
        private WebElement parameters;
    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    private WebElement countries;


    WebElement myElement;
public void findElementAndClickFuncktion(String elementName){
    switch (elementName){
        case "setupOne":{
            myElement=setupOne;
            break;
        }
        case "parameters":{
            myElement=parameters;
            break;
        }
        case "countries":{
            myElement=countries;
            break;
        }

    }
    clickFunction(myElement);

}
}
