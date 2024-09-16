package day13Condition3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		
	ArrayList<Employee>emp=new ArrayList<>();
	
	emp.add(new Employee("loki",25000,true));
	emp.add(new Employee("dina",65000,true));
	emp.add(new Employee("sura",85000,true));
	emp.add(new Employee("amu",45000,false));
	emp.add(new Employee("anu",23000,false));
	emp.add(new Employee("mini",35000,false));
	emp.add(new Employee("sanjay",25000,true));
	emp.add(new Employee("divya",15000,false));
	
	List<Boolean>femileList=emp.stream().filter(x->x.getSalary()>15000&& x.getName().startsWith("a")).map(y->y.getIsMale()).collect(Collectors.toList());
	femileList.forEach(y->System.out.println(y));
	
	//List<Employee>femileList=emp.stream().filter(x->x.getIsMale()==false).collect(Collectors.toList());
	//femileList.forEach(x->System.out.println(x));
	
	//System.out.println(femileList);
	
	Long a=emp.stream().filter(x->x.getIsMale()==false).count();
	System.out.println(a);
	}
}
