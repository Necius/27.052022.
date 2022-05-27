package tests;

import driver.Driver;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FooterLinksTest extends BaseTest {
    private Object String;
    LoginTest loginTest = new LoginTest();

    @Before
    public void testSetup() {
        Driver.getBrowser().get("https://www.kupindo.com/");
    }

    @Test
    public void testCaseFooterLinks() {

//        loginTest.loginWithValidCredentials();

//        kupindo.getHomePage().getUlazButton().click();
//        assertEquals("https://www.kupindo.com/Prijava", Driver.getBrowser().getCurrentUrl());
//        kupindo.getPrijavaPage().getKorisnickoImeField().click();
//        kupindo.getPrijavaPage().getKorisnickoImeField().sendKeys("zastava");
//        kupindo.getPrijavaPage().getLozinkaField().click();
//        kupindo.getPrijavaPage().getLozinkaField().sendKeys("abarth");
//        kupindo.getPrijavaPage().getUlazPrijavaButton().click();

        if (kupindo.getHomePage().getAcceptCookies() != null) {
            kupindo.getHomePage().getAcceptCookies().click();
        }

        kupindo.getHomePage().getUniCreditLink().click();

        ArrayList<String> tabs2 = new ArrayList<String> (Driver.getBrowser().getWindowHandles());
        Driver.getBrowser().switchTo().window(tabs2.get(1));

        assertEquals("https://www.unicreditbank.rs/content/cee2020-pws-rs/rs/pi.html/", Driver.getBrowser().getCurrentUrl());

        Driver.getBrowser().close();

        Driver.getBrowser().switchTo().window(tabs2.get(0));

        }
    }


