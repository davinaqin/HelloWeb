package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/helloworld")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException {
        response.setCharacterEncoding("Unicode");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().append("<html>")
                .append("<body>")
                .append("<h1>第一篇博客文章</h1>")
                .append("<p>这是天码营博客的第一篇文章</p>")
                .append("</body>")
                .append("</html>");
    }
}
