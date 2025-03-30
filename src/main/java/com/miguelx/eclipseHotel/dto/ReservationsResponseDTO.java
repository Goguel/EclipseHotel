package com.miguelx.eclipseHotel.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ReservationsResponseDTO {

    private Long id;
    private RoomsResponseDTO rooms;
    private CustomersResponseDTO customers;
    private LocalDate checkin;
    private LocalDate checkout;

}