package com.carvajal.app.productosdeseados.api.services;

import com.carvajal.app.productosdeseados.api.models.WishProduct;

import java.util.List;

public interface WishProductService
{
    List<WishProduct> getAll();

    List<WishProduct> findALlByClientIdentification(String id);

    WishProduct save(WishProduct product);
}
