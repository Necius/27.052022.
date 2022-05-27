package Pages;

import driver.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public WebElement click(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getBrowser(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        return element;
    }

    public WebElement findElement(String xpath) {
        try {
            return getElement(xpath);
        } catch (NoSuchElementException e) {
            return null;
        }

    }

    private WebElement getElement(String xpath) {
        WebElement element = null;
        for (int i = 1; i <= 10; i++) {
            Driver.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            element = Driver.getBrowser().findElementByXPath(xpath);
            if (element.isEnabled() && element.isDisplayed()) {
                return element;
            }
        }
        return element;
    }


}
