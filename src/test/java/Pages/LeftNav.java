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
    @FindBy(xpath = "(//span[text()='Reports'])[4]")
    private WebElement reports;
    @FindBy(xpath = "(//span[text()='Setup'])[7]")
    private WebElement reportSetup;
    @FindBy(xpath = "//span[text()='Excel Template']")
    private WebElement excelTemplate;
    @FindBy(xpath = "//span[text()='Salary Types']")
    private WebElement salaryTypes;
    @FindBy(xpath = "//span[text()='Salary Modifiers']")
    private WebElement salaryModifiers;
    @FindBy(xpath = "//span[text()='Salary Constants']")
    private WebElement salaryConstants;
    @FindBy(xpath = "(//span[text()='Bank Accounts'])[1]")
    private WebElement bankaccount;
    @FindBy(xpath = "//span[text()='Cities']")
    private WebElement city;
    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;
    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement setup;
    @FindBy(xpath = "(//span[text()='Subject Categories'])[1]")
    private WebElement subjectCategories;
    @FindBy(xpath = "(//span[text()='Subjects'])[1]")
    private WebElement subjects;





    WebElement myElement;
public void findElementAndClickFunction(String elementName){
    switch (elementName){
        case "setupOne":
            myElement=setupOne;
            break;

        case "parameters":
            myElement=parameters;
            break;

        case "countries":
            myElement=countries;
            break;

        case "humanResources":
            myElement=humanResources;
            break;

        case "humanSetup":
            myElement=humanSetup;
            break;

        case "positionSalary":
            myElement=positionSalary;
            break;

        case "positions":
            myElement=positions;
            break;

        case "reports":
            myElement=reports;
            break;

        case "reportSetup":
            myElement=reportSetup;
            break;


        case "excelTemplate":
            myElement=excelTemplate;
            break;

        case "salaryTypes":
            myElement=salaryTypes;
            break;
        case "salaryModifiers":
            myElement=salaryModifiers;
            break;
        case "salaryConstants":
            myElement=salaryConstants;
            break;
        case "bankaccount":
            myElement=bankaccount;
            break;
        case "city":
            myElement = city;
            break;

        case "education":
            myElement=education;
            break;
        case "setup":
            myElement=setup;
            break;
        case "subjectCategories":
           myElement=subjectCategories;
           break;
        case "subjects":
            myElement=subjects;
            break;




    }
    clickFunction(myElement);

}
}
