package com.carvajal.app.productosdeseados.api.repositories;

import com.carvajal.app.productosdeseados.api.models.Client;
import com.carvajal.app.productosdeseados.api.models.WishProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long>
{

}
