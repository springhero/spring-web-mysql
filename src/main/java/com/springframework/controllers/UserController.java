package com.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springframework.domain.User;
import com.springframework.services.UserService;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public void setProductService(UserService productService) {
        this.userService = productService;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("users", userService.listAllUsers());
        System.out.println("Returning users:");
        return "users";
    }

    @RequestMapping("user/{id}")
    public String showProduct(@PathVariable Long id, Model model){
        model.addAttribute("user", userService.getUserbyId(id));
        return "usershow";
    }

    @RequestMapping("user/edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        model.addAttribute("user",userService.getUserbyId(id));
        return "userform";
    }

    @RequestMapping("user/new")
    public String newProduct(Model model){
        model.addAttribute("user", new User());
        return "userform";
    }

    @RequestMapping(value = "user", method = RequestMethod.POST)
    public String saveUser(User user){
    	user = userService.saveUser(user);
        return "redirect:/user/"+user.getId();
    }
}
