package Greeter;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
        info = @Info(
                title = "Greeter",
                version = "0.0",
                description = "My API",
                contact = @Contact( name = "Imtiaz Ahmed", email = "imticorei54@gmail.com")
        )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
