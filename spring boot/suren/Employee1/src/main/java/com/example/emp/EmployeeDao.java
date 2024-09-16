package com.example.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;


@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepo er;
	public String addInfo(EmployeeEntity ee) {
		er.save(ee);
		return "Data has been saved";
	}
	public String updateInfo(EmployeeEntity ee) {
		er.save(ee).getId();
		return "Data has been updated";
	}
	public String deleteInfo(int id) {
		er.deleteById(id);
		return "Data has been deleted";
	}
	public  List<EmployeeEntity>setInfo() {
		return er.findAll();
	}
	public EmployeeEntity showInfo(int id) {
		return er.findById(id).get();
	}
	public String deleteInfo() {
		er.deleteAll();
		return "data deleted";
	}
	public String send(List<EmployeeEntity> e) {
		er.saveAll(e);
		return "bulk data posted successfully";
	}
	public List<EmployeeEntity> getsalaryrange(int salary1, int salary2) {
		
		return er.getsalaryrange(salary1,salary2);
	}
	public List<EmployeeEntity> showname(String firstName) {
		
		return er.showname(firstName);
	}
	

}
