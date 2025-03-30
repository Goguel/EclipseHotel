package com.miguelx.eclipseHotel.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ReservationsRequestDTO {

    private Long customers_id;
    private Long rooms_id;
    private LocalDate checkin;
    private LocalDate checkout;
}
