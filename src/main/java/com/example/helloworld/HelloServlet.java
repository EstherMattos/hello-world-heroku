package com.example.helloworld;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloWorld")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String message = "";

        String lang = request.getParameter("lang");
        if(lang == null)
            lang = "pt";
        switch(lang){
            case "pt":
                message = "Olá, ";
                break;
            case "en":
                message = "Hello, ";
                break;
            case "fr":
                message = "Bonjour, ";
                break;
        }

        String name = request.getParameter("name");

        if(name == null)
            name = "Esther";

        message = message + name + "!";

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet</h1>");
            out.println("<p>" + message + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException {
        String message = "";

        String lang = request.getParameter("lang");
        if(lang == null)
            lang = "pt";
        switch(lang){
            case "pt":
                message = "Olá, ";
                break;
            case "en":
                message = "Hello, ";
                break;
            case "fr":
                message = "Bonjour, ";
                break;
            case "de":
                message = "Hallo, ";
                break;
        }

        String name = request.getParameter("name");

        if(name == null)
            name = "Esther";

        message = message + name + "!";

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet</h1>");
            out.println("<p>" + message + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}