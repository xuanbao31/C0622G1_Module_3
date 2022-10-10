package Customer.repository;

import Customer.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findByAll();
void create(Customer customer);
Customer findById(int customerId);
boolean edit(Customer customer);
boolean delete(int customerId);

}
