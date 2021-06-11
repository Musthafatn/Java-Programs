package com.scg.set;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import com.scg.list.Employee;

public class SetofObjects {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many entries?");
		int n=Integer.parseInt(br.readLine());
		Employee emp[]=new Employee[n];
		Set<Employee> employeeList=new HashSet<Employee>();
		
		for(int i=0;i<n;i++) {
			emp[i]=new Employee();
			System.out.println("Entry "+(i+1)+": Id, Name, Salary");
			emp[i].setId(Integer.parseInt(br.readLine()));
			emp[i].setName(br.readLine());
			emp[i].setSalary(Double.parseDouble(br.readLine()));
			employeeList.add(emp[i]);
		}
		
		for(Employee employee:employeeList) {
			System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getSalary());
		}

	}

}
