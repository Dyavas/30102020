package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends _Parent {
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
    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;
    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement humanSetup;
    @FindBy(xpath = "//span[text()='Position Salary']")
    private WebElement positionSalary;
    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;






    WebElement myElement;
public void findElementAndClickFunction(String elementName){
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
        case "humanResources":{
            myElement=humanResources;
            break;
        }
        case "humanSetup":{
            myElement=humanSetup;
            break;
        }
        case "positionSalary":{
            myElement=positionSalary;
            break;
        }
        case "positions":{
            myElement=positions;
            break;
        }



    }
    clickFunction(myElement);

}
}
