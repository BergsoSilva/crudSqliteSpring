/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sqlite.crudSqliteSpring.config;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author bergson.silva
 */
public class DBConfig {
    
    @Bean
    public DataSource dataSource(){
        DataSourceBuilder datasourceBuilder= DataSourceBuilder.create();
        datasourceBuilder.driverClassName("org.sqlite.JDBC");
        datasourceBuilder.url("jdbc:sqlite:mydb.db");
        
        return datasourceBuilder.build();
        
    }
    
}
