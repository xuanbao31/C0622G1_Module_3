package Customer.service;

import Customer.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findByAll();

  void create(Customer customer);
    Customer findById(int customerId);
    boolean edit(Customer customer);
    boolean delete(int customerId);
}
