

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Hello() {}
        	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String str=request.getParameter("n1");
		String str1=request.getParameter("n2");
		out.println("<html>");
        out.println("<head>");
        out.println("<title></title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Welcome to IBM Interconnect Mr." +str+str1+ "</h1>");
        out.println("</body>");
        out.println("</html>");
        
		
		
		// TODO Auto-generated method stub
	}

}
