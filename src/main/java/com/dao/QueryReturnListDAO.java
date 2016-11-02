package com;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class QueryReturnListDAO extends JdbcDaoSupport {

	@Autowired
	public QueryReturnListDAO(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	public List<String> getResults(String sql) {

		// String sql = "Select d.dept_name from Department d ";

		// queryForList(String sql, Class<T> elementType)
		List<String> list = this.getJdbcTemplate().queryForList(sql, String.class);

		return list;
	}
}
