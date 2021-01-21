package ru.lechif.HiChatDden.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class PostgreDBConfiguration {

    @Bean
    @Primary
    public DataSource postgreDataSoutce(){
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl("jdbc:postgresql://localhost:5432/HiChatDden");
        ds.setUsername("postgres");
        ds.setPassword("root");
        ds.setMaximumPoolSize(10);
        ds.setSchema("server");
        return ds;
    }
}
