package com.example.emp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {
	
	@Query(value="select*from employee_entity where salary>? and salary<?",nativeQuery=true)

	List<EmployeeEntity> getsalaryrange(int salary1, int salary2);

	 @Query(value="select * from employee_entity where first_Name like :firstName",nativeQuery = true)
	 
	 List<EmployeeEntity> showname(String firstName);

}
