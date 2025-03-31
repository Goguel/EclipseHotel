package com.miguelx.eclipseHotel.dto.mapper;

import com.miguelx.eclipseHotel.dto.ReservationsRequestDTO;
import com.miguelx.eclipseHotel.dto.ReservationsResponseDTO;
import com.miguelx.eclipseHotel.model.Reservations;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReservationsMapper {

    @Autowired
    public ModelMapper reservationsMapper;

    public Reservations toEntity(ReservationsRequestDTO dto) {
        return  reservationsMapper.map(dto, Reservations.class);
    }

    public ReservationsResponseDTO toDTO(Reservations entity) {
        return reservationsMapper.map(entity, ReservationsResponseDTO.class);
    }

    public List<ReservationsResponseDTO> toDTOList(List<Reservations> reservations) {
        return reservations.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }
}
