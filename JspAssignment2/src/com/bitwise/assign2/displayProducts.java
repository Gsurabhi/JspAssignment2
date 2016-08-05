package com.bitwise.assign2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class displayProducts extends SimpleTagSupport  {
	
	
	
	public void doTag() throws JspException, IOException {
		

	    PageContext pageContext = (PageContext) getJspContext();
		HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
	HttpServletResponse response = (HttpServletResponse) pageContext.getResponse();
		HttpSession session= request.getSession();
		JspWriter out = getJspContext().getOut();
		Map<Integer, String> map=new HashMap<Integer, String>(); 
		
		
		if(request.getParameter("add")!=null)
		{
			String[] shopingItems=request.getParameterValues("ShopingItems");
			for(int i=0;i<shopingItems.length;i++)
			{
				map.put(new Integer(i+1),shopingItems[i]);
			}
				for(Map.Entry<Integer, String> entry : map.entrySet())
				{
					out.println("<html><body>");
					out.println("<table>");
					out.println("<head><h3><tr><td>"+entry.getKey()+"</td><td>"+entry.getValue()+"</td></tr></h3>");
					out.println("</head></table></html></body>");
					
				}
				session.setAttribute("map1", map);
			
			
		
		}
	 if(request.getParameter("Delete")!=null)
		{
			
			int key=Integer.parseInt(request.getParameter("delete"));
			
			HashMap map1=(HashMap) session.getAttribute("map1");
			map1.remove(key);
			out.println("Item deleted successfully\n\n");
			session.setAttribute("map2", map1);
		}
	 
	//iterator values from map
	 if ((request.getParameter("display")!=null))
		{
		 out.println("<html1><head><h2>Selected items are :\n</h2></head></html1>");
		 	HashMap map2=(HashMap) session.getAttribute("map2");
			java.util.Iterator itr = map2.entrySet().iterator();
			while (itr.hasNext()) 
			{
				Map.Entry item = (Map.Entry) itr.next();
				

			 out.print("<head><h3><tr><td>"+item.getKey()+"</td><td><br>"+item.getValue()+"</td></tr></h3>");
			 
			}
			try {
				request.getRequestDispatcher("logout.jsp").include(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
		
	
	
	
	}
}
	    
