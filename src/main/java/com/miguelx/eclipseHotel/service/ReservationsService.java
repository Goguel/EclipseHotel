package com.miguelx.eclipseHotel.service;

import com.miguelx.eclipseHotel.model.Reservations;
import com.miguelx.eclipseHotel.repository.ReservationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationsService {

    @Autowired
    private ReservationsRepository reservationsRepository;

    public List<Reservations> listaTodos() {
        return (List<Reservations>) reservationsRepository.findAll();
    }

    public Reservations salvar(Reservations reservations) {
        return reservationsRepository.save(reservations);
    }

    public void deletar(Long id) {
        reservationsRepository.deleteById(id);
    }
}
