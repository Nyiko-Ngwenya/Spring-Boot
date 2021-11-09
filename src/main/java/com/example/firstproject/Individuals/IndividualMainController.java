package com.example.firstproject.Individuals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class IndividualMainController {
    @Autowired
    IndividualService individualService;

    @GetMapping("/createIndividual")
    public String signUp(Model model){
        model.addAttribute("user",new Credentials());
        return "createIndividual";
    }

    @GetMapping("/randomSecureIsh")
    public String randomSecure(){
        return "courses";
    }

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @GetMapping("")
    public String home(){
        return"home";
    }

    @PostMapping("/createIndividual")
    public String createUser(@ModelAttribute Credentials user, Model model){
        individualService.addPerson(user);
//        Credentials a = new Credentials("A","B");
//        individualService.addPerson();
        model.addAttribute("user",user.getUserName());
        return "accountCreated";
    }


    //REST API CALLS
    @PostMapping("/api/create")
    @ResponseBody
    public void addIndividual(@RequestBody Credentials user) {
        System.out.println(user);
        individualService.addPerson(user);
    }
}
