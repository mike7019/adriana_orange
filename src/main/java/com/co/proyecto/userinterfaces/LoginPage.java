package com.co.proyecto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_USER = Target.the("campo para usuario")
            .locatedBy("//input[@name='username']");
    public static final Target TXT_PASS = Target.the("campo para contra")
            .locatedBy("//input[@name='password']");
    public static final Target BTN_LOGIN = Target.the("boton de login")
            .locatedBy("//button[@type='submit']");

    public static final Target TXT_VALIDACION = Target.the("titulo del sitio a validar")
            .locatedBy("//h6");
}
