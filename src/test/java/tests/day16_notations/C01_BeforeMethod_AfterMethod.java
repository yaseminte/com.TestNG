package tests.day16_notations;

import org.testng.annotations.Test;

import utilities.TestBase;


public class C01_BeforeMethod_AfterMethod extends TestBase {

    // @BeforeMethod ve @AfterMethod notasyonlari
    // JUnit'deki @before ve @After gibidir
    // her test methodundan once ve sonra calisirler

    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techproedTesti() {
        driver.get("https://techproeducation.com");
    }
}
