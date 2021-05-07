package demo.controller;

import demo.entity.Guest;
import demo.service.GuestService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import lombok.AllArgsConstructor;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller("/guest")
@AllArgsConstructor
public class GuestController {
    private final GuestService guestService;

    @Get(uri="/message", produces="text/plain")
    public String index() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Request delivered on " + dtf.format(now));
        String message = "Hello! Good morning!\n";
        return message;
    }

    @Get
    public List<Guest> getAllGuests() {
        return guestService.getAllGuests();
    }

    @Get("/{id}")
    public Guest getGuestById(long id) {
        return guestService.getGuestById(id);
    }

    @Post
    public Guest getAllGuests(@Body @Valid Guest guest) {
        guest = guestService.saveGuest(guest);
        return guest;
    }

    @Put
    public Guest updateIntern(@Body @Valid Guest guest) {
        guest = guestService.updateGuest(guest);
        return guest;
    }

    @Delete("/{id}")
    public HttpResponse<String> deleteGuest(long id) {
        guestService.deleteGuestById(id);
        return HttpResponse.ok("deleted successfully");
    }
}