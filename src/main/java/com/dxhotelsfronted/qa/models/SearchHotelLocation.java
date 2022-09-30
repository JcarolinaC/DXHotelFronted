package com.dxhotelsfronted.qa.models;

public class SearchHotelLocation {

    private String location;
    private String checkin;
    private String checkout;
    private String room;
    private String adult;
    private String child;

    public SearchHotelLocation(String location, String checkin, String checkout, String room, String adult, String child) {
        this.location = location;
        this.checkin = checkin;
        this.checkout = checkout;
        this.room = room;
        this.adult = adult;
        this.child = child;
    }

    public String getLocation() {
        return location;
    }

    public String getCheckin() {
        return checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public String getRoom() {
        return room;
    }

    public String getAdult() {
        return adult;
    }

    public String getChild() {
        return child;
    }
}
