package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.model.EmpModel;
import com.example.demo.service.EmpService;

@Controller
public class EmpController {
	
	
	@Autowired
	private EmpService service;
	
	public void addDataController(EmpModel model) {
		service.addData(model);
	}
	
	public List<EmpModel> getData() {
		return service.getAll();
	}
	
	public void getNo(int empno) {
		service.getNo(empno);
	}
	public void updateNo(EmpModel model) {
		service.updateNo(model);
	}
	public void deleteNo(int empno){
		service.deleteNo(empno);
	}
	
}
