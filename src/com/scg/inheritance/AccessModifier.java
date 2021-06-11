package com.scg.inheritance;

/*					within class	within package	outside package		outside package
 * 													by subclass only
 * 
 * 
 * 		private			Y				 N				 N					N
 * 
 * 		default			Y				 Y				 N					N
 * 
 * 		protected		Y				 Y				 Y					N
 * 
 * 		public			Y				 Y				 Y					Y
 */

class Employee{
	
	int eid=10;
	public String name="Ajay";
	protected String userName="ajay.edu";
	private int salary=20000;
	
	void printsalary() {
		System.out.println(this.salary);
	}
	
}

public class AccessModifier {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		System.out.println(e.eid);
		System.out.println(e.name);
		System.out.println(e.userName);
//		System.out.println(e.salary);
		e.printsalary();

	}

}
