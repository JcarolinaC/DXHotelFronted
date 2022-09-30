package com.dxhotelsfronted.qa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class SearchHotel {
    public static final Target LOCATION = Target
            .the("Select location")
            .locatedBy("//div[@class='dx-first-row dx-first-col dx-last-col dx-field-item dx-col-0 dx-field-item-required dx-flex-layout dx-label-v-align']//div[@class='dx-texteditor-container']");

    public static final Target SELECT_COUNTRY = Target

            .the("Select Country")
            .locatedBy("//div[@class='dx-item dx-list-item']//div[.='{0}']");

    public static final Target CHECKOUT  = Target
            .the("select checkout date")
            .located(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/input"));

    public static final Target CHECK_IN= Target
            .the("select Chek In")
            .located(By.xpath("(//input[@class='dx-texteditor-input'])[2]"));

    public  static final Target SELECT_ROOM = Target
            .the("Select room")
            .locatedBy("(//input[@class='dx-texteditor-input'])[4]");

    public static final Target ROOM = Target
            .the("Select rooms number")
            .locatedBy("(//div[@class='dx-item-content dx-list-item-content'])[11]");

    public static final Target SELECT_ADULT = Target
            .the("Select number adults")
            .locatedBy("(//input[@class='dx-texteditor-input'])[5]");

    public static final Target NUMBER_ADULT = Target
            .the("Select number adults")
            .locatedBy("(//div[@class='dx-item-content dx-list-item-content'])[15]");

    public static final Target SELECT_KIDS = Target
            .the("Select number children")
            .locatedBy("(//input[@class='dx-texteditor-input'])[6]");

    public static final Target NUMBER_KIDS= Target
            .the("Select number children")
            .locatedBy("(//div[@class='dx-item-content dx-list-item-content'])[19]");

    public static final Target SEARCH_BUTTON= Target
            .the("Click boton search")
            .locatedBy("/html/body/div[1]/div/div/div[2]/div[1]/div/div[1]/div[1]/div/div[1]/div[3]/div/div");

    public static final Target COMPARE_PRICE = Target
            .the("Compare the price to hotel")
            .locatedBy("(//p[@class='rate-number'])");

    public static final Target SELECT_OPTION = Target
            .the("select the best option")
            .locatedBy("(//p[@class='count'])");
}

