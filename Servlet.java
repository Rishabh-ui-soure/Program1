/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
/**
 *
 * @author Rishabh Rathore
 */
@WebServlet(urlPatterns = {"/level1"})
public class level1 implements Filter {

   public void init(FilterConfig arg0)
           throws ServletException {}
   public void doFilter(ServletRequest req,ServletResponse resp, FilterChain chain) throws IOException, ServletException
   {
       PrintWriter out = resp.getWriter();
       out.print("Level 1 Filter is Evoked");
       chain.doFilter(req, resp);
       out.print("Level 1 Filter is Ended.");
   }
   public void destroy() {
       
   }
}
Level 1 Filter Ends here.
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/level1"})
public class level2 implements Filter {

   public void init(FilterConfig arg0)
           throws ServletException {}
   public void doFilter(ServletRequest req,ServletResponse resp, FilterChain chain) throws IOException, ServletException
   {
       PrintWriter out = resp.getWriter();
       out.print("<br/>Level 2 Filter Evoked.");
       chain.doFilter(req, resp);
       out.print("Level 2 Filter Ended.<br/>");
   }
   public void destroy() {
       
   }
}
Level 2 Filter Ends here.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
import javax.servlet.*;
/**
 *
 * @author Rishabh Rathore
 */
public class mainServelet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<h1>Servlet MSg After Level1 and 2 Filter.</h1>");
    }

  
}
Main Servlet Page.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
© 2021 GitHub, Inc.
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
Loading complete
