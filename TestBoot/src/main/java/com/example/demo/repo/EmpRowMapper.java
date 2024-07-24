package com.example.demo.repo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EmpModel;


public class EmpRowMapper implements RowMapper<EmpModel> {
	
	
	@Override
	public EmpModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmpModel model = new EmpModel();
		//EmpModel model1 = new EmpModel(rs.getInt("empno"), rs.getString("ename"), rs.getInt("sal"));
		model.setEmpno(rs.getInt("empno"));
		model.setEname(rs.getString("ename"));
		model.setSal(rs.getInt("sal"));
		return model;
		
	}

}
