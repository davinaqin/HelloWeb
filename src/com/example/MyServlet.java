package com.example;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");

        PrintWriter out = servletResponse.getWriter();
        out.print("<html><body>");
        out.print("<div style=\"text-align:center;\"><h2>hello generic servlet</h2></div>");
        out.print("</body></html>");


    }
}
