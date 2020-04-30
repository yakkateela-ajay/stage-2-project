package controller;

import java.io.IOException;
import java.time.LocalDate;
import model.Blog;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet(urlPatterns= {"/blog"})
public class BlogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final LocalDate String = null;
	private static final java.lang.String blogTittle = null;
	private static final LocalDate date = null;
       

    public BlogController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response, Object user, Object blog) throws ServletException, IOException {
		String blogDetails = request.getParameter("selectedAnswers");
		
		String[] details=blogDetails.split(",");
		String blogTittle=details[0];
		String blogDescription=details[1];
		LocalDate date=LocalDate.now();
		
		
		
		Blog obj=new Blog(blogTittle, blogDescription, date); 
		 ((Blog) blog).setDescription(blogDescription);
		 ((Blog) blog).setTittle(blogTittle);
		 ((Blog) blog).setDate(date);
		 System.out.println("Blog Tittle:"+blogTittle);
		 System.out.println("Blog Description:"+blogDescription);
		 System.out.println("Posted on:"+date);
		
		
		if(blog!=null) {
			request.setAttribute("blog", blog);
			request.setAttribute("user",user);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
			rd.forward(request, response);
		}
		
	}

}
