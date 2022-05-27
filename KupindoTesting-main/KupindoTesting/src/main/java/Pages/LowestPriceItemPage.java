package Pages;

import org.openqa.selenium.WebElement;

public class LowestPriceItemPage extends BasePage {


    private String lowestPriceItem = "//*[@id='container_right']/div[3]";
    public WebElement getLowestPriceItem(){
        return findElement(lowestPriceItem);
    }

    private String listaZeljaButton = "//div[@class = 'btn btn-default btn-sm btn_padding']";
    public WebElement getListaZeljaButton(){
        return findElement(listaZeljaButton);
    }
    private String listaZeljaBadge = "//li[@class = 'badge']";
    public WebElement getListaZeljaBadge(){
        return findElement(listaZeljaBadge);
    }

    private String itemInListaZelja = "//div[@class = 'block_anc']";
    public WebElement getItemInListaZelja (){
        return findElement(itemInListaZelja);
    }

    private String skiniSaListeButton = "//a[@class = 'delete']";
    public WebElement getSkiniSaListeButton (){
        return findElement(skiniSaListeButton);
    }

    private String daButton = "//button[@id = 'btnConfirm']";
    public WebElement getDaButton (){
        return findElement(daButton);
    }

    private String navbar = "//div[@class = 'menu_big']";
    public WebElement getNavbar (){
        return findElement(navbar);
    }

}
