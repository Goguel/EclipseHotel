package com.miguelx.eclipseHotel.model;

import com.miguelx.eclipseHotel.dto.CustomersRequestDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "customers")
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Customers {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "customers_id")
    private List<Reservations> reservations;

    public Customers(CustomersRequestDTO data) {
        this.name = data.getName();
        this.email = data.getEmail();
        this.phone = data.getPhone();
    }
}
