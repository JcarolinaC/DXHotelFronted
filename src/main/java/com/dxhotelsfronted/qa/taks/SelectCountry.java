package com.dxhotelsfronted.qa.taks;


import com.dxhotelsfronted.qa.models.SearchHotelLocation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Click;

import static com.dxhotelsfronted.qa.userinterfaces.SearchHotel.SELECT_COUNTRY;

public class SelectCountry implements Task {

    private SearchHotelLocation searchHotel;

    public SelectCountry(SearchHotelLocation searchHotel) {
        this.searchHotel = searchHotel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SELECT_COUNTRY.of(searchHotel.getLocation())));
    }
    public static SelectCountry selectCountry (SearchHotelLocation searchHotel){
        return new SelectCountry(searchHotel);
    }
}

