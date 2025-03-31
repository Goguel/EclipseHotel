package com.miguelx.eclipseHotel.dto.mapper;

import com.miguelx.eclipseHotel.dto.RoomsRequestDTO;
import com.miguelx.eclipseHotel.dto.RoomsResponseDTO;
import com.miguelx.eclipseHotel.model.Rooms;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RoomsMapper {

    @Autowired
    private ModelMapper mapper;

    public Rooms toEntity(RoomsRequestDTO dto) {
        return mapper.map(dto, Rooms.class);
    }

    public RoomsResponseDTO toDTO(Rooms entity) {
        return mapper.map(entity, RoomsResponseDTO.class);
    }

    public List<RoomsResponseDTO> toDTOList(List<Rooms> rooms) {
        return rooms.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }
}