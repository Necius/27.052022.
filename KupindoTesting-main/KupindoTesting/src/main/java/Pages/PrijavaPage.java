package Pages;

import org.openqa.selenium.WebElement;

public class PrijavaPage extends BasePage {

    private String korisnickoImeField = "//input[@id = 'txtUsername']";
    public WebElement getKorisnickoImeField(){
        return findElement (korisnickoImeField);
    }

    private String lozinkaField = "//*[@id='txtPassword']";
    public WebElement getLozinkaField(){
        return findElement (lozinkaField);
    }

    private String ulazPrijavaButton = "//input[@id = 'btnPrijava']";
    public WebElement getUlazPrijavaButton(){
        return findElement (ulazPrijavaButton);
    }
    private String pogresnoKorisnickoImeIliLozinka = "//div[@class = 'alert alert-danger alert-dismissible fade in text-left']";
    public WebElement getPogresnoKorisnickoImeIliLozinka(){
        return findElement(pogresnoKorisnickoImeIliLozinka);
    }



}
