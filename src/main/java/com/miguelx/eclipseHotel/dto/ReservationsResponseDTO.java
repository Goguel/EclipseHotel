package com.miguelx.eclipseHotel.dto;

import com.miguelx.eclipseHotel.model.Status;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ReservationsResponseDTO {

    private Long id;
    private RoomsResponseDTO rooms;
    private CustomersResponseDTO customers;
    private Status status;
    private LocalDate checkin;
    private LocalDate checkout;

}