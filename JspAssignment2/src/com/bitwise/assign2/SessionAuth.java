package com.bitwise.assign2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class SessionAuth
 */
//@WebFilter("/SessionAuth")
public class SessionAuth implements Filter {

    /**
     * Default constructor. 
     */
    public SessionAuth() {
        // TODO Auto-generated constructor stub
    }
    private ArrayList<String> urlList;

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		 PrintWriter out=response.getWriter();  
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String user = (String) req.getAttribute("user");
		String userName = null;
		String sessionID = null;
		
		Cookie[] cookies = ((HttpServletRequest) request).getCookies();
		if(cookies !=null){
		for(Cookie cookie : cookies){
			if(cookie.getName().equals("user")) userName = cookie.getValue();
			if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
			
		}
		}
		if( req.getRequestURI().equals("/JspAssignment2/Login") )
		{
			chain.doFilter(request, response);
    	}
			
		else if (req.getSession(false) == null)
    	{
    		out.println("<br><br><h3><font color= red>Login First !!!</font> </h3> " );
        	request.getRequestDispatcher("index.html").include(request, response);
    	}
		else
		{
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig config) throws ServletException {
		

}
}
