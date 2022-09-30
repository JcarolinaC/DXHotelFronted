package com.dxhotelsfronted.qa.taks;

import com.dxhotelsfronted.qa.models.SearchHotelLocation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.dxhotelsfronted.qa.userinterfaces.SearchHotel.*;

public class SelectPeople implements Task {
    private SearchHotelLocation selectPeople;

    public SelectPeople(SearchHotelLocation selectPeople) {
        this.selectPeople = selectPeople;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SELECT_ADULT));
        actor.attemptsTo(Click.on(NUMBER_ADULT.of(selectPeople.getAdult())));
        actor.attemptsTo(Click.on(SELECT_KIDS));
        actor.attemptsTo(Click.on(NUMBER_KIDS.of(selectPeople.getChild())));


    }
    public static SelectPeople selectPeople (SearchHotelLocation selectPeople){
        return new SelectPeople(selectPeople);
    }
}
