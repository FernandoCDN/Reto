package com.carvajal.app.productosdeseados.api.services.Impl;

import com.carvajal.app.productosdeseados.api.models.Client;
import com.carvajal.app.productosdeseados.api.models.WishProduct;
import com.carvajal.app.productosdeseados.api.repositories.ClientRepository;
import com.carvajal.app.productosdeseados.api.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService
{
    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }
}
