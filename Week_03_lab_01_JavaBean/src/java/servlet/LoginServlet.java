/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 715583
 */
public class LoginServlet extends HttpServlet {

    @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
     }
 
     @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
         
         String username = request.getParameter("Uname");
         String password = request.getParameter("Pword");
         
         User user = new User(username,password);
         
         request.setAttribute("user", user);
         
//         request.setAttribute("username", username);
//         request.setAttribute("password", password);
         //getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
         
         if( username==null || password == null || username.trim().isEmpty() ||password.trim().isEmpty())
         {
             request.setAttribute("display","Both values are required!");
             getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
             return;
         }
         User us = new User();
         if( user.loginVerify() == false)
         {
             request.setAttribute("display","Invalid username or password!");
             getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);  
             return;
         }
         else
         {
             request.setAttribute("username", username);
             getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);
             return;

         }
     }

   

}
