package Customer.service;

import Customer.model.Customer;
import Customer.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee>findByAll ();
    void create(Employee employee);
    Employee findById(int id);
    boolean edit(Employee employee);
    boolean delete(int id);
}
