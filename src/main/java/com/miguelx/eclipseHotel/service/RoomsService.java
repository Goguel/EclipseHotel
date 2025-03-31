package com.miguelx.eclipseHotel.service;

import com.miguelx.eclipseHotel.model.Rooms;
import com.miguelx.eclipseHotel.repository.RoomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomsService {

    @Autowired
    private RoomsRepository roomsRepository;

    public List<Rooms> listaTodos() {
        return (List<Rooms>) roomsRepository.findAll();
    }

    public Rooms salvar(Rooms rooms) {
        return roomsRepository.save(rooms);
    }

    public Rooms alterar(Long id, Rooms data) {
        Rooms roomsSalvo = buscarPorId(id);
        roomsSalvo.setRoom_number(data.getRoom_number());
        roomsSalvo.setType(data.getType());
        roomsSalvo.setPrice(data.getPrice());
        return roomsRepository.save(roomsSalvo);
    }

    public Rooms buscarPorId(Long id) {
        return roomsRepository.findById(id).get();
    }

    public void deletar(Long id) {
        Rooms rooms = buscarPorId(id);
        roomsRepository.delete(rooms);
    }
}
