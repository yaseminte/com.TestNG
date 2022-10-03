package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegatifLoginTesti {
    BrcPage brcPage = new BrcPage();
    @Test
    public void yanlisSifre() {
        // Bir test method olustur positiveLoginTest()
        //      https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brcPage.ilkLoginButonu.click();
        // test data user email : customerbluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        // test data password : 54321
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        // login butonuna tiklayin
        brcPage.ikinciLoginButtonu.click();
        // Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et

        Assert.assertTrue(brcPage.ikinciLoginButtonu.isDisplayed());

        Driver.closeDriver();
    }
    // Bu class'ta 2 test methodu daha olusturun
    // biri yanlisLullaniciAdi
    // digeri de yanlis sifre ve kullanici adi
}
