package models;

import java.util.ArrayList;
import java.util.List;

public class Student {

	
	private String lastName;
	private String firstName;
	private int age;
	private int grade;
	private Course course;
	
	/**
	 * full constructor
	 * @param lastName
	 * @param firstName
	 * @param age
	 * @param course
	 */
	public Student(String lastName, String firstName, int age, Course course, int grade) {
		super();
		this.setLastName(lastName);
		this.setFirstName(firstName);
		this.setAge(age);
		this.setCourse(course);
		this.setGrade(grade);
	}

	//getters & setters
	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", grade=" + grade
				+ ", course=" + course + "]";
	}


	
	
}
