package com.miguelx.eclipseHotel.dto.mapper;

import com.miguelx.eclipseHotel.dto.CustomersRequestDTO;
import com.miguelx.eclipseHotel.dto.CustomersResponseDTO;
import com.miguelx.eclipseHotel.model.Customers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomersMapper {

    @Autowired
    private ModelMapper customersMapper;

    public Customers toEntity(CustomersRequestDTO dto) {
        return customersMapper.map(dto, Customers.class);
    }

    public CustomersResponseDTO toDTO(Customers entity) {
        return customersMapper.map(entity, CustomersResponseDTO.class);
    }

    public List<CustomersResponseDTO> toDTOList(List<Customers> customers) {
        return customers.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }
}
