package com.dxhotelsfronted.qa.taks;

import com.dxhotelsfronted.qa.models.SearchHotelLocation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.EnterValue;


import static com.dxhotelsfronted.qa.userinterfaces.SearchHotel.ROOM;
import static com.dxhotelsfronted.qa.userinterfaces.SearchHotel.SELECT_ROOM;

public class SelectRoom implements Task {
    private SearchHotelLocation selectRoom;

    public SelectRoom(SearchHotelLocation selectRoom) {
        this.selectRoom = selectRoom;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SELECT_ROOM));
        actor.attemptsTo(Click.on(ROOM.of(selectRoom.getRoom())));


    }
    public static SelectRoom selectRoom (SearchHotelLocation selectRoom){
        return new SelectRoom(selectRoom);
    }
}
