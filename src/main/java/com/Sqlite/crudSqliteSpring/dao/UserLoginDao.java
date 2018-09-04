/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sqlite.crudSqliteSpring.dao;

import com.Sqlite.crudSqliteSpring.entity.UserLogin;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author bergson.silva
 */
public interface UserLoginDao extends CrudRepository<UserLogin, Long> {

    UserLogin findUserLoginByUserNameAndPassword(String username, String password);

}
