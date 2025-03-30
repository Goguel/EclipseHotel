package com.miguelx.eclipseHotel.dto;

import com.miguelx.eclipseHotel.model.Customers;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomersResponseDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;

    public CustomersResponseDTO(Customers customersId) {
    }
}
