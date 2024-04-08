package com.co.proyecto.tasks;

import com.co.proyecto.models.EmployeeData;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.proyecto.userinterfaces.EmployeePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerifyTheUser implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        String id = actor.recall("id");
        actor.attemptsTo(
                WaitUntil.the(BTN_EMPLOYEE_LIST, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_EMPLOYEE_LIST),
                Enter.theValue(id).into(TXT_ID_SEARCH),
                Click.on(BTN_SEARCH)

        );
    }

    public static VerifyTheUser created(){
        return Instrumented.instanceOf(VerifyTheUser.class).withProperties();
    }
}
