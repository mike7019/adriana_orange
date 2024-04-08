package com.co.proyecto.stepdefinitions;

import com.co.proyecto.models.LoginData;
import com.co.proyecto.questions.Validate;
import com.co.proyecto.tasks.Login;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.co.proyecto.userinterfaces.LoginPage.TXT_VALIDACION;
import static com.co.proyecto.utils.GlobalData.*;
import static org.hamcrest.core.StringContains.containsString;

public class LoginStepDefinitions {

    @Given("That the user was on the website")
    public void thatTheUserWasOnTheWebsite() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }
    @When("attempts login with the following")
    public void attemptsLoginWithTheFollowing(DataTable table) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.onTheSite(LoginData.setData(table).get(0))
        );
    }
    @Then("^will see the (.*) on screen$")
    public void willSeeTheTextOnScreen(String title) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(Validate.title(TXT_VALIDACION), containsString(title))
        );
    }

}
