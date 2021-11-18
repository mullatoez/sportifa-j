package servlet;


import entity.LoginUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(
        name = "LoginAction",
        urlPatterns = "/login"
)
public class LoginAction extends BaseServlet {

    private LoginUser loginUser = new LoginUser();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (!(Objects.equals(username, loginUser.getUsername()) && Objects.equals(password, loginUser.getPassword()))) {
            System.out.println("Invalid logins");
        } else {
            response.sendRedirect("./dashboard.jsp");
        }
    }
}
