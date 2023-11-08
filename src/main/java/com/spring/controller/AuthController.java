package com.spring.controller;

import com.spring.DAO.AuthDAO;
import com.spring.model.Login;
import com.spring.model.Student;
import com.spring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

@Controller
public class AuthController {


    @RequestMapping("/")
    public String LoginForm(){
        return "index";
    }

    @RequestMapping(value = "/login-validate",method = RequestMethod.POST)
    public String validate(@RequestParam("email") String email, @RequestParam("password") String pass, Model model)
            throws SQLException {
        AuthDAO authDao=new AuthDAO();
        User user = authDao.validateUser(email, pass);
        model.addAttribute("users", user);
        if (user != null) {
            return "home";
        } else {
            model.addAttribute("error", true);
            return "index";
        }
    }

}
