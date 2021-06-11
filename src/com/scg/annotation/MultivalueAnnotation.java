package com.scg.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*   @Retention annotation is used to specify to what level annotation will be available.

     RetentionPolicy.SOURCE	== refers to the source code, discarded during compilation. It will not be available in the compiled class.
  
     RetentionPolicy.CLASS 	==  refers to the .class file, available to java compiler but not to JVM . It is included in the class file.

     RetentionPolicy.RUNTIME	==  refers to the runtime, available to java compiler and JVM . 
     
     @Target tag is used to specify at which type, the annotation is used.
*/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface MultivalueAnnotation{
	
    int getValue() default 2;

    String getMessage() default "hello";
    
    double getDoubleValue() default 5.5;
}
