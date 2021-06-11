package com.scg.inheritance;

interface College{
	
	void collegeName();
	void collegeLocation();
	
}

interface School{
	
	void schoolName();
	void schoolLocation();
	
}

class Institution implements College,School{
	
	public void collegeName() {
		System.out.println("College Name : MA College");
	}
	
	public void collegeLocation() {
		System.out.println("College Location : Kothamangalam");
	}
	
	public void schoolName() {
		System.out.println("School Name : Janatha HSS");
	}
	
	public void schoolLocation() {
		System.out.println("School Location : Pattambi");
	}
	
}

public class Interface {

	public static void main(String[] args) {
		
		College c=new Institution();
		c.collegeName();
		c.collegeLocation();
		
		School s=new Institution();
		s.schoolName();
		s.schoolLocation();

	}

}
