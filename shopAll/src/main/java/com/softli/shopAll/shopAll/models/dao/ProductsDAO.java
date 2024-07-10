package com.softli.shopAll.shopAll.models.dao;

import com.softli.shopAll.shopAll.models.entity.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsDAO extends CrudRepository<Products,Integer> {
}
