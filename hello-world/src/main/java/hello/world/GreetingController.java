package hello.world;

import io.micronaut.http.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Controller("/greeting")
public class GreetingController {

    @Get(uri="/message", produces="text/plain")
    public String index() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        String message = "Hello! Good morning!\n";
        return message;
    }
}