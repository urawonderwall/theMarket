package com.the.market.persistence;

import com.the.market.persistence.crud.ProductoCrudRepository;
import com.the.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
