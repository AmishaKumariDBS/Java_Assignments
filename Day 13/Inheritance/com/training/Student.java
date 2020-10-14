package com.training;

import java.util.ArrayList;
import java.util.Iterator;

public class Student extends Person{
	private int numCourses;
	private ArrayList<String> courses = new ArrayList<String>();
	private ArrayList<Integer> grades = new ArrayList<Integer>();
	
	public Student() {
		super();
		System.out.println("Default");
		numCourses=0;
	}

	public Student(String name, String address) {
		super(name, address);
		System.out.println("Para");
	}
	
	public int getNumCourses() {
		return numCourses;
	}

	public void setNumCourses(int numCourses) {
		this.numCourses = numCourses;
	}

	public ArrayList<String> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}

	public ArrayList<Integer> getGrades() {
		return grades;
	}

	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Student's [ name = " + getName()+", address = "+getAddress()+", numCourses =" + numCourses + ", courses =" + courses + ", grades =" + grades + "]";
	}

	public void addCourseGrade(String course,int grade) {
		courses.add(course);
		grades.add(grade);
		numCourses+=1;
	}
	
	public void printGrades() {
		Iterator<Integer> it=grades.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	
	public double getAverageGrade() {
		double total=0;
		Iterator<Integer> it=grades.iterator();
		while(it.hasNext())
			total+=it.next();
		total/=numCourses;
		return total;
	}
	
	
}
