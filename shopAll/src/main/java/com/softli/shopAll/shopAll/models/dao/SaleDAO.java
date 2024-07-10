package com.softli.shopAll.shopAll.models.dao;

import com.softli.shopAll.shopAll.models.entity.Sales;
import org.springframework.data.repository.CrudRepository;

public interface SaleDAO extends CrudRepository<Sales,Integer> {
}
