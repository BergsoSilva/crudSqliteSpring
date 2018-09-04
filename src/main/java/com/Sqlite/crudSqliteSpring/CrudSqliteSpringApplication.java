package com.Sqlite.crudSqliteSpring;

import com.Sqlite.crudSqliteSpring.model.LoginModel;
import com.Sqlite.crudSqliteSpring.service.IUserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CrudSqliteSpringApplication {

    public static void main(String[] args) {
        ApplicationContext ctx
                = SpringApplication.run(CrudSqliteSpringApplication.class, args);

        IUserService userService
                = ctx.getBean("userService", IUserService.class);
        LoginModel loginModel = new LoginModel();
        loginModel.setPassword("dbase123");
        loginModel.setUserName("bharat0126");
        System.out.println(userService.getUser(loginModel).toString());
    }
}
