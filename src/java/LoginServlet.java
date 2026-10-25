/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;


/**
 *
 * @author Angel
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String inputUser = request.getParameter("username");
        String inputPass = request.getParameter("password");
        
        String realUser = getServletConfig().getInitParameter("username");
        String realPass = getServletConfig().getInitParameter("password");
        
        String errorMsg = null;
        
        if (inputUser.isEmpty() && inputPass.isEmpty()) {
            errorMsg = "Username and password cannot be empty.";
        }
        else if (inputUser.isEmpty()) {
            errorMsg = "Username cannot be empty.";
        }
        else if (inputPass.isEmpty()) {
            errorMsg = "Password cannot be empty.";
        }
        else if (!inputUser.equals(realUser) && !inputPass.equals(realPass)) {
            errorMsg = "Username and password are incorrect.";
        }
        else if (!inputUser.equals(realUser)) {
            errorMsg = "Username is incorrect.";
        }
        else if (!inputPass.equals(realPass)) {
            errorMsg = "Password is incorrect.";
        }
        
        if (errorMsg != null) {
            request.setAttribute("msg", errorMsg);
            RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
            return;
        }
        else {
            request.getRequestDispatcher("success.jsp").forward(request, response);
            return;
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
