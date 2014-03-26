package login;

import sun.rmi.runtime.Log;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by hieudh on 3/25/14.
 */
public class Controller extends HttpServlet {
    final private String errorPage = "fail.jsp";
    final private String homePage = "index.jsp";
    final private String welcomePage = "welcome.jsp";
    final private String registerPage = "register.jsp";

    protected void doPost(HttpServletRequest request,
                   HttpServletResponse response) throws
                   ServletException, IOException {
        response.setContentType("text/html;character=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String action = request.getParameter("btAction");
            if (action.equals("Login")) {
                String username = request.getParameter("txtUsername");
                String password = request.getParameter("txtPass");
                Login login = new Login();
                boolean result = login.checkLogin(username, password);
                String url = errorPage;
                if (result) {
                    HttpSession session = request.getSession(true);
                    session.setAttribute("User", username);
                    url = welcomePage;
                }
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
            } else if (action.equals("Register")) {
                String rUserid = request.getParameter("txtUserid");
                String rPasswd = request.getParameter("txtPass");
                String rUserName = request.getParameter("txtUsername");
                String rGender = request.getParameter("txtGender");
                String rEmail = request.getParameter("txtEmail");
                Login login = new Login();
                boolean result = login.insert(rUserid, rPasswd, rUserName,
                        rGender, rEmail);
                RequestDispatcher rd = request.getRequestDispatcher(homePage);
                rd.forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
