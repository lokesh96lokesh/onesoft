 package com.example.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;
	public String addInfo(EmployeeEntity ee) {
		return ed.addInfo(ee);
	}
	public String updateInfo(EmployeeEntity ee) {
		return ed.updateInfo(ee);
	}
	public String deleteInfo(int id) {
		return ed.deleteInfo(id);
	}
	public List<EmployeeEntity>setInfo() {
		return ed.setInfo();
	}
	public EmployeeEntity showInfo(int id) {
		return ed.showInfo(id);
	}
	public String deleteInfo() {
		return ed.deleteInfo();
	}
	
	public String send(List<EmployeeEntity> e) {
		
		return ed.send(e);
	}
	public List<EmployeeEntity> getsalaryrange(int salary1, int salary2) {
		
		return ed.getsalaryrange(salary1,salary2);
	}
	public List<EmployeeEntity> showname(String firstName) {
		
		return ed.showname(firstName);
	}
	
	}


