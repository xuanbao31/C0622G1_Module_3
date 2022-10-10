package Customer.controller;

import Customer.model.Employee;
import Customer.service.EmployeeServiceImpl;
import Customer.service.IEmployeeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Customer.controller.EmployeeServlet", urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    private IEmployeeService employeeService=new EmployeeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "create":
                showFormCreate(request,response);
                break;
            case "delete":
                showFormDelete(request,response);
            default:showListEmployee(request,response);
        }

    }

    private void showFormDelete(HttpServletRequest request, HttpServletResponse response) {
        int deleteId=Integer.parseInt(request.getParameter("deleteId"));
        boolean check=employeeService.delete(deleteId);
        String mess ="Delete complete";
        if (!check){
            mess="Delete failed";
        }
        request.setAttribute("mess",mess);
        showListEmployee(request,response);
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("createEmployee.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showListEmployee(HttpServletRequest request, HttpServletResponse response) {
        List<Employee>list=employeeService.findByAll();
        request.setAttribute("list",list);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("employee.jsp");
        try {
            requestDispatcher.forward(request,response);
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
        switch (action){
            case"add":
                save(request,response);
                break;
                
        }
    }

    private void save(HttpServletRequest request, HttpServletResponse response) {
        String name =request.getParameter("name");
        String birthDay=request.getParameter("birthDay");
        String cardId=request.getParameter("cardId");
        Double salary=Double.parseDouble(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address= request.getParameter("address");
        int positionId=Integer.parseInt(request.getParameter("positionId"));
        int educationId=Integer.parseInt(request.getParameter("educationId"));
        int divisionId=Integer.parseInt(request.getParameter("divisionId"));
        Employee employee=new Employee(name,birthDay,cardId,salary,phone,email,address,positionId,educationId,divisionId);
        employeeService.create(employee);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("createEmployee.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
