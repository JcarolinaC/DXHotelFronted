package com.dxhotelsfronted.qa.taks;

import com.dxhotelsfronted.qa.models.SearchHotelLocation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

import static com.dxhotelsfronted.qa.userinterfaces.SearchHotel.*;

public class CheckIn implements Task {

    private SearchHotelLocation check;

    public CheckIn(SearchHotelLocation check) {
        this.check = check;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(check.getCheckout()).into(CHECKOUT));
        actor.attemptsTo(Enter.theValue(check.getCheckout()).into(CHECK_IN));
        actor.attemptsTo(Click.on(SEARCH_BUTTON));


    }
    public static CheckIn check (SearchHotelLocation check){
        return new CheckIn(check);
    }
}
