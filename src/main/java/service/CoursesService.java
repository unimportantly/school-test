package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import models.Course;
import models.Student;

public class CoursesService {
    private static CoursesService instances = null;
    private List<Course> courses = new ArrayList<Course>();
    
    /**
     * private constructor for singleton, creates 2 different courses
     */
    private CoursesService() {
            this.courses.add(new Course("Formation Java", "Java, Angular, JDBC, Spring ...", 10));
            this.courses.add(new Course("Formation Pompier", "Physique, résistance au feu, grimper aux échelles ...", 10));
        }

    /**
     * singleton calling method
     * @return
     */
    public static CoursesService getInstance() {
        if (instances == null) {
            instances = new CoursesService();
        }
        return instances;
    }

    /**
     * method to get the list of course objects created in the singleton
     * @return list of courses
     */
    public List<Course> getCourses() {
        return this.courses;
    }

    /**
     * method to find a single course from its name
     * @param name of the course
     * @return the course object
     */
    public Course getCourseByName(String name) {
        Course response = null;
        //iterator? what's the difference here?
        /*
         * Iterator it = this.courses.Iterator();
         * while (it.hasNext()) {
         * Course course = (Course)it.next();
         */
        for (Course course : courses) {
            if (course.getName().equals(name)) {
                response = course;
                break;
            }
        }

        return response;
    }
}
