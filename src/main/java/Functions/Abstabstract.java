package Functions;

import com.sun.org.apache.bcel.internal.ExceptionConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class Abstabstract {

    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void cliscFunc(WebElement clickElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeysFunc(WebElement senkeyselement,String value){
        wait.until(ExpectedConditions.visibilityOf(senkeyselement));
        senkeyselement.sendKeys(value);
    }









}
