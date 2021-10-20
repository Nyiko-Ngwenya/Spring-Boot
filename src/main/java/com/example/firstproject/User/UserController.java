package com.example.firstproject.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/")
    public String greeting(User user) {
        return "login";
    }


//    @GetMapping("")
//    public String greeting(Model model){
//        model.addAttribute("user", new User());
//        return "login";
//    }

//    @GetMapping("/")
//    public String greeting(){
////        model.addAttribute("user", new User());
//        return "login";
//    }

    @GetMapping("/create")
    public String createUser(User user){
//        model.addAttribute("user", new User());
        return "createUser";
    }

    @GetMapping("/toets")
    public String toets(User user){
        return "toets";
    }
//    @PostMapping("/loginAuth")
//    public String displayDetails(@ModelAttribute User user, Model model){
//        model.addAttribute("user",user);
//        return "result";
//    }

    @PostMapping("/testing")
    public String addPerson(@ModelAttribute User user) {
        userService.addUser(new AppUser(user.getUserName(),user.getPassword()));
//        model.addAttribute("user",user);
        return "result";
    }


}
