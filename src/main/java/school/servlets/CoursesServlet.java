package school.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Course;
import service.CoursesService;

/**
 * Servlet implementation class Formations
 */
@WebServlet("/courses")
public class CoursesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Course> courses = new ArrayList<Course>();
	CoursesService coursesService = CoursesService.getInstance();
	
    public CoursesServlet() {
    	//populates the empty list created above by grabbing the singleton-created list of courses
    	this.courses = coursesService.getCourses();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//send the courses list to the jsp, and forwards to it
		request.setAttribute("courses", courses);
		
		request.getRequestDispatcher("/WEB-INF/courses.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
