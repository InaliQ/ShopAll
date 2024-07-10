package com.softli.shopAll.shopAll.service;

import com.softli.shopAll.shopAll.models.entity.Products;

import java.util.List;

public interface IProducts  {

    Products save(Products products);
    Products findById(Integer id);
    void delete (Products products);
    List<Products>findAll();
}
