package com.scg.student;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.scg.student.vo.Student;

public class StudentDAOImplement implements StudentDAO {
	
	List<Student> studentList=new ArrayList<>();
	
	@Override
	public void insert(Student s) {
		studentList.add(s);
	}
	
	@Override
	public void delete(Student s) {
		studentList.remove(s);
	}
	
	@Override
	public List<Student> readByPage(int fromIndex, int toIndex) {
	
		return studentList.subList(fromIndex, toIndex);
	}
	
	@Override
	public void update( int index, Student student) {
		
		studentList.remove(index);
		studentList.add(index, student);
		
	}
	
	@Override
	public List<Student> searchbyName(String name) {
List<Student> subList=new ArrayList<>();
		
		Pattern pattern = Pattern.compile(name);
		Matcher matcher;
		
		for(Student student:studentList) {
			matcher = pattern.matcher(student.getName());
			if(matcher.find()) {
				subList.add(student);
			}
		}
		return subList;
	}
	
    @Override
	public Student readById(int id) {
    	
    	for(Student student:studentList) {
			if(student.getId()==id) {
				return student;
			}
		}
		return null;
		
	}

}
