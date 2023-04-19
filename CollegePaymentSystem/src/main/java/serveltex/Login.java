package serveltex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 response.setContentType("text/html");
			PrintWriter out= response.getWriter();
			  

				
		String email =request.getParameter("email");
		String password =request.getParameter("password");



		if (email.equals("anishbandra@gmail.com") && password.equals("aneesh@123")) 
		{

			
			HttpSession session=request.getSession();  
		    session.setAttribute("emaill",email);  
		    session.setAttribute("password",password);
		    request.getRequestDispatcher("Adminhomepage.html").forward(request, response);	 

			
			out.println("Logged in successfully.<br/>");


			
		}

		else {
			
			out.println("somthing went wrong");
		}


		
	}

}
