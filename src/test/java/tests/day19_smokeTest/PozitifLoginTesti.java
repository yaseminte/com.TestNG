package tests.day19_smokeTest;

import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PozitifLoginTesti {

    BrcPage brcPage = new BrcPage();

    @Test
    public void pozitifLoginTest() {

        // Bir test method olustur positiveLoginTest()
        //      https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brcPage.ilkLoginButonu.click();
        // test data user email : customerbluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        // test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        // login butonuna tiklayin
        brcPage.ikinciLoginButtonu.click();
        // Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et

    }
}
