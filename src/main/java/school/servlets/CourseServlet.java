package school.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Course;
import service.CoursesService;


/**
 * Servlet implementation class Formation
 */
@WebServlet("/course")
public class CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CoursesService coursesService = CoursesService.getInstance();
	Course course;

    /**
     * Default constructor. 
     */
    public CourseServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//logs the course object requested through the parameter name inside the empty course created above
		this.course = coursesService.getCourseByName(request.getParameter("name"));
		//send the object to the jsp to be displayed there
		request.setAttribute("course", course);
		//forward to the jsp
		request.getRequestDispatcher("/WEB-INF/course.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
