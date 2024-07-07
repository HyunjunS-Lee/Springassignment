package assignment.spring.repository;


import assignment.spring.model.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByReservationTimeBetween(LocalDateTime startTime, LocalDateTime endTime);
}