package models;

import java.util.ArrayList;
import java.util.List;

public class Student {

	
	private String lastName;
	private String firstName;
	private int age;
	private List<Integer> grades;
	private Course course;
	
	/**
	 * full constructor
	 * @param lastName
	 * @param firstName
	 * @param age
	 * @param course
	 */
	public Student(String lastName, String firstName, int age, Course course) {
		super();
		this.setLastName(lastName);
		this.setFirstName(firstName);
		this.setAge(age);
		this.setCourse(course);
		this.grades = new ArrayList<Integer>();
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


	public List<Integer> getGrades() {
		return grades;
	}


	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "Student [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", grades=" + grades
				+ ", course=" + course + "]";
	}
	
	
}
