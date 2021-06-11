package com.scg.student;

import java.util.List;

import com.scg.student.vo.Student;

public interface StudentDAO {
	
	 void insert(Student s);
	 void delete(Student s);
	 List<Student> readByPage(int fromIndex, int toIndex);
	 void update(int index, Student student);
	 List<Student> searchbyName(String name);
	 Student readById(int id);

}
