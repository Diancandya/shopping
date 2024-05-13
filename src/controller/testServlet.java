package controller;

import java.io.PrintWriter;
import enity.testGetbyID;

@javax.servlet.annotation.WebServlet(name="controller.testServlet",value="/controller.testServlet")
public class testServlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        PrintWriter out = response.getWriter();
        out.println("hello Servlet");
        testGetbyID test=new testGetbyID();
        request.setAttribute("name", test.getNamebyID(1)); // 将名称存储到 request 的属性中
        request.getRequestDispatcher("index.jsp").forward(request, response); // 转发到 index.jsp
    }
    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        this.doPost(request, response);
    }
}