package com.bolsaideas.springboot.backend.apirest.services;

import com.bolsaideas.springboot.backend.apirest.entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {

    public List<Cliente> findAll();

    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void delete(Long id);

}
