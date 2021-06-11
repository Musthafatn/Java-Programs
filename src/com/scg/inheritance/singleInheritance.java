package com.scg.inheritance;

class Student{
	
	int rollNo;
	String name;
	
	void setInfo(int rno, String name) {
		this.rollNo=rno;
		this.name=name;
		
	}
	
	void getInfo() {
		System.out.println("Roll No: "+this.rollNo);
		System.out.println("Name: "+this.name);
	}
	
}

class Boys extends Student{
	
	String gender="Male";
	
}

public class singleInheritance {

	public static void main(String[] args) {
		
		Boys b=new Boys();
		b.setInfo(10, "Ajay");
		b.getInfo();
		System.out.println("Gender: "+b.gender);

	}

}
