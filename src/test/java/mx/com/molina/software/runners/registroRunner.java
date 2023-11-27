package mx.com.molina.software.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/SignUp/registro.feature",
        glue = "mx.com.molina.software.definitions", //POM
        //     glue = "mx.com.molina.software.stepDefinitions", //ScreenPlay
        snippets = CucumberOptions.SnippetType.CAMELCASE, //navegarPaginaWeb
        plugin = "pretty",
        tags = "@RegistroDeUsuario"
)


public class registroRunner {
}
