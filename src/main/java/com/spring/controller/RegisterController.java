package com.spring.controller;

import com.spring.DAO.RegisterDAO;
import com.spring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

import static java.lang.String.join;

@Controller
public class RegisterController {

    @RequestMapping("/register")
    public String register(){
        return "register";
    }


    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("users") User user){
        if(user.getPassword().equals(user.getConfirmpassword())){
            String languages = join(",",user.getLanguages());
            RegisterDAO  registerDAO  = new RegisterDAO ();
            registerDAO.addUser(user,languages);
        }
        return "index";
    }


}
