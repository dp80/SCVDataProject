package com;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScvMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		QueryReturnListDAO dao = context.getBean(QueryReturnListDAO.class);
		List<String> names = dao.getResults("select contact_email from contact");
		for (String row : names) {
			System.out.println(row);
		}
		// JdbcTemplate.queryForList methods, return List<Map<String,Object>>

	}

}
