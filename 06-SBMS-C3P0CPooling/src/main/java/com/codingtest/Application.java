package com.codingtest;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public DataSource c3podataSource(@Autowired C3P0Properties c3P0Properties) throws PropertyVetoException {
		ComboPooledDataSource pooledDataSource = new ComboPooledDataSource();
		pooledDataSource.setDriverClass(c3P0Properties.getDriverClass());
		pooledDataSource.setUser(c3P0Properties.getUser());
		pooledDataSource.setPassword(c3P0Properties.getPassword());
		pooledDataSource.setJdbcUrl(c3P0Properties.getJdbcUrl());
		pooledDataSource.setMaxPoolSize(c3P0Properties.getMaxPoolSize());
		pooledDataSource.setMaxIdleTime(c3P0Properties.getMaxIdleTime());

		return pooledDataSource;
	}

	
}
