package com.scg.list;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfObjects {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many entries?");
		int n=Integer.parseInt(br.readLine());
		Employee emp[]=new Employee[n];
		List<Employee> employeeList=new ArrayList<Employee>();
		
		for(int i=0;i<n;i++) {
			emp[i]=new Employee();
			System.out.println("Entry "+(i+1)+": Id, Name, Salary");
			emp[i].setId(Integer.parseInt(br.readLine()));
			emp[i].setName(br.readLine());
			emp[i].setSalary(Double.parseDouble(br.readLine()));
			employeeList.add(emp[i]);
		}
		
		Collections.sort(employeeList,(o1,o2)-> o1.getSalary().compareTo(o2.getSalary()));
//		Collections.sort(employeeList,(o1,o2)-> o2.getSalary().compareTo(o1.getSalary()));  //Reverse Order
		
		for(Employee employee:employeeList) {
			System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getSalary());
		}

	}

}
