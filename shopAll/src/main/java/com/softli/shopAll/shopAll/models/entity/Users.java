package com.softli.shopAll.shopAll.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class Users implements Serializable {

    @Id
    @Column(name = "idUsers")
    private Integer idUsers;
    @Column(name = "user")
    private String user;
    @Column(name = "password")
    private String password;
    @Column(name = "token")
    private String token;

}
