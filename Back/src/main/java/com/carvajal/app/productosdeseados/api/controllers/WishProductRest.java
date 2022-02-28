package com.carvajal.app.productosdeseados.api.controllers;

import com.carvajal.app.productosdeseados.api.models.WishProduct;
import com.carvajal.app.productosdeseados.api.services.WishProductService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wishproducts/")
public class WishProductRest
{
    @Autowired
    WishProductService wishProductService;

    @GetMapping("/get")
    private ResponseEntity<List<WishProduct>> getAllproducts()
    {
        return ResponseEntity.ok(wishProductService.getAll());
    }

    @GetMapping("/AllByClient")
    private ResponseEntity<List<WishProduct>> getAllProductsbyClient(@RequestParam String id)
    {
        return ResponseEntity.ok(wishProductService.findALlByClientIdentification(id));
    }

    @PostMapping("/save")
    @ApiOperation("save wish product")
    public ResponseEntity<WishProduct> save(@RequestBody WishProduct product)
    {
        WishProduct productSaved = wishProductService.save(product);
        return new ResponseEntity<>(productSaved, HttpStatus.OK);
    }
}
