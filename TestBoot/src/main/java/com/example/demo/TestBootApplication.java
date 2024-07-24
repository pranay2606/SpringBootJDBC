package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.EmpController;
import com.example.demo.model.EmpModel;



@SpringBootApplication
public class TestBootApplication {

	public static void main(String[] args){
		ApplicationContext context =  SpringApplication.run(TestBootApplication.class, args);
		
		EmpController empC = context.getBean(EmpController.class);
		//empC.addDataController(new EmpModel(101,"java",10000));
		//empC.addDataController(new EmpModel(102,"spring",12000));
		//empC.addDataController(new EmpModel(103,"jdbc",30000));
		//empC.addDataController(new EmpModel(104,"web",23000));
		System.out.println(empC.getData());
		
		System.out.println(empC.getData());
		empC.getNo(103);
		//empC.updateNo(new EmpModel(104,"jpa",20000));
		try {
			empC.deleteNo(102);
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(empC.getData());
		
	}
}
