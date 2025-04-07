package com.miguelx.eclipseHotel.repository;

import com.miguelx.eclipseHotel.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {
}
