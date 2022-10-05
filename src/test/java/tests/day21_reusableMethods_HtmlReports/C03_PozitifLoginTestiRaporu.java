package tests.day21_reusableMethods_HtmlReports;

import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C03_PozitifLoginTestiRaporu extends TestBaseRapor {

    BrcPage brcPage = new BrcPage();

    @Test
    public void pozitifLoginTest() {
    //    extendTest = extentReports.createTest("Pozitif Login","Gecrli username ve sifre");
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

        Driver.closeDriver();
    }
}
