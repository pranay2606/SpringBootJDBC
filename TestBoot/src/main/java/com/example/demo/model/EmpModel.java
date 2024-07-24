package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


public class EmpModel {
	private int empno;
	private String ename;
	private int sal;
	
	public EmpModel() {
		super();
	}
	public EmpModel(int empno, String ename, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEmpno() {
		return empno;
	}
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmpModel [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	
}
