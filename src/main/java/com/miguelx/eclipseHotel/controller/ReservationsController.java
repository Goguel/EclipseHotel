package com.miguelx.eclipseHotel.controller;

import com.miguelx.eclipseHotel.dto.ReservationsResponseDTO;
import com.miguelx.eclipseHotel.model.Reservations;
import com.miguelx.eclipseHotel.service.ReservationsService;
import com.miguelx.eclipseHotel.service.RoomsService;
import com.miguelx.eclipseHotel.dto.mapper.ReservationsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reservationsopen")
public class ReservationsController {

    @Autowired
    private ReservationsService reservationsService;
    @Autowired
    private ReservationsMapper reservationsMapper;
    @Autowired
    private RoomsService roomsService;

    @GetMapping
    public ResponseEntity<List<ReservationsResponseDTO>> listaTodos() {
        List<Reservations> reservations = reservationsService.listaTodos();
        List<ReservationsResponseDTO> reservationsResponseDTO = reservationsMapper.toDTOList(reservations);
        return ResponseEntity.status(HttpStatus.OK).body(reservationsResponseDTO);
    }

    @PostMapping
    public ResponseEntity<ReservationsResponseDTO> salvar(@RequestBody Reservations reservationsRequestDTO) {
        Reservations reservationsSalvo = reservationsService.salvar(reservationsRequestDTO);
        ReservationsResponseDTO reservationsResponseDTO = reservationsMapper.toDTO(reservationsSalvo);
        return ResponseEntity.status(HttpStatus.CREATED).body(reservationsResponseDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable(value = "id") Long id) {
        try{
            reservationsService.deletar(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}