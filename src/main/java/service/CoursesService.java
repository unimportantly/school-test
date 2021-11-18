package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import models.Course;
import models.Student;

public class CoursesService {
    private static CoursesService instances = null;
    private List<Course> courses = new ArrayList<Course>();
    
    private CoursesService() {
 
            this.courses.add(new Course("Formation Java", "Java, Angular, JDBC, Spring ...", 10));
            this.courses.add(new Course("Formation Pompier", "Physique, résistance au feu, grimper aux échelles ...", 10));
        }


    public static CoursesService getInstance() {
        if (instances == null) {
            instances = new CoursesService();
        }
        return instances;
    }

    public List<Course> getCourses() {
        return this.courses;
    }

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
