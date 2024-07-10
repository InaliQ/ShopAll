package com.softli.shopAll.shopAll.service;

import com.softli.shopAll.shopAll.models.entity.Users;

public interface IUsers {

    Users save(Users users);
    Users findById(Integer id);
    void delete(Users users);
}
