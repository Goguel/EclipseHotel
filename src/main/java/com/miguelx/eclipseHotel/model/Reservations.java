package com.miguelx.eclipseHotel.model;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity(name = "reservations")
@Table(name = "reservations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Reservations {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    @ManyToOne
    @JoinColumn(name = "customers_id")
    private Customers customers_id;
    @NonNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "rooms_id")
    private Rooms rooms_id;

    @JsonUnwrapped
    private Status status;

    private LocalDate checkin;
    private LocalDate checkout;

}
