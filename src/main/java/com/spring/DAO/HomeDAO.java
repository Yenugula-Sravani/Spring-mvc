package com.spring.DAO;

import com.spring.DbConnect.Dbconnection;
import com.spring.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HomeDAO {
    private static Connection connection;
    private static String GET_USER="SELECT id,name,email,password,gender,state,language,qualification FROM user";

    public HomeDAO(){
        connection= Dbconnection.getConnection();
    }
    private static String SELECT_ALL_QUERY="select * from user";
    public List<User> allData(){
        List<User> allUsers = new ArrayList<>();
        User user = null;
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_QUERY);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setConfirmpassword(rs.getString("confirmpassword"));
                user.setGender(rs.getString("Gender"));
                user.setLanguages(rs.getString("languages").split(","));
                user.setState(rs.getString("state"));
                allUsers.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return allUsers;
    }
}
