package org.adaitw.web_servlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "GaleriaServlet", value = "/GaleriaServlet")
public class GaleriaServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Estas en la Galeria";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</br>");
        out.println("<a href=\"http://localhost:8080/web_servlet_war_exploded/\">Atrás</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
