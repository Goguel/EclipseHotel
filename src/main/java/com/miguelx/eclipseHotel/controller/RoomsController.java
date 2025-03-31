package com.miguelx.eclipseHotel.controller;

import com.miguelx.eclipseHotel.dto.RoomsRequestDTO;
import com.miguelx.eclipseHotel.dto.RoomsResponseDTO;
import com.miguelx.eclipseHotel.model.Rooms;
import com.miguelx.eclipseHotel.service.RoomsService;
import com.miguelx.eclipseHotel.dto.mapper.RoomsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rooms")
public class RoomsController {

    @Autowired
    private RoomsService roomsService;
    @Autowired
    private RoomsMapper roomsMapper;

    @GetMapping
    public ResponseEntity<List<RoomsResponseDTO>> listaTodos() {
        List<Rooms> rooms = roomsService.listaTodos();
        List<RoomsResponseDTO> roomsResponseDTO = roomsMapper.toDTOList(rooms);
        return ResponseEntity.status(HttpStatus.OK).body(roomsResponseDTO);
    }

    @GetMapping("/{id}")
    public Rooms buscaPorId(@PathVariable(value = "id")Long id) {
        return roomsService.buscarPorId(id);
    }

    @PostMapping
    public ResponseEntity<RoomsResponseDTO> salvar(@RequestBody RoomsRequestDTO roomsRequestDTO) {
        Rooms rooms = roomsMapper.toEntity(roomsRequestDTO);
        Rooms roomsSalvo = roomsService.salvar(rooms);
        RoomsResponseDTO roomsResponseDTO = roomsMapper.toDTO(roomsSalvo);
        return ResponseEntity.status(HttpStatus.CREATED).body(roomsResponseDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> alterar(@PathVariable(value = "id")Long id,@RequestBody RoomsRequestDTO roomsRequestDTO) {
        try {
            Rooms rooms = roomsMapper.toEntity(roomsRequestDTO);
            Rooms roomsSalvo = roomsService.alterar(id, rooms);
            RoomsResponseDTO roomsResponseDTO = roomsMapper.toDTO(roomsSalvo);
            return ResponseEntity.status(HttpStatus.OK).body(roomsResponseDTO);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletar(@PathVariable(value = "id")Long id){
        try{
            roomsService.deletar(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}