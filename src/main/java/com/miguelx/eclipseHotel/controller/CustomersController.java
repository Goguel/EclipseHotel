package com.miguelx.eclipseHotel.controller;

import com.miguelx.eclipseHotel.dto.CustomersRequestDTO;
import com.miguelx.eclipseHotel.dto.CustomersResponseDTO;
import com.miguelx.eclipseHotel.model.Customers;
import com.miguelx.eclipseHotel.service.CustomersService;
import com.miguelx.eclipseHotel.dto.mapper.CustomersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomersController {

    @Autowired
    private CustomersService customersService;
    @Autowired
    private CustomersMapper customersMapper;

    @GetMapping
    public ResponseEntity<List<CustomersResponseDTO>> listaTodos() {
        List<Customers> customers = customersService.listaTodos();
        List<CustomersResponseDTO> customersResponseDTO = customersMapper.toDTOList(customers);
        return ResponseEntity.status(HttpStatus.OK).body(customersResponseDTO);
    }

    @GetMapping("/{id}")
    public Customers buscaPorId(@PathVariable(value = "id")Long id) {
        return customersService.buscarPorId(id);
    }

    @PostMapping
    public ResponseEntity<CustomersResponseDTO> salvar(@RequestBody CustomersRequestDTO customersRequestDTO) {
        Customers customers = customersMapper.toEntity(customersRequestDTO);
        Customers customersSalvo = customersService.salvar(customers);
        CustomersResponseDTO customersResponseDTO = customersMapper.toDTO(customersSalvo);
        return ResponseEntity.status(HttpStatus.CREATED).body(customersResponseDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> alterar(@PathVariable(value ="id")Long id,@RequestBody CustomersRequestDTO customersRequestDTO) {
        try{
            Customers customers = customersMapper.toEntity(customersRequestDTO);
            Customers customersSalvo = customersService.alterar(id, customers);
            CustomersResponseDTO customersResponseDTO = customersMapper.toDTO(customersSalvo);
            return ResponseEntity.status(HttpStatus.OK).body(customersResponseDTO);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletar(@PathVariable(value ="id")Long id){
        try{
            customersService.delete(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}