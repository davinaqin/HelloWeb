package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LifeServlet extends HttpServlet {

    public LifeServlet() {
        System.out.println("执行构造方法,示例化对象");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("init方法被调用...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("service方法被调用...");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("destroy方法被调用");
    }
}
