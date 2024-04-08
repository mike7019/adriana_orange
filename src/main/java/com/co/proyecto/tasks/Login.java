package com.co.proyecto.tasks;

import com.co.proyecto.models.LoginData;
import lombok.extern.java.Log;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.proyecto.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

    protected LoginData loginData;

    public Login(LoginData loginData) {
        this.loginData = loginData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_USER, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(loginData.getUser()).into(TXT_USER),
                Enter.theValue(loginData.getPass()).into(TXT_PASS),
                Click.on(BTN_LOGIN)
        );
    }

    public static Login onTheSite(LoginData loginData){
        return Instrumented.instanceOf(Login.class).withProperties(loginData);
    }
}
