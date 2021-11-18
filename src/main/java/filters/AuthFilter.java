package filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;


@WebFilter(filterName = "AuthFilter", urlPatterns = {"/home"})
public class AuthFilter implements Filter{

	//TODO i don't get why it applies ON the home page as well and i'm out of time...
	/**
	 * filter to allow logged in users to the home page
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		//cast request to use a dispatch later
		HttpServletRequest req = (HttpServletRequest) request;

		//gets the input values from the form fields
		String username =  request.getParameter("UID");
		String password =  request.getParameter("pw");
		
		//check if user is authenticated
		if (username.equals("admin") && password.equals("admin")) {
			//let them through
			chain.doFilter(request, response);
			//useless
			return;
		}
		else {
			//redirects them to the login page
			req.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
		}
		
	}

}
