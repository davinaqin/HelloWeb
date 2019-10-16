package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/create")
public class CreateBlogServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 如果不指定method，则默认是Get请求

        response.setCharacterEncoding("Unicode");
        response.getWriter().append("创建博客");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");

        String title = request.getParameter("title");
        String content = request.getParameter("content");

        Blog blog = new Blog(title, content);

        response.getWriter().append("<html><head><meta charset='utf-8' /><title>天码营博客</title></head><body>");
        response.getWriter().append(String.format("<h1>%s</h1>", blog.getTitle()));
        response.getWriter().append(String.format("<p>这是天码营博客的第一篇文章</p>", blog.getContent()));
        response.getWriter().append("</body></html>");
    }
}
