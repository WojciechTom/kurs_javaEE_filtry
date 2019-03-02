package servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "tajnehaslo";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");

        if(userName.equals(USERNAME) && password.equals(PASSWORD)){
            System.out.println("hasło i użytkownik poprawne");
            request.getSession(true).setAttribute("username", userName);
        } else {
            response.sendRedirect("admin.jsp");
        }
    }

}
