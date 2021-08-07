package com.zention.training.demos.myapp.data;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepositoryImpl implements MyRepository {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MyRepositoryImpl(DataSource dataSource, JdbcTemplate jdbcTemplate) {
		this.dataSource = dataSource;
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void doQuery() {
		System.out.println("Doing MyRepositoryImpl Query");
		jdbcTemplate.execute("select 1 from dual");
	}
	
}
