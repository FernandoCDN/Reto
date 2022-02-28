package com.carvajal.app.productosdeseados.api.services;

import com.carvajal.app.productosdeseados.api.models.Client;
import com.carvajal.app.productosdeseados.api.models.WishProduct;

import java.util.List;

public interface ClientService
{
    List<Client> getAll();

    Client save(Client client);
}
