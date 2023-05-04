package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import model.User;
import service.UserService;

@Controller
public class AuthController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login() {
        return "signin";
    }

    @RequestMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @RequestMapping("/save")
    public String registerUser(@ModelAttribute("user") User user, Model model) {

        if (userService.isUserPresent(user)) {
            model.addAttribute("successMessage", "User already registered!");
            return "signin";
        }

        userService.saveUser(user);
        model.addAttribute("successMessage", "User registered successfully!");

        return "signin";
    }
}