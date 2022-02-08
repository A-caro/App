package org.adaitw.web_servlet;


import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ContactanosServlet", value = "/ContactanosServlet")
public class ContactanosServlet extends HttpServlet {
    private String message;
    private String index;

    public void init() {
        message = "Estas en ContactanosServlet";
        index = "index.jsp";

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</br>");
        out.println("<<form method=\"post\">");
        out.println("<textarea>Ingrese texto aquí</textarea>");
        out.println("<button type=\"submit\"\n>Enviar</button>");
        out.println("</form>");
        out.println("</br>");
        out.println("<a href=\" "+ index +" \">Atrás</a>");
        out.println("</body></html>");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title> Recibido </title>");}

    public void destroy() {
    }
}

