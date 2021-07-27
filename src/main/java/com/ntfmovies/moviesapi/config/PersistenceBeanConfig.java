package com.ntfmovies.moviesapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;


import javax.sql.DataSource;



@Configuration
public class PersistenceBeanConfig {

	@Value("mysql.datasource.username")
	private String username;
	@Value("mysql.datasource.password")
	private String password;
	@Value("mysql.datasource.url")
	private String url;
	@Value("mysql.datasource.driver")
	private String driver;
	
	public DataSource  getDataSource() {
		
		DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName(driver);
		dataSourceBuilder.url(url);
		dataSourceBuilder.username(username);
		dataSourceBuilder.password(password);
		
		
		return dataSourceBuilder.build();
		
	}
	
}
