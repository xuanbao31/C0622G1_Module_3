package controller;

import model.Product;
import service.IProductService;
import service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    private IProductService productService = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
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
            case"search":
                searchProduct(request,response);
                break;
            default:
                showList(request, response);

        }
    }

    private void searchProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product>productList= new ArrayList<>();
        String name =request.getParameter("nameSearch");
        productList=productService.searchByName(name);
        request.setAttribute("productList",productList);
        RequestDispatcher dispatcher=request.getRequestDispatcher("search.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormDelete(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));
//        Product product = productService.findById(id);
//        RequestDispatcher requestDispatcher;
//        if (product == null) {
//            requestDispatcher = request.getRequestDispatcher("error.jsp");
//        } else {
//            request.setAttribute("list", product);
//            requestDispatcher = request.getRequestDispatcher("delete.jsp");
//        }
//        try {
//            requestDispatcher.forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        int id=Integer.parseInt(request.getParameter("id"));
        productService.delete(id);
        try {
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("list.jsp");
        request.setAttribute("list", productService.list());
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                save(request, response);


        }
    }

    private void save(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));

        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String rate = request.getParameter("rate");
        String color = request.getParameter("color");
        int id = (int) (Math.random() * 10000);
        Product product = new Product(id, name, price, rate, color);
        productService.add(product);
        request.setAttribute("mess", "Them moi Thanh Cong");
        showFormCreate(request, response);

//        product.setId(id);
//        product.setName(name);
//        product.setPrice(price);
//        product.setRate(rate);
//        product.setColor(color);


//
//        showFormCreate(request, response);
    }
}
