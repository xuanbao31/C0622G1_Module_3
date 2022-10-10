package repository;

import model.Passport;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PassportRepositoryImpl implements IPassportRepository{
    private static final String SELECT_ALL="select * from passport ";

    @Override
    public List<Passport> findByAll() {
        List<Passport>list=new ArrayList<>();
        Connection connection= BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(SELECT_ALL);
            ResultSet rs= preparedStatement.executeQuery();
            while (rs.next()){
                int id =rs.getInt("passport_id");
                String name = rs.getString("full_name");
                String age = rs.getString("age");
                String address =rs.getString("address");
                String city = rs.getString("city");
                String nickName = rs.getString("nick_name");
                list.add(new Passport(id,name,age,address,city,nickName));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
