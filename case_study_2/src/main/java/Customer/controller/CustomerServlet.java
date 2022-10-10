package Customer.controller;

import Customer.model.Customer;
import Customer.repository.ICustomerRepository;
import Customer.service.CustomerServiceImpl;
import Customer.service.ICustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    public ICustomerService customerService = new CustomerServiceImpl();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "delete":
                showDeleteForm(request, response);
                break;
//            case "deleteCustomer":
//                submitDelete(request, response);
//                break;
            case "edit":
                showEditForm(request, response);
                break;
            default:
                showListCustomer(request, response);
        }

    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int idEdit = Integer.parseInt(request.getParameter("id"));
//        Customer customer = customerService.findById(id);
//        RequestDispatcher dispatcher;
//        dispatcher = request.getRequestDispatcher("editCustomer.jsp");
//        request.setAttribute("customer", customer);

        request.setAttribute("idEdit",idEdit);
        try {
            request.getRequestDispatcher("editCustomer.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("createCustomer.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private void submitDelete(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));
//        customerService.delete(id);
//        try {
//            response.sendRedirect("/customer?msg=Xoa%20%Thanh%20Cong");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("deleteCustomer.jsp");
//        Customer customer = customerService.findById(id);
//        request.setAttribute("customer", customer);
//        try {
//            requestDispatcher.forward(request, response);
//
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        int deleteId = Integer.parseInt(request.getParameter("deleteId"));
        boolean check = customerService.delete(deleteId);
        String mess = "Xóa Thành Công";
        if (!check) {
            mess = "Xóa đéo đc ba";
        }
        request.setAttribute("mess", mess);
        showListCustomer(request, response);
    }

    private void showListCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> list = customerService.findByAll();
        request.setAttribute("list", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer.jsp");
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
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                save(request, response);
                break;
            case "edit":
                edit(request,response);
                break;

        }
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idEdit"));
        String name =request.getParameter("name");
        String birthDay=request.getParameter("birthDay");
        int gender = Integer.parseInt(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address=request.getParameter("address");
        int typeId =Integer.parseInt(request.getParameter("typeId"));
        Customer customer=new Customer(id,name,birthDay,gender,idCard,phone,email,address,typeId);
        customerService.edit(customer);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("editCustomer.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String birthDay = request.getParameter("birthDay");
        int gender = Integer.parseInt(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int typeId = Integer.parseInt(request.getParameter("typeId"));
//        Customer customer=new Customer();
        Customer customer = new Customer(name, birthDay, gender, idCard, phone, email, address, typeId);
        customerService.create(customer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("createCustomer.jsp");
        requestDispatcher.forward(request, response);

//        String message = "Thêm mới thành công";
//        if (!check) {
//            message = "Thêm mới thành công ";
//        }
//        request.setAttribute("message", message);
//        try {
//            response.sendRedirect("/customer");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        customer.setCustomerName(name);
//        customer.setCustomerBirthDay(birthDay);
//        customer.setCustomerGender(gender);
//        customer.setCustomerIdCard(idCard);
//        customer.setCustomerPhone(phone);
//        customer.setCustomerEmail(email);
//        customer.setCustomerAddress(address);
//        customer.setCustomerTypeId(typeId);
//        customerService.create(customer);
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("createCustomer.jsp");
//        try {
//            requestDispatcher.forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
