package com.co.proyecto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Validate implements Question<String> {

    protected Target element;

    public Validate(Target element) {
        this.element = element;
    }

    @Override
    public String answeredBy(Actor actor) {
        return element.resolveFor(actor).getText();
    }

    public static Question<String> title(Target element){
        return new Validate(element);
    }
}
