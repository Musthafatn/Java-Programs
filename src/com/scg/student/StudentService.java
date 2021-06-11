package com.scg.student;

import com.scg.student.vo.Student;

public interface StudentService {
	
	 void insert(Student student) throws Exception;
	 void delete(int id) throws Exception;
	 void readByPage(int pageNumber) throws Exception;
	 void update(Student student) throws Exception;
	 void searchByName(String name) throws Exception;
	 void readById(int id) throws Exception;

}
