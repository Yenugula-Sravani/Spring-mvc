package com.spring.DAO;

import com.spring.DbConnect.Dbconnection;
import com.spring.model.Login;
import com.spring.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthDAO {
    private static Connection connection;
    private static String LOGIN_QUERY="SELECT id, email, password FROM user WHERE email=? and password=?";


    public AuthDAO() {
        connection= Dbconnection.getConnection();
    }

    public User validateUser(String email, String password) throws SQLException {
//        Login login=null;
        User user=null;
        try{
            PreparedStatement statement=connection.prepareStatement(LOGIN_QUERY);
            statement.setString(1,email);
            statement.setString(2,password);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                user=new User();
                user.setId(rs.getInt("id"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setConfirmpassword(rs.getString("confirmpassword"));
                user.setGender(rs.getString("Gender"));
                user.setLanguages(rs.getString("languages").split(","));
                user.setState(rs.getString("state"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
