package com.softli.shopAll.shopAll.service.Impl;

import com.softli.shopAll.shopAll.models.dao.UsersDAO;
import com.softli.shopAll.shopAll.models.entity.Users;
import com.softli.shopAll.shopAll.service.IUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsersImple implements IUsers {
    @Autowired
    private UsersDAO usersDAO;
    @Transactional
    @Override
    public Users save(Users users) {
        return null;
    }
    @Transactional(readOnly = true)
    @Override
    public Users findById(Integer id) {
        return null;
    }
    @Transactional
    @Override
    public void delete(Users users) {

    }
}
