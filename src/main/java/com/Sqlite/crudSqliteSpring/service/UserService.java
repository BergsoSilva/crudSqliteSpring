/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sqlite.crudSqliteSpring.service;

import com.Sqlite.crudSqliteSpring.dao.UserLoginDao;
import com.Sqlite.crudSqliteSpring.entity.UserLogin;
import com.Sqlite.crudSqliteSpring.model.LoginModel;
import com.Sqlite.crudSqliteSpring.model.UserLoginModel;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author bergson.silva
 */
public class UserService  implements IUserService{
    
    @Autowired
    private UserLoginDao userLoginDao;
    
    @Override
    public UserLoginModel getUser(LoginModel loginModel) {
        UserLoginModel model=new UserLoginModel();
	    UserLogin user=userLoginDao.findUserLoginByUserNameAndPassword(loginModel.getUserName(), loginModel.getPassword());
	    if (user !=null) {
		model.setEmail(user.getEmail());
		model.setFirstName(user.getFirstname());
		model.setId(user.getId());
		model.setLastName(user.getLastname());
		model.setMobile(user.getPassword());
		model.setPassword(user.getPassword());
		model.setUserName(user.getUsername());
	    }
	    return model;
    }
    
}
