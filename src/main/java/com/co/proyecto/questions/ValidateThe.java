package com.co.proyecto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateThe implements Question<Boolean> {

    protected Target element;

    public ValidateThe(Target element) {
        this.element = element;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String id = actor.recall("id");
        return element.resolveFor(actor).getText().contains(id);
    }

    public static Question<Boolean> id(Target element){
        return new ValidateThe(element);
    }
}
