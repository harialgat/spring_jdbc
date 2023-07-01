package org.harish.spring.jdbc.withoutconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "org.harish")
public class Config {
    @Bean
    public DataSource getDriverManager(){
        DriverManagerDataSource driverManagerDataSource =  new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("123456");
        return driverManagerDataSource;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate =  new JdbcTemplate();
        jdbcTemplate.setDataSource(getDriverManager());
        return jdbcTemplate;
    }
}
