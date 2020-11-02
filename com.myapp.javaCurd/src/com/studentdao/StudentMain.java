package com.studentdao;

public class StudentMain {
public static void main(String[] args) {
	StudentDao  s=new StudentDao();
	//Student st=new Student(6, "deepa");
	//Student st=new Student(1, "ravi");
	
	s.fetch();
	//s.saveRecord(st);
	//s.deleteRecord(st);
	//s.updateRecord(st);
}
}
