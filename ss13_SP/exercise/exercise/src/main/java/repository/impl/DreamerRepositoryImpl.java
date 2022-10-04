package repository.impl;

import model.Dreamer;
import repository.BaseRepository;
import repository.IDreamerRepository;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DreamerRepositoryImpl implements IDreamerRepository {
    private static final String SELECT = "select * from users";
    private static final String SELECT_SP = "call show_list();";
    private static final String SAVE = "insert into users(full_name,age,country,address) \n" + "value (?,?,?,?)";
    private static final String DELETE = "delete from users where id =  ?";
    private static final String DELETE_SP = "call delete_list(?)";
    private static final String SEARCH = "select * from users where country like ? ";
    private static final String FIND = "select * from users where id = ?";

    @Override
    public List<Dreamer> list() {

        List<Dreamer> list = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            Dreamer dreamer;
//            PreparedStatement preparedStatement = connection.prepareStatement(SELECT);
//            ResultSet resultSet = preparedStatement.executeQuery();
            CallableStatement callableStatement=connection.prepareCall(SELECT_SP);
            ResultSet resultSet =callableStatement.executeQuery();
            while (resultSet.next()) {
                dreamer = new Dreamer();
                int id = resultSet.getInt("id");
                String name = resultSet.getString("full_name");
                String age = resultSet.getString("age");
                String country = resultSet.getString("country");
                String address = resultSet.getString("address");
                dreamer.setId(id);
                dreamer.setName(name);
                dreamer.setAge(age);
                dreamer.setCountry(country);
                dreamer.setAddress(address);
                list.add(dreamer);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }


    @Override
    public void save(Dreamer dreamer) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE);
            preparedStatement.setString(1, dreamer.getName());
            preparedStatement.setString(2, dreamer.getAge());
            preparedStatement.setString(3, dreamer.getCountry());
            preparedStatement.setString(4, dreamer.getAddress());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
//        Connection connection = BaseRepository.getConnectDB();
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(DELETE);
//            preparedStatement.setInt(1, id);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        Connection connection = BaseRepository.getConnectDB();
        try {

            CallableStatement callableStatement = connection.prepareCall(DELETE_SP);
            callableStatement.setInt(1, id);
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Dreamer findById(int id) {
        Dreamer dreamer = null;
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id1 = resultSet.getInt("id");
                String name = resultSet.getString("full_name");
                String age = resultSet.getString("age");
                String country = resultSet.getString("country");
                String address = resultSet.getString("address");
                dreamer = new Dreamer(id1, name, age, country, address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dreamer;
    }

    @Override
    public List<Dreamer> findByCountry(String country) {
        List<Dreamer> dreamerList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH);
//            preparedStatement.setString(1,'%'+country+'%');
            preparedStatement.setString(1, country);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("full_name");
                String age = rs.getString("age");
                String nameCountry = rs.getString("country");
                String address = rs.getString("address");
                dreamerList.add(new Dreamer(id, name, age, nameCountry, address));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dreamerList;
    }

}

