package Customer.repository;

import Customer.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private final String SELECT_ALL = "select * from customer;";
    private final String DELETE = "delete from customer where customer_id = ?;";
    private final String FIND = "select * from customer where customer_id = ?;";
    private final String INSERT = "insert into customer(customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address,customer_type_id)"+"value (?,?,?,?,?,?,?,?)";
    private  final String UPDATE = "update customer set customer_name = ?, customer_birthday = ?, " +
            "customer_gender = ?, customer_id_card = ?, customer_phone = ?, customer_email = ?, " +
            "customer_address = ?, customer_type_id = ? where customer_id = ? ;";

    @Override
    public List<Customer> findByAll() {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("customer_id");
                String name = resultSet.getString("customer_name");
                String birthDay = resultSet.getString("customer_birthday");
                int gender = resultSet.getInt("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                int typeId = resultSet.getInt("customer_type_id");
                customerList.add(new Customer(id, name, birthDay, gender, idCard, phone, email, address, typeId));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public void create(Customer customer) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setString(1, customer.getCustomerName());
            preparedStatement.setString(2,customer.getCustomerBirthDay());
            preparedStatement.setInt(3, customer.getCustomerGender());
            preparedStatement.setString(4, customer.getCustomerIdCard());
            preparedStatement.setString(5, customer.getCustomerPhone());
            preparedStatement.setString(6, customer.getCustomerEmail());
            preparedStatement.setString(7, customer.getCustomerAddress());
            preparedStatement.setInt(8, customer.getCustomerTypeId());
             preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Customer findById(int customerId) {
        Customer customer = null;
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND);
            preparedStatement.setInt(1, customerId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("customer_name");
                String birthDay = resultSet.getString("customer_birthday");
                int gender = resultSet.getInt("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                int typeId = resultSet.getInt("customer_type_id ");
                customer = new Customer(name, birthDay, gender, idCard, phone, email, address, typeId);


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public boolean edit(Customer customer) {
        boolean rowUpdate = false;
        Connection connection =BaseRepository.getConnectDB();
        try {
            CallableStatement cs = connection.prepareCall("{call editCustomer(?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, String.valueOf(customer.getCustomerId()));
            cs.setString(2, String.valueOf(customer.getCustomerTypeId()));
            cs.setString(3, customer.getCustomerName());
            cs.setString(4, customer.getCustomerBirthDay());
            cs.setInt(5, customer.getCustomerGender());
            cs.setString(6, customer.getCustomerIdCard());
            cs.setString(7, customer.getCustomerPhone());
            cs.setString(8, customer.getCustomerEmail());
            cs.setString(9, customer.getCustomerAddress());
            rowUpdate=cs.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdate;
    }

    @Override
    public boolean delete(int customerId) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1, customerId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
//        Connection connection = BaseRepository.getConnectDB();
//        try {
//            CallableStatement callableStatement = connection.prepareCall(DELETE);
//            callableStatement.setInt(1, customerId);
//            return callableStatement.executeUpdate() >= 1;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }

}
