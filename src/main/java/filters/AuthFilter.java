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

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;


		String username =  request.getParameter("UID");
		String password =  request.getParameter("pw");
		
		if (username.equals("admin") && password.equals("admin")) {
			chain.doFilter(request, response);
			return;
		}
		else {
			req.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
		}
		
	}

}
