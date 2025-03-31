package com.miguelx.eclipseHotel.service;

import com.miguelx.eclipseHotel.model.Customers;
import com.miguelx.eclipseHotel.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomersService {

    @Autowired
    private CustomersRepository customersRepository;

    public List<Customers> listaTodos() {
        return (List<Customers>) customersRepository.findAll();
    }

    public Customers salvar(Customers customers) {
        return customersRepository.save(customers);
    }

    public Customers alterar( Long id, Customers data) {
        Customers customersSalvo = buscarPorId(id);
        customersSalvo.setEmail(data.getEmail());
        customersSalvo.setName(data.getName());
        customersSalvo.setPhone(data.getPhone());
        return customersRepository.save(customersSalvo);
    }

    public Customers buscarPorId(Long id) {
        return customersRepository.findById(id).get();
    }

    public void delete(Long id) {
        Customers customers = buscarPorId(id);
        customersRepository.delete(customers);
    }
}
