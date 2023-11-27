package mx.com.molina.software.definitions;

import mx.com.molina.software.steps.registrosSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class registroDefiniciones {

    @Steps
    private registrosSteps registrosSteps;

    @Dado("el usuario navega a la pagina")
    public void elUsuarioNavegaALaPagina () {
        registrosSteps.openRegistroPage();
    }

    @Cuando("ingresa sus datos en el registro")
    public void ingresaSusDatosEnElRegistro() {

    }

    @Entonces("se registra correctamente")
    public void seRegistraCorrectamente() {
    }
}
