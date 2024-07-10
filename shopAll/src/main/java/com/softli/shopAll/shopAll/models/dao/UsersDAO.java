package com.softli.shopAll.shopAll.models.dao;

import com.softli.shopAll.shopAll.models.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersDAO extends CrudRepository<Users,Integer> {
}
