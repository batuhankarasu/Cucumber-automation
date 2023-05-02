package Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebElements extends Abstabstract {

    WebDriver driver;


    public WebElements(){
        driver = Driver.getDriver();

        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//*[@id=\"myAccount\"]")
    private WebElement girisbar;
    public void girisbarmove(){
        Actions act = new Actions(driver);
        act.moveToElement(girisbar).build().perform();

    }
    @FindBy(xpath = "//*[@id=\"login\"]")
    private WebElement girisbtn;
    public void clickgirisbtn(){
        cliscFunc(girisbtn);
    }


    @FindBy(id ="txtUserName")
    private WebElement emailarea;
    public void sendemail(){
        sendKeysFunc(emailarea,"batuhankarasu147741@hotmail.com");
    }


    @FindBy(xpath = "//*[@id=\"btnLogin\"]")
    private WebElement mailgirisbtn;
    public void mailgiris(){
        cliscFunc(mailgirisbtn);
    }


    @FindBy(id="txtPassword")
    private WebElement paswordarea;
    public void pasword(){
        sendKeysFunc(paswordarea,"20012007aA@");
    }


    @FindBy(id="btnEmailSelect")
    private WebElement emailgirişbtn;
    public void emailgiris(){
        cliscFunc(emailgirişbtn);
    }


















}
