package controller;

import model.Dreamer;
import service.IDreamerService;
import service.impl.DreamerServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DreamerServlet", value = {"", "/dreamer"})
public class DreamerServlet extends HttpServlet {
    public IDreamerService dreamerService = new DreamerServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showFormCreate(request, response);
                break;
            case "delete":
                showFormDelete(request, response);
                break;
            case "search":
                showFormSearch(request,response);
            default:
                showList(request, response);
        }

    }

    private void showFormSearch(HttpServletRequest request, HttpServletResponse response) {
        String country = request.getParameter("country");
        List<Dreamer>dreamers=dreamerService.findByCountry(country);
        request.setAttribute("dreamers",dreamers);

    }

    private void showFormDelete(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("delete.jsp");
//        Dreamer dreamer = dreamerService.findById(id);
//        request.setAttribute("dreamer", dreamer);
//        try {
//            requestDispatcher.forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        int id = Integer.parseInt(request.getParameter("id"));
        dreamerService.delete(id);
        try {
            response.sendRedirect("/dreamer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Dreamer> list = dreamerService.list();
        request.setAttribute("list", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
