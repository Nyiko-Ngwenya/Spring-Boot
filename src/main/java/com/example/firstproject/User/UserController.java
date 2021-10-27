//package com.example.firstproject.User;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
////javademospringbucket
//@Controller
//@RequestMapping("/account")
//public class UserController {
//
//    private final UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/login")
//    public String homePage(User user) {
//        return "login";
//    }
//
//
////    @GetMapping("")
////    public String greeting(Model model){
////        model.addAttribute("user", new User());
////        return "login";
////    }
//
////    @GetMapping("/")
////    public String greeting(){
//////        model.addAttribute("user", new User());
////        return "login";
////    }
//
//    @GetMapping("/signup")
//    public String signUp(User user){
//        return "createUser";
//    }
//
////    @GetMapping("/toets")
////    public String toets(User user){
////        return "toets";
////    }
//    @PostMapping("/loginAuth")
//    public String displayDetails(@ModelAttribute User user, Model model){
//        model.addAttribute("user",user);
//        return "result";
//    }
//
//    @PostMapping("/createAccount")
//    public String createAccount(@ModelAttribute User user) {
////        boolean exists = userService.userExists(user);
////        if(exists==true){
////            return "login";
////        }
//        boolean created = userService.addUser(new AppUser(user.getUserName(),user.getPassword()));
//        if(created == true){
//            return "login";
//        }
////        model.addAttribute("user",user);
//        return "signUp";
//    }
//
//
//}
