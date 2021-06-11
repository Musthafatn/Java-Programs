package com.scg.map;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.scg.list.Employee;

public class MapOfObjects {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Map<Department,List<Employee>> empmap=new HashMap<>();
		
		System.out.println("How many entries?");
		int n=Integer.parseInt(br.readLine());
		Department dept[]=new Department[n];
		@SuppressWarnings("unchecked")
		List<Employee>[] emplist=new ArrayList[n];
		
		for(int i=0;i<n;i++) {
			dept[i]=new Department();
			System.out.println("Entry "+(i+1)+": Department Id, Name");
			dept[i].setId(Integer.parseInt(br.readLine()));
			dept[i].setName(br.readLine());
			System.out.println("Number Of Employees");
			int empcount=Integer.parseInt(br.readLine());
			Employee emp[]=new Employee[empcount];
			emplist[i]=new ArrayList<Employee>();
			for(int j=0;j<empcount;j++) {
				
				emp[j]=new Employee();
				System.out.println("Employee "+(j+1)+": Id, Name, Salary");
				emp[j].setId(Integer.parseInt(br.readLine()));
				emp[j].setName(br.readLine());
				emp[j].setSalary(Double.parseDouble(br.readLine()));
				emplist[i].add(emp[j]);
				
			}
			
			empmap.put(dept[i], emplist[i]);
			
		}
		
		for(Department d:empmap.keySet()) {
			List<Employee> l=empmap.get(d);
			System.out.println("\nDepartment "+d.getName());
			for(Employee e:l) {
				System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
			}
			
		}

	}

}
