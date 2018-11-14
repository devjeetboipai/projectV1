

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class signin extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String username = request.getParameter("loginid");
        String password = request.getParameter("Userpassword");
        
        PrintWriter out = response.getWriter();
        out.println(username+"  "+password);
        if(username.equals(password))
        {
                    out.println("Login successfull for "+ username+" ");
                  
                    
        }
        else
        {
            out.println("Incorrect Credentials");
    
            
        }
    }

   

}
