/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sqlite.crudSqliteSpring.service;

import com.Sqlite.crudSqliteSpring.model.LoginModel;
import com.Sqlite.crudSqliteSpring.model.UserLoginModel;

/**
 *
 * @author bergson.silva
 */
public interface IUserService {
    
    public UserLoginModel getUser(LoginModel loginModel);
    
}
