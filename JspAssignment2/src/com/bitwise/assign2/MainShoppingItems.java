package com.bitwise.assign2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MainShoppingItems
 */
//@WebServlet("/MainShoppingItems")
public class MainShoppingItems extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Map<Integer, String> map=new HashMap<Integer, String>();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainShoppingItems() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession(false);
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
	
		if(session!=null)
		{
			if(request.getParameter("add")!=null)
			{
		
				request.getRequestDispatcher("mid.jsp").include(request, response);
			
			}
		
			else if(request.getParameter("Delete")!=null)
			{
				request.getRequestDispatcher("mid.jsp").include(request, response);
			
			}
		
			else if((request.getParameter("display")!=null))
			{	
					request.getRequestDispatcher("mid.jsp").include(request, response);				
			}
			
		}
		else{
			out.println("login first");
			request.getRequestDispatcher("index.html").include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
