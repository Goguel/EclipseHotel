package com.miguelx.eclipseHotel.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RoomsRequestDTO {

    private Integer room_number;
    private String type;
    private Float price;

}