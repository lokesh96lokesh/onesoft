package oops2;

import java.util.ArrayList;

public class UseStudentDetails {
	public static void main(String[] args) {
		StudentDetails s1=new StudentDetails("loki",26,654,"male");
		StudentDetails s2=new StudentDetails("dhina",26,655,"male");
		StudentDetails s3=new StudentDetails("suran",16,656,"male");
		StudentDetails s4=new StudentDetails("anu",23,657,"female");
		StudentDetails s5=new StudentDetails("uma",27,658,"female");
		StudentDetails s6=new StudentDetails("apu",26,659,"male");
		ArrayList<StudentDetails>StudList=new ArrayList<>();
		StudList.add(s1);
		StudList.add(s2);
		StudList.add(s3);
		StudList.add(s4);
		StudList.add(s5);
		StudList.add(s6);
		//StudList.remove(2);
		//StudList.set(1, s6);
		//System.out.println(StudList);
		
		//System.out.println(StudList);
		//System.out.println(StudList.get(1));
		//for(StudentDetails i:StudList) {
			//System.out.println(i);
		//for(int i=0;i<StudList.size();i++) {
			//System.out.println(StudList.get(i));
			
		//}
		ArrayList<StudentDetails>femaleList=new ArrayList<>();
		for(StudentDetails s:StudList) {
			if (s.getGender().equalsIgnoreCase("Female")) {
				femaleList.add(s);
			}
		}
		System.out.println(femaleList);
		
	}

}
