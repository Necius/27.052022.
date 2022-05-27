package Pages;

public class Kupindo {

    private HomePage homePage;
    private PrijavaPage prijavaPage;
    private ListaZeljaPage listaZeljaPage;
    private LowestPriceItemPage lowestPriceItemPage;

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public PrijavaPage getPrijavaPage() {
        if (prijavaPage == null) {
            prijavaPage = new PrijavaPage();
        }
        return prijavaPage;
    }

    public ListaZeljaPage getListaZeljaPage() {
        if (listaZeljaPage == null) {
            listaZeljaPage = new ListaZeljaPage();
        }
        return listaZeljaPage;
    }

    public LowestPriceItemPage getLowestPriceItemPage() {
        if (lowestPriceItemPage == null) {
            lowestPriceItemPage = new LowestPriceItemPage();
        }
        return lowestPriceItemPage;
    }

}

