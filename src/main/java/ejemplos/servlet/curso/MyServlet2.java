package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/MyServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		response.setContentType("text/html");

		request.setAttribute("firstName", firstName);
		request.setAttribute("lastName", lastName);


		request.getRequestDispatcher("/MyServlet2.jsp").forward(request, response);
	}

}