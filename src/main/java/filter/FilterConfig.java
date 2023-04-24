package filter;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Users;

@WebFilter("/*")
public class FilterConfig extends HttpFilter implements Filter {

	public FilterConfig() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// URLS : Những trang cho phép vào nhưng không cần login
		List<String> URLS = List.of("/api/login", "/api/erropage", "/api/index", "/api/signup", "/api/count", "/api/product", "/api/count", "/api/search", "/api/cart");

		HttpServletRequest httpReq = (HttpServletRequest) request;
		HttpServletResponse httpResp = (HttpServletResponse) response;

		boolean isStaticResource = httpReq.getRequestURI().startsWith("/JavaWeb/resource/");

		HttpSession session = httpReq.getSession();

		Object users = session.getAttribute("user-session");

		String path = httpReq.getServletPath();

		if (Objects.isNull(users) && !isStaticResource && !URLS.contains(path)) {
//			httpResp.sendRedirect("/JavaWeb/api/login");
			httpResp.sendRedirect("/JavaWeb/api/index");
		} else {	
			if (users != null && path.contains("/manager/")) {
				Users user = (Users) users;
				System.out.println(user.getRole());
				if (!user.getRole().equals("admin")) {
					httpResp.sendRedirect("/JavaWeb/api/erropage");
				} else {
					chain.doFilter(request, response);
				}
			} else {
				chain.doFilter(request, response);
			}
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}
}
