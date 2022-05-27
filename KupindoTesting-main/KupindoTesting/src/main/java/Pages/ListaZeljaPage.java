package Pages;

import org.openqa.selenium.WebElement;

public class ListaZeljaPage extends BasePage {

    private String itemInListaZelja = "//div[@class = 'block_anc']";
    public WebElement getItemInListaZelja() {
        return findElement(itemInListaZelja);
    }

    private String removeFromListaZeljaButton = "//a[@class = 'delete']";
    public WebElement getRemoveFromListaZeljaButton() {
        return findElement(removeFromListaZeljaButton);
    }

    private String confirmButton = "//button[@id = 'btnConfirm']";
    public WebElement getConfirmButton() {
        return findElement(confirmButton);
    }
}
