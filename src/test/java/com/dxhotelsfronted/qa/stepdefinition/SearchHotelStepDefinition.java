package com.dxhotelsfronted.qa.stepdefinition;

import com.dxhotelsfronted.qa.models.SearchHotelLocation;
import com.dxhotelsfronted.qa.question.BestPrice;
import com.dxhotelsfronted.qa.taks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SearchHotelStepDefinition {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Carolina Ceballos");
    }

    @Given("^That user the DX Hotel page$")
    public void thatUserTheDXHotelPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());

    }
    @When("^the user select information$")
    public void theUserSelectInformation(List<SearchHotelLocation>data) {
    OnStage.theActorInTheSpotlight().attemptsTo(SearchHotel.searchLocation());
    OnStage.theActorInTheSpotlight().attemptsTo(SelectCountry.selectCountry(data.get(0)));
    OnStage.theActorInTheSpotlight().attemptsTo(SelectRoom.selectRoom(data.get(0)));
    OnStage.theActorInTheSpotlight().attemptsTo(SelectPeople.selectPeople(data.get(0)));
    OnStage.theActorInTheSpotlight().attemptsTo(CheckIn.check(data.get(0)));
    }

    @Then("^the value to pay is validated$")
    public void theValueToPayIsValidated() {
    OnStage.theActorInTheSpotlight().attemptsTo(BestPrice.BestPrice());
    }
}
