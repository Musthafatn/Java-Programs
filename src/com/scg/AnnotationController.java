package com.scg;

import com.scg.annotation.Student;

// Java Annotation is a tag that represents the metadata 

  /*   Built-In Java Annotations used in Java code
        
    @Override
    @SuppressWarnings
    @Deprecated

    Built-In Java Annotations used in other annotations

    @Target
    @Retention
    @Inherited
    @Documented

  */

public class AnnotationController {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
			
			Student s=new Student();

			s.displayName();
			
			s.displayAge();

	}

}