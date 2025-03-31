package com.miguelx.eclipseHotel.repository;

import com.miguelx.eclipseHotel.model.Rooms;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomsRepository extends CrudRepository<Rooms, Long> {
}
