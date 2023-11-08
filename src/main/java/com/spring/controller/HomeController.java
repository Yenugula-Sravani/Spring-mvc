package com.spring.controller;

import com.spring.DAO.HomeDAO;
import com.spring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private HomeDAO homeDao;

    public HomeController() {
        homeDao = new HomeDAO();
    }


    @RequestMapping("/home")
    public String loadHome(Model model){
        List<User> allUsers = homeDao.allData();
        model.addAttribute("users",allUsers);
        return "home";
    }
}
