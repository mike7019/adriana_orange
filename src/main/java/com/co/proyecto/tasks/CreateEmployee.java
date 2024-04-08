package com.co.proyecto.tasks;

import com.co.proyecto.models.EmployeeData;
import com.github.javafaker.Faker;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.proyecto.userinterfaces.EmployeePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreateEmployee implements Task {

    protected EmployeeData employeeData;
    protected Faker faker = new Faker();

    public CreateEmployee(EmployeeData employeeData) {
        this.employeeData = employeeData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PIM),
                Click.on(BTN_ADD_EMPLOYEE),
                Enter.theValue(employeeData.getName()).into(TXT_NAME),
                Enter.theValue(employeeData.getMiddleName()).into(TXT_MIDDLE_NAME),
                Enter.theValue(employeeData.getLastname()).into(TXT_LAST_NAME),
                Enter.theValue(employeeData.getId()).into(TXT_ID),
                Click.on(RDN_LOGIN_DETAILS),
                Enter.theValue(faker.name().username()).into(TXT_USERNAME),
                Enter.theValue(employeeData.getPass()).into(TXT_EMPLOYEE_PASS),
                Enter.theValue(employeeData.getPass()).into(TXT_CONF_PASS),
                Click.on(BTN_SAVE)

        );
        actor.remember("id", employeeData.getId());
    }

    public static CreateEmployee onTheSite(EmployeeData employeeData) {
        return Instrumented.instanceOf(CreateEmployee.class).withProperties(employeeData);
    }
}
