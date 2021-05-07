package demo.service;

import demo.entity.Guest;
import demo.repository.GuestRepository;

import java.util.List;

public class GuestService {
    private final GuestRepository guestRepository;

    public List<Guest> getAllInterns() {
        return guestRepository.findAll();
    }

    public Guest saveIntern(Guest intern) {
        return guestRepository.save(intern);
    }

    public Guest updateIntern(Guest guestRequest) {
        long internId = guestRequest.getId();
        Guest guest = getInternById(internId);
        guest.setName(guestRequest.getName());
        guest.setEmail(guestRequest.getEmail());
        guest.setCountry(guestRequest.getCountry());
        return guestRepository.save(guest);
    }

    public void deleteInternById(long id) {
        Guest intern = getInternById(id);
        guestRepository.delete(intern);
    }

    public Guest getInternById(long internId) {
        return guestRepository.findById(internId).orElseThrow(() -> new RuntimeException("No guest found for this id"));
    }
}
