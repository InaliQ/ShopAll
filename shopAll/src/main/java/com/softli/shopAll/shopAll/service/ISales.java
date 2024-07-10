package com.softli.shopAll.shopAll.service;

import com.softli.shopAll.shopAll.models.entity.Sales;

public interface ISales {
    Sales save(Sales sales);
    Sales findById(Integer id);
}
