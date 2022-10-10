package Customer.service;

import Customer.model.Customer;
import Customer.repository.CustomerRepositoryImpl;
import Customer.repository.ICustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> findByAll() {
        return customerRepository.findByAll();
    }

    @Override
    public void create(Customer customer) {
         customerRepository.create(customer);
    }

    @Override
    public Customer findById(int customerId) {
        return customerRepository.findById(customerId);
    }

    @Override
    public boolean edit(Customer customer) {
        return customerRepository.edit(customer);
    }

    @Override
    public boolean delete(int customerId) {
        return customerRepository.delete(customerId);
    }
}
