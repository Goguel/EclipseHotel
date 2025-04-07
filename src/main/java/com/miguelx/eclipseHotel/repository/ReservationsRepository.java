package com.miguelx.eclipseHotel.repository;

import com.miguelx.eclipseHotel.model.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationsRepository extends JpaRepository<Reservations, Long> {
}
