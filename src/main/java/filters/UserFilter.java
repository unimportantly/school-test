package filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebFilter(filterName = "userFilter", urlPatterns = {"/home" , "/courses", "/course", "/students", "/student"})
public class UserFilter implements Filter{

	/**
	 * filter to send unauthenticated users to the login page
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//cast request to be able to use a dispatcher later
		HttpServletRequest req = (HttpServletRequest) request;
		//open a session to track the user
		HttpSession session = req.getSession();
		if (session.getAttribute("username") == null) {
			//sends the unauthenticated user back to the login
			req.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
		} else {
			//lets the user through 
			chain.doFilter(request, response);
		}
	}

}
