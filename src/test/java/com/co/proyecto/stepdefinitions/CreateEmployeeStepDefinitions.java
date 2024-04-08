package com.co.proyecto.stepdefinitions;

import com.co.proyecto.models.EmployeeData;
import com.co.proyecto.questions.ValidateThe;
import com.co.proyecto.tasks.CreateEmployee;
import com.co.proyecto.tasks.VerifyTheUser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.co.proyecto.userinterfaces.EmployeePage.*;
import static com.co.proyecto.utils.GlobalData.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CreateEmployeeStepDefinitions {

    @When("the user attempts to register a new employee on the option PIM")
    public void theUserAttemptsToRegisterANewEmployeeOnTheOptionPIM(DataTable dataTable) {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                CreateEmployee.onTheSite(EmployeeData.setData(dataTable).get(0)),
                VerifyTheUser.created()
        );
    }
    @Then("he will see the employee created on the website")
    public void heWillSeeTheEmployeeCreatedOnTheWebsite() {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateThe.id(TXT_USER_CREATED)));
    }
}
