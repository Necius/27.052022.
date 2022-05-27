package tests;

import driver.Driver;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.DEFAULT)
public class LoginTest extends BaseTest {

    private Object String;

    @Before
    public void testSetup() {
        Driver.getBrowser().get("https://www.kupindo.com/");
    }

//    public WebElement click(WebElement element) {
//        WebDriverWait wait = new WebDriverWait(Driver.getBrowser(), 10);
//        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
//        return element;
//    }

    @Test
    public void loginWithValidCredentialsTest(){
        assertTrue(kupindo.getHomePage().getUlazButton().isDisplayed());

        kupindo.getHomePage().getUlazButton().click();
        assertEquals("https://www.kupindo.com/Prijava", Driver.getBrowser().getCurrentUrl());

        kupindo.getPrijavaPage().getKorisnickoImeField().click();
        kupindo.getPrijavaPage().getKorisnickoImeField().sendKeys("zastava");
        kupindo.getPrijavaPage().getLozinkaField().click();
        kupindo.getPrijavaPage().getLozinkaField().sendKeys("abarth");
        kupindo.getPrijavaPage().getUlazPrijavaButton().click();

        assertEquals("https://www.kupindo.com/", Driver.getBrowser().getCurrentUrl());
        assertTrue(kupindo.getHomePage().getIzlazButton().isDisplayed());
        assertTrue(kupindo.getHomePage().getClanLink().isDisplayed());
        assertTrue(kupindo.getHomePage().getClanLink().isEnabled());

//        Driver.getBrowser().quit();
    }

    @Test
    public void loginWithInvalidCredentialsTest() {
        assertTrue(kupindo.getHomePage().getUlazButton().isDisplayed());
        assertTrue(kupindo.getHomePage().getUlazButton().isEnabled());
        kupindo.getHomePage().getUlazButton().click();
        assertEquals("https://www.kupindo.com/Prijava", Driver.getBrowser().getCurrentUrl());
        kupindo.getPrijavaPage().getKorisnickoImeField().click();
        kupindo.getPrijavaPage().getKorisnickoImeField().sendKeys("1234");

        kupindo.getPrijavaPage().getLozinkaField().click();
        kupindo.getPrijavaPage().getLozinkaField().sendKeys("1234");

        kupindo.getPrijavaPage().getUlazPrijavaButton().click();

        assertTrue(kupindo.getPrijavaPage().getPogresnoKorisnickoImeIliLozinka().isDisplayed());

        Driver.getBrowser().quit();
    }

    @Test
    public void logoutTest(){

        loginWithValidCredentialsTest();

        kupindo.getHomePage().getIzlazButton().click();

        assertEquals("https://www.kupindo.com/Odjava", Driver.getBrowser().getCurrentUrl());
        assertTrue(kupindo.getHomePage().getUlazButton().isDisplayed());

//        Driver.getBrowser().quit();
    }

}

