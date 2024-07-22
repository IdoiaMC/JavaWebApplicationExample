package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Actividad 1 Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Actividad 1</h1>");
		out.println("<form action=\"/myServlet2\">\n" +
				"  <label for=\"fname\">First name:</label><br>\n" +
				"  <input type=\"text\" id=\"fname\" name=\"fname\" value=\"Idoia\"><br>\n" +
				"  <label for=\"lname\">Last name:</label><br>\n" +
				"  <input type=\"text\" id=\"lname\" name=\"lname\" value=\"Martinez\"><br><br>\n" +
				"  <input type=\"submit\" value=\"Submit\">\n" +
				"</form> ");
		out.println("</body></html>");
	}

}