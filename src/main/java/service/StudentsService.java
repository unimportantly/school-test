package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import models.Student;
import models.Course;

public class StudentsService {
	
	    private static StudentsService instances = null;
	    private List<Student> students = new ArrayList<Student>();
	    private CoursesService coursesService = CoursesService.getInstance();
    	
	    private StudentsService() {
	    	for (int i = 0; i < 20; i++) {
	    		String lastName = "Last-Name" + i; 
	    		String firstName = "First-Name" + i;
	    		int age = 20 + i;
	    		int grade = 0 + i;
	    		Course formation;
	    		if ( i % 2 == 0) {
	    			formation = coursesService.getCourses().get(0);
	    		}
	    		else {
	    			formation = coursesService.getCourses().get(1);
	    		}
	    		students.add(new Student(lastName, firstName, age, formation, grade));
	    	}
	    }

	    public static StudentsService getInstance() {
	        if (instances == null) {
	            instances = new StudentsService();
	        }

	        return instances;
	    }

	    public List<Student> getStudents() {
	        return this.students;
	    }

	    public Student getStudentByName(String lastName) {
	        Student response = null;
	        for (Student student : students) {
	            if (student.getLastName().equals(lastName)) {
	                response = student;
	                break;
	            }
	        }

	        return response;
	    }
	}


