package greeter;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "greeter",
                version = "0.1",
                description = "My API",
                contact = @Contact(name = "sheikhimtiaz", email = "imticorei54@gmail.com")
        )
)

public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
