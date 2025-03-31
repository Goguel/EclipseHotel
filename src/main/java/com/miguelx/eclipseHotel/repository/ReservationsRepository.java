package com.miguelx.eclipseHotel.repository;

import com.miguelx.eclipseHotel.model.Reservations;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationsRepository extends CrudRepository<Reservations, Long> {
}
