package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techchefs.mywebapp.dao.EmployeeDAO;
import com.techchefs.mywebapp.dao.EmployeeDAOFactory;
import com.techchefs.mywebapp.dao.EmployeeInfoBean;

@WebServlet(urlPatterns = "/search",
			initParams = {
							@WebInitParam(name="act", value = "basanthi")
			})
public class EmployeeSearchServlet extends HttpServlet{


	@Override protected void doGet(HttpServletRequest req, HttpServletResponse
			resp) throws ServletException, IOException { String idValue =
			req.getParameter("id");
			
			ServletContext ctx = getServletContext();
			String movieName = ctx.getInitParameter("movie");
			
			ServletConfig config = getServletConfig();
			String actorName = config.getInitParameter("actor");
			String act = config.getInitParameter("act");
			
			EmployeeDAO dao = EmployeeDAOFactory.getInstance(); EmployeeInfoBean bean =
					dao.getEmployeeInfo(idValue); PrintWriter out = resp.getWriter();

					if(bean == null) { 
						out.print("<html>"); out.print("<body>");
						out.print("<h1><span style=\"color: red\">Emp not found </span></h1>");
						out.print("</body>"); out.print("</html>"); 
					}else { 
						out.print("<html>");
						out.print("<body>");
						out.print("<h1><span style=\"color: red\">Emp found </span></h1>");
						out.print("<br>"); out.print("<br>Id: "+bean.getId());
						out.print("<br>Name: "+bean.getName()); 
						out.print("<br>Movie: "+movieName); 
						out.print("<br>Actor: "+actorName); 
						out.print("<br>Actoress: "+act); 
						out.print("</body>");
						out.print("</html>"); 
					} 
					
					//get obj from forward servlet
					//EmployeeInfoBean empInfo = (EmployeeInfoBean) req.getAttribute("info");
					EmployeeInfoBean empInfo = (EmployeeInfoBean) ctx.getAttribute("info");
					if(empInfo == null) { 
						out.print("<html>"); out.print("<body>");
						out.print("<h1><span style=\"color: red\">Emp not found </span></h1>");
						out.print("</body>"); out.print("</html>"); 
					}else { 
						out.print("<html>");
						out.print("<body>");
						out.print("<h1><span style=\"color: red\">Emp found </span></h1>");
						out.print("<br>"); 
						out.print("<br>Id: "+empInfo.getId());
						out.print("<br>Name: "+empInfo.getName()); 
						out.print("<br>Movie: "+movieName); 
						out.print("<br>Actor: "+actorName); 
						out.print("<br>Actoress: "+act); 
						out.print("</body>");
						out.print("</html>"); 
					} 
			}


}
