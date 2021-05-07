package sheikhimtiaz.controller;

import io.micronaut.http.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller("/greeter")
public class GreeterController {

    @Get(uri="/message", produces="text/plain")
    public String index() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Request delivered on " + dtf.format(now));
        String message = "Hello! Good morning!\n";
        return message;
    }
}