package controller;

import model.Passport;
import service.IPassportService;
import service.PassportServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "PassportServlet", value = "/passport")
public class PassportServlet extends HttpServlet {
    private IPassportService passportService = new PassportServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "33":
                break;
            default:
                showListPassport(request, response);
                break;
        }
    }

    private void showListPassport(HttpServletRequest request, HttpServletResponse response) {
        List<Passport> list = passportService.findByAll();
        request.setAttribute("list",list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/listPassport.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
