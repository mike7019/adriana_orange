package com.co.proyecto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class EmployeePage {

    public static final Target BTN_PIM = Target.the("")
            .locatedBy("//a[@href='/web/index.php/pim/viewPimModule']");
    public static final Target BTN_ADD_EMPLOYEE = Target.the("")
            .locatedBy("//a[contains(text(),'Add Employee')]");
    public static final Target TXT_NAME = Target.the("")
            .locatedBy("//input[@name='firstName']");
    public static final Target TXT_MIDDLE_NAME = Target.the("")
            .locatedBy("//input[@name='middleName']");
    public static final Target TXT_LAST_NAME = Target.the("campo para apellido")
            .locatedBy("//input[@name='lastName']");
    public static final Target TXT_ID = Target.the("campo para el id")
            .locatedBy("(//input[@class='oxd-input oxd-input--active'])[2]");
    public static final Target RDN_LOGIN_DETAILS = Target.the("radiobutton para detalles login")
            .locatedBy("//div[@class='oxd-switch-wrapper']");
    public static final Target TXT_USERNAME = Target.the("campo usuario")
            .locatedBy("(//input[@class='oxd-input oxd-input--active'])[3]");
    public static final Target TXT_EMPLOYEE_PASS = Target.the("campo contraseña")
            .locatedBy("(//input[@type='password'])[1]");
    public static final Target TXT_CONF_PASS = Target.the("campo de confirmar contrasena")
            .locatedBy("(//input[@type='password'])[2]");
    public static final Target BTN_SAVE = Target.the("boton para guardar")
            .locatedBy("//button[@type='submit']");
    public static final Target TXT_USER_CREATED = Target.the("validacion ID")
            .locatedBy("(//div[@class='oxd-table-cell oxd-padding-cell'])[2]");

    public static final Target BTN_SEARCH = Target.the("")
            .locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    public static final Target BTN_EMPLOYEE_LIST = Target.the("boton lista empleado")
            .locatedBy("//a[contains(text(),'Employee List')]");
    public static final Target TXT_ID_SEARCH = Target.the("campo para id")
            .locatedBy("(//input[@class='oxd-input oxd-input--active'])[2]");
}
