package com.miguelx.eclipseHotel.model;

import com.miguelx.eclipseHotel.dto.RoomsRequestDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "rooms")
@Table(name = "rooms")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Rooms {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer room_number;
    private String type;
    private Float price;

    @OneToMany(mappedBy = "rooms_id")
    private List<Reservations> reservations;

    public Rooms(RoomsRequestDTO data) {
        this.room_number = data.getRoom_number();
        this.type = data.getType();
        this.price = data.getPrice();
    }

    public Rooms(Long roomsId) {
    }
}
