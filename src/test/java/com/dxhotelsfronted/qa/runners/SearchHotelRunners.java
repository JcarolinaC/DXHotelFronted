package com.dxhotelsfronted.qa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "classpath:feature/SearchHotel.feature"
        , glue = "classpath:com/dxhotelsfronted/qa/stepdefinition"
        , snippets = SnippetType.CAMELCASE)

public class SearchHotelRunners {
}
