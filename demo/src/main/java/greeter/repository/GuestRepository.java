package greeter.repository;


import greeter.entity.Guest;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
}