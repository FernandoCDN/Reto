package com.carvajal.app.productosdeseados.api.models;

import lombok.*;

import javax.persistence.*;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Entity
@Table(name = "wish_products")
public class WishProduct
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private double price;

    private Integer stock;

    @ManyToOne
    private Client client;
}
