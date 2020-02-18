package view;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/DynamischePagina")
public class EersteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='nl'>");
        out.println("<head>");
        out.println("<title> Dynamische Pagina </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<a href='index.html'>index</a>");
        int eyes = new Random().nextInt(1000) + 1;
        out.println("<h2> random getal: " + eyes + ".</h2>");
        out.println("</body>");
        out.println("</body>");
        out.println("</html>");
    }
}
