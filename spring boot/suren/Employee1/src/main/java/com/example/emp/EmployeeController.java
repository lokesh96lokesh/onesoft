package com.example.emp;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping(value="/add")
	public String addInfo(@RequestBody EmployeeEntity ee) {
	return es.addInfo(ee);
	}

@PutMapping(value="/update")
public String updateInfo(@RequestBody EmployeeEntity ee) {
	return es.updateInfo(ee);
}
@DeleteMapping(value="/delete/{id}")
public String deleteInfo(@PathVariable int id) {
	return es.deleteInfo(id);
}
@GetMapping(value="/show") 
public List<EmployeeEntity> setInfo() {
	return es.setInfo();
}
@GetMapping(value="/show1/{id}")
public EmployeeEntity showInfo(@PathVariable int id) {
	return es.showInfo(id);
}
@DeleteMapping(value="/delete1")
public String deleteInfo() {
	return es.deleteInfo();
}

@PostMapping(value="/bulk")
public String send(@RequestBody List<EmployeeEntity> e) {
	return es.send(e);
}
@GetMapping(value="/setSalary/{from}/{to}")
public List<EmployeeEntity> getsalaryrange(@PathVariable("from") int salary1,@PathVariable("to") int salary2) {
	return es.getsalaryrange(salary1,salary2);
}
@GetMapping(value="/find/{firstName}")
public List<EmployeeEntity> showname(@PathVariable String firstName) {
	return es.showname(firstName);
}

}



