package com.dxhotelsfronted.qa.taks;

import com.dxhotelsfronted.qa.interactions.WaitInteraction;
import com.dxhotelsfronted.qa.models.SearchHotelLocation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.dxhotelsfronted.qa.userinterfaces.SearchHotel.LOCATION;


public class SearchHotel implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOCATION), WaitInteraction.waitFor(3));
    }
    public static SearchHotel searchLocation(){
        return Tasks.instrumented(SearchHotel.class);
    }
}
