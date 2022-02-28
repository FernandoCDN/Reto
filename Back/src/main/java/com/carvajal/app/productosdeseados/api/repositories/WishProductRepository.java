package com.carvajal.app.productosdeseados.api.repositories;

import com.carvajal.app.productosdeseados.api.models.WishProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WishProductRepository extends JpaRepository<WishProduct,Long>
{

    List<WishProduct> findAllByClientIdentification(String identification);
}
