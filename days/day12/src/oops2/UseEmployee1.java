package oops2;

import java.util.ArrayList;

public class UseEmployee1 {
	public static void main(String[] args) {
		Employee1 e1=new Employee1("loki",15000,4);
		Employee1 e2=new Employee1("dina",25000,2);
		ArrayList<Employee1>EMD=new ArrayList<>();
		EMD.add(e1);
		EMD.add(e2);
		//int max=0;
		//String maxName="";
		/*
		 * for(Employee1 i:EMD) { if(i.getSalary()>max) { max=i.getSalary();
		 * maxName=i.getName(); } } System.out.println(maxName);
		 */
		//EMD.forEach(x-> System.out.println(x.getName()));
		EMD.forEach(x-> {
			if(x.getName().startsWith("d")) {
				System.out.println(x);
			}
		});
	}

}
