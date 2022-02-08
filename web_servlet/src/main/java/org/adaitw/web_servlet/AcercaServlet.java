package org.adaitw.web_servlet;


import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "AcercaServlet", value = "/AcercaServlet")
public class AcercaServlet extends HttpServlet {
    private String message;
    private String index;

    public void init() {
        message = "Estas en AcercaServlet";
        index = "index.jsp";

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</br>");
        out.println("<a href=\" "+ index +" \">Atrás</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}

