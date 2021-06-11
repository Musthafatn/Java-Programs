package com.scg.student;

import java.util.List;

import com.scg.student.vo.Student;

public class StudentServiceImplement implements StudentService {
	
	private static StudentDAOImplement dao=new StudentDAOImplement();
	
	@Override
	public void insert(Student student){
		// TODO Auto-generated method stub
		try {
			StudentValidator.validate(student);
			for(Student studentCheck:dao.studentList) {
				if(studentCheck.getId()==student.getId()) {
					throw new InvalidInput("Id already exist");
				}
			}
			dao.insert(student);
			System.out.println("Inserted successfuly\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()+"\n");
		}

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		try {
			StudentValidator.validateId(id);
			for(Student s:dao.studentList) {
				if(s.getId()==id) {
					dao.delete(s);
					System.out.println("Deleted successfully\n");
					return;
				}
			}
			System.out.println("No data found\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()+"\n");
		}

	}

	@Override
	public void readByPage(int pageNumber) {
		// TODO Auto-generated method stub
		
		try {
			
			StudentValidator.validatePageNumber(pageNumber);
			
			final int pageSize=3;

			int fromIndex=pageSize*(pageNumber-1);
	        int toIndex=pageSize*pageNumber;
	        
	        if (toIndex>dao.studentList.size()) {
	            toIndex=dao.studentList.size();
	        }
	        
	        if(fromIndex>toIndex) {
	        	throw new InvalidInput("Invalid page number");
	        }
	        
	        List<Student> subList=dao.readByPage(fromIndex,toIndex);
	        
	        for(Student student:subList) {
	        	System.out.println(student.getId()+" "+student.getName()+" "+student.getAge());
	        }
	        System.out.println();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage()+"\n");
		}

	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		
		try {
			StudentValidator.validate(student);
			for(Student existingStudent:dao.studentList) {
				if(existingStudent.getId()==student.getId()) {
					int index=dao.studentList.indexOf(existingStudent);
					dao.update(index,student);
					System.out.println("Updated Successfully\n");
					return;
				}
			}
			System.out.println("Data not found\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()+"\n");
		}

	}

	@Override
	public void searchByName(String name) {
		// TODO Auto-generated method stub
		
		try {
			StudentValidator.validateName(name);
			List<Student> subList=dao.searchbyName(name);
			if(subList.isEmpty()) {
				System.out.println("No data found\n");
				return;
			}
			
			for(Student student:subList) {
				System.out.println(student.getId()+" "+student.getName()+" "+student.getAge());
			}
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()+"\n");
		}
	}

	@Override
	public void readById(int id) {
		// TODO Auto-generated method stub
		
		try {
			StudentValidator.validateId(id);
			Student student=dao.readById(id);
			if(student==null) {
				System.out.println("No data found\n");
				return;
			}
			System.out.println(student.getId()+" "+student.getName()+" "+student.getAge()+"\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()+"\n");
		}

	}

}
