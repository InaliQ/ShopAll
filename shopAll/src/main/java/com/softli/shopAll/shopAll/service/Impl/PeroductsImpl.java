package com.softli.shopAll.shopAll.service.Impl;

import com.softli.shopAll.shopAll.models.dao.ProductsDAO;
import com.softli.shopAll.shopAll.models.entity.Products;
import com.softli.shopAll.shopAll.service.IProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PeroductsImpl implements IProducts {
    @Autowired
    private ProductsDAO productsDAO;

    @Transactional
    @Override
    public Products save(Products products){
        return productsDAO.save(products);
    }
    @Transactional(readOnly = true)
    @Override
    public Products findById(Integer id) {
        return productsDAO.findById(id).orElse(null);
    }
    public List<Products> findAll() {
        return (List<Products>) productsDAO.findAll();
    }
    @Transactional
    @Override
    public void delete(Products products) {
        productsDAO.delete(products);
    }
}
