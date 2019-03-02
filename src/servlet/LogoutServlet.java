package servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException {
        if(request.getSession(false) != null){
            System.out.println("Log out");
            request.getSession().invalidate();
            response.sendRedirect("index.jsp");
        } else {
            System.out.println("brak aktywnej sesji");
        }

    }
}
