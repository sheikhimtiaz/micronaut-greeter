package greeter.service;

import greeter.entity.Guest;
import greeter.repository.GuestRepository;
import lombok.AllArgsConstructor;

import javax.inject.Singleton;
import javax.transaction.Transactional;
import java.util.List;

@Singleton
@AllArgsConstructor
public class GuestService implements IGuestService {
    private final GuestRepository guestRepository;

    @Override
    @Transactional
    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    @Override
    @Transactional
    public Guest saveGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    @Override
    @Transactional
    public Guest updateGuest(Guest guestRequest) {
        long GuestId = guestRequest.getId();
        Guest guest = getGuestById(GuestId);
        guest.setName(guestRequest.getName());
        guest.setEmail(guestRequest.getEmail());
        guest.setCountry(guestRequest.getCountry());
        return guestRepository.save(guest);
    }

    @Override
    @Transactional
    public void deleteGuestById(long id) {
        Guest guest = getGuestById(id);
        guestRepository.delete(guest);
    }

    @Override
    public Guest getGuestById(long guestId) {
        return guestRepository.findById(guestId).orElseThrow(() -> new RuntimeException("Guest not found!"));
    }
}
