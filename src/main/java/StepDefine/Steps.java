package StepDefine;

import Functions.WebElements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.time.Duration;


public class Steps  {
   WebElements Loginbar = new WebElements();



    private WebDriver driver;


    @Given("^hepsi buradayagit$")
    public void hepsi_buradayagit()throws Throwable {
        driver=Driver.getDriver();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Given("^login butona tıkla$")
    public void login_butona_tıkla() throws Throwable {
        Loginbar.girisbarmove();
        Loginbar.clickgirisbtn();

    }

    @Given("^mail gir$")
    public void mail_gir() throws Throwable {
        Loginbar.sendemail();
        Loginbar.mailgiris();
    }

    @Given("^Sifre Gir$")
    public void sifre_Gir() throws Throwable {
        Loginbar.pasword();
        Loginbar.emailgiris();


    }

    @When("^giriş butonuna tıkladığımda$")
    public void giriş_butonuna_tıkladığımda() throws Throwable {

    }

    @Then("^isim kontrol$")
    public void isim_kontrol() throws Throwable {


    }








}
