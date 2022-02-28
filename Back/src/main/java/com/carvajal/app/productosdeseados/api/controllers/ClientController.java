package com.carvajal.app.productosdeseados.api.controllers;

import com.carvajal.app.productosdeseados.api.models.Client;
import com.carvajal.app.productosdeseados.api.models.WishProduct;
import com.carvajal.app.productosdeseados.api.services.ClientService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients/")
public class ClientController
{
    @Autowired
    ClientService clientService;

    @GetMapping("/getAll")
    private ResponseEntity<List<Client>> getAllClients()
    {
        return ResponseEntity.ok(clientService.getAll());
    }

    @PostMapping("/save")
    @ApiOperation("save a Client")
    public ResponseEntity<Client> save(@RequestBody Client client)
    {
        Client clientSaved = clientService.save(client);
        return new ResponseEntity<>(clientSaved, HttpStatus.OK);
    }
}
