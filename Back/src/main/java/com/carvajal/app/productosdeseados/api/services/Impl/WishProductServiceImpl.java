package com.carvajal.app.productosdeseados.api.services.Impl;

import com.carvajal.app.productosdeseados.api.models.WishProduct;
import com.carvajal.app.productosdeseados.api.repositories.WishProductRepository;
import com.carvajal.app.productosdeseados.api.services.WishProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishProductServiceImpl implements WishProductService
{
    @Autowired
    WishProductRepository wishProductRepository;

    @Override
    public List<WishProduct> getAll() {
        return (List<WishProduct>) wishProductRepository.findAll();
    }

    @Override
    public List<WishProduct> findALlByClientIdentification(String identification) {
        return wishProductRepository.findAllByClientIdentification(identification);
    }

    @Override
    public WishProduct save(WishProduct product) {
        return wishProductRepository.save(product);
    }
}
