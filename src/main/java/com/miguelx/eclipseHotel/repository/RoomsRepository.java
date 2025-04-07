package com.miguelx.eclipseHotel.repository;

import com.miguelx.eclipseHotel.model.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomsRepository extends JpaRepository<Rooms, Long> {
}
