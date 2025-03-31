package com.miguelx.eclipseHotel.repository;

import com.miguelx.eclipseHotel.model.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends CrudRepository<Customers, Long> {
}
