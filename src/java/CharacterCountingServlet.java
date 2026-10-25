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

/**
 *
 * @author Angel
 */
public class CharacterCountingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String inputString = request.getParameter("inputString");
        
        int stringLength = inputString.length();
        int digitCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        int symbolCount = 0;
        
        String digitCheck = getServletConfig().getInitParameter("digits");
        String vowelCheck = getServletConfig().getInitParameter("vowels");
        String consonantCheck = getServletConfig().getInitParameter("consonants");
        String symbolCheck = getServletConfig().getInitParameter("symbols");
        
        for (int i=0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            String current = String.valueOf(c);
            
            if(Character.isWhitespace(c)) {
                continue;
            }
            if(digitCheck.contains(current)) {
                digitCount++;
            }
            else if(vowelCheck.contains(current)) {
                vowelCount++;
            }
            else if(consonantCheck.contains(current)) {
                consonantCount++;
            }
            else if(symbolCheck.contains(current)) {
                symbolCount++;
            }
        }
        
        request.setAttribute("originalInput", inputString);
        request.setAttribute("stringLength", stringLength);
        request.setAttribute("digitCount", digitCount);
        request.setAttribute("vowelCount", vowelCount);
        request.setAttribute("consonantCount", consonantCount);
        request.setAttribute("symbolCount", symbolCount);
        
        request.getRequestDispatcher("success.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
