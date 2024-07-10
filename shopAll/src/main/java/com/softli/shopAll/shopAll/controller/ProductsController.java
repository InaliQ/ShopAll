package com.softli.shopAll.shopAll.controller;

import com.softli.shopAll.shopAll.models.entity.Products;
import com.softli.shopAll.shopAll.service.IProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ProductsController {
    @Autowired
    private IProducts productsService;

    @PostMapping("product")
    public Products create (@RequestBody Products products){
        return productsService.save(products);
    }
    @PutMapping("product")
    public Products update(@RequestBody Products products){
        return  productsService.save(products);
    }
    @DeleteMapping("product/{id}")
    public void delete(@PathVariable Integer id){
        Products productsDelete = productsService.findById(id);
        productsService.delete(productsDelete);
    }
    @GetMapping("product/{id}")
    public Products showById(@PathVariable Integer id){
        return  productsService.findById(id);
    }
    @GetMapping("/products")
    public List<Products> findAll() {
        return productsService.findAll();
    }

}
