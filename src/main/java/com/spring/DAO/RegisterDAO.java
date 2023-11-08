package com.spring.DAO;

import com.spring.DbConnect.Dbconnection;
import com.spring.model.User;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.join;

public class RegisterDAO {


    private static Connection connection;
    private final String INSERT_QUERY = "INSERT INTO user (name,email,password,confirmpassword,gender,languages,state) VALUES (?,?,?,?,?,?,?)";

    public RegisterDAO(){
        connection= Dbconnection.getConnection();
    }

    public void addUser(User user, String languages){
        try {
            PreparedStatement ps = connection.prepareStatement(INSERT_QUERY);
            ps.setString(1,user.getName());
            ps.setString(2,user.getEmail());
            ps.setString(3,user.getPassword());
            ps.setString(4,user.getConfirmpassword());
            ps.setString(5,user.getGender());
            ps.setString(6,languages);
            ps.setString(7,user.getState());

            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
