package com.miguelx.eclipseHotel.dto;

import com.miguelx.eclipseHotel.model.Rooms;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class RoomsResponseDTO {
    private Long id;
    private Integer room_number;
    private String type;
    private Float price;

    public RoomsResponseDTO(Rooms roomsId) {
    }
}
