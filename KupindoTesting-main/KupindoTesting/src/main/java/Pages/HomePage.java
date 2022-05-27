package Pages;

import org.openqa.selenium.WebElement;

// Sredi kod po logicnom redu

public class HomePage extends BasePage {

    private String ulazButton = "//a[@class = 'log_btn btn btn-success']";

    public WebElement getUlazButton() {
        return findElement(ulazButton);
    }

    private String uniCreditLink = "//li[@class = 'paycard_footer_item paycard_footer_unicredit pull-left']";

    public WebElement getUniCreditLink() {
        return findElement(uniCreditLink);
    }

    private String allSecureLink = "//li[@class = 'paycard_footer_item paycard_footer_allsecure pull-left']";

    public WebElement getAllSecurelink() {
        return findElement(allSecureLink);
    }

    private String masterCardLink = "//li[@class = 'paycard_footer_item paycard_footer_securemaster pull-right']";

    public WebElement getMasterCardLink() {
        return findElement(masterCardLink);
    }

    private String visaLink = "//li[@class = 'paycard_footer_item paycard_footer_vervisa pull-right']";

    public WebElement getVisaLink() {
        return findElement(visaLink);
    }

    private String ipayLink = "//li[@class = 'paycard_footer_item paycard_footer_ipay pull-right']";

    public WebElement getIpayLink() {
        return findElement(ipayLink);
    }

    private String izlazButton = "//*[text()='Izlaz']";

    public WebElement getIzlazButton() {
        return findElement(izlazButton);
    }

    private String sportskaOpremaLink = "//*[text() = 'Sportska oprema']";

    public WebElement getSportskaOpremaLink() {
        return findElement(sportskaOpremaLink);
    }

    private String traziField = "//div[@id = 'txtPretraga']";

    public WebElement getTraziField() {
        return findElement(traziField);
    }

    private String traziButton = "//div[@id = 'search_button']";

    public WebElement getTraziButton() {
        return findElement(traziButton);
    }

    private String acceptCookies = "//button[@class = 'close close_info_cookies purple']";
    public WebElement getAcceptCookies (){
        return findElement(acceptCookies);
    }

    private String clanLink = "//*[@id='top_menu']/ul/li[2]/a";
    public WebElement getClanLink (){
        return findElement((clanLink));
    }

}
