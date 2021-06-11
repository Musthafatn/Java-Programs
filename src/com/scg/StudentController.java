package com.scg;

import com.scg.student.ConsoleReader;
import com.scg.student.StudentService;
import com.scg.student.StudentServiceImplement;
import com.scg.student.vo.Student;

public class StudentController {
	
	static StudentService studentService=new StudentServiceImplement();
	
	public static void insert() {
		
		try {
			
			System.out.println("Enter Id, Name, Age");
			int id=ConsoleReader.readInt();
			String name=ConsoleReader.readString();
			int age=ConsoleReader.readInt();
			Student student=new Student(id, name, age);
			studentService.insert(student);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid input\n");
		}
		
	}
	
	public static void delete() {
		
		try {
			
			System.out.println("Enter Id");
			int id=ConsoleReader.readInt();
			studentService.delete(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid input\n");
		}
		
	}
	
	public static void readByPage() {
		
		try {
			
			System.out.println("Enter page number");
			int pageNumber=ConsoleReader.readInt();
			studentService.readByPage(pageNumber);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid Input\n");
		}
	}
	
	public static void update() {
		
		try {
			
			System.out.println("Enter Id, Name, Age");
			int id=ConsoleReader.readInt();
			String name=ConsoleReader.readString();
			int age=ConsoleReader.readInt();
			Student student=new Student(id, name, age);
			studentService.update(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid input\n");
		}
		
	}
	
	public static void searchByName() {
		
		try {
			
			System.out.println("Enter name");
			String name=ConsoleReader.readString();
			studentService.searchByName(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Input\n");
		}
	}
	
	public static void readById() {
		
		try {
			
			System.out.println("Enter Id");
			int id=ConsoleReader.readInt();
			studentService.readById(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid Input\n");
		}
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		try {
			
			while(true) {
				System.out.println("1.Insert student");
				System.out.println("2.Delete student by id");
				System.out.println("3.Print all student information with pagination");
				System.out.println("4.Update student information");
				System.out.println("5.Search by name");
				System.out.println("6.Read by id");
				System.out.println("7.Exit");
				int option=ConsoleReader.readInt();
				switch (option) {
				case 1:
					StudentController.insert();
					break;
					
				case 2:
					StudentController.delete();
					break;
					
				case 3:
					StudentController.readByPage();
					break;
					
				case 4:
					StudentController.update();
					break;
					
				case 5:
					StudentController.searchByName();
					break;
					
				case 6:
					StudentController.readById();
					break;
					
				case 7:
					System.exit(0);

				default:
					System.out.println("Enter valid option\n");
					break;
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Enter valid option\n");
			StudentController.main(null);
		}
		
		

	}

}
