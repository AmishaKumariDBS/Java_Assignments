package com.training.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.Student;
import com.training.Teacher;

public class MyMainClass {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student student=(Student)factory.getBean("studentbean");  
		System.out.println(student); 
		student.addCourseGrade("MariaDB", 80);
		student.printGrades();
		System.out.println("Avg: "+student.getAverageGrade());
		
		Teacher teacher=(Teacher)factory.getBean("teacherbean");  
		System.out.println(teacher); 
		teacher.addCourse("Angular");
		teacher.removeCourse("Spring");
		System.out.println(teacher);
	}

}
