package demo.service;

import demo.entity.Guest;

import java.util.List;

public interface IGuestService {
    List<Guest> getAllGuests();

    Guest saveGuest(Guest guest);

    Guest updateGuest(Guest guest);

    void deleteGuestById(long id);

    Guest getGuestById(long id);
}
