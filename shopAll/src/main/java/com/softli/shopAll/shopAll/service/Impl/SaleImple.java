package com.softli.shopAll.shopAll.service.Impl;

import com.softli.shopAll.shopAll.models.dao.SaleDAO;
import com.softli.shopAll.shopAll.models.entity.Sales;
import com.softli.shopAll.shopAll.service.ISales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class SaleImple implements ISales {
    @Autowired
    private SaleDAO saleDAO;
    @Transactional
    @Override
    public Sales save(Sales sales) {
        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public Sales findById(Integer id) {
        return null;
    }
}
