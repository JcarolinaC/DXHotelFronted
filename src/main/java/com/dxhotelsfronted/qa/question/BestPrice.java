package com.dxhotelsfronted.qa.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static com.dxhotelsfronted.qa.userinterfaces.SearchHotel.COMPARE_PRICE;
import static com.dxhotelsfronted.qa.userinterfaces.SearchHotel.SELECT_OPTION;

public class BestPrice implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        String price = BrowseTheWeb.as(actor).findBy(COMPARE_PRICE.getCssOrXPathSelector()).getText();
        int bestPrice = Integer.parseInt(price);
        System.out.println(price);

        String hQuantity = BrowseTheWeb.as(actor).findBy(SELECT_OPTION.getCssOrXPathSelector()).getText();
        String spread = hQuantity.split(",")[0];
        int quantity = Integer.parseInt(spread);
        System.out.println(hQuantity);

        int menor = bestPrice;
        for (int i = 0; i < quantity; i++) {
            if(menor > bestPrice)
                menor = bestPrice;
            }
        System.out.println(menor);
        }
    public static BestPrice BestPrice(){
        return new BestPrice();
    }
}
