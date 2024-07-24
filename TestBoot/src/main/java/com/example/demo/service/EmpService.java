package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmpModel;
import com.example.demo.repo.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo repo;
	
	public void addData(EmpModel model) {
		repo.add(model);
	}
	
	public List<EmpModel> getAll(){
		return repo.getAll();
	}
	
	public void getNo(int empno) {
		repo.getByNo(empno);
	}
	public void updateNo(EmpModel model) {
		repo.updateByNo(model);
	}
	
	public void deleteNo(int empno) {
		repo.deletebyNo(empno);
	}
}
