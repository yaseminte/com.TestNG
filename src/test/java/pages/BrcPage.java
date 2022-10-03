package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {

    public BrcPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement ilkLoginButonu;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//*[@id='formBasicPassword']")
    public WebElement passwordTextBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement ikinciLoginButtonu;

    @FindBy (xpath = "//*[text()='email must be a valid email']")
    public WebElement emailMustBeAValidEmailYazisi;


}
