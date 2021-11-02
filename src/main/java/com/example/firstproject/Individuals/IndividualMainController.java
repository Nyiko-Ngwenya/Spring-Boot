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

    @PostMapping("/createIndividual")
    public String createUser(@ModelAttribute Credentials user, Model model){
        individualService.addPerson(user);
        model.addAttribute("user",user.getUserName());
        return "accountCreated";
    }

    @PostMapping("/api/create")
    @ResponseBody
    public void addIndividual(@RequestBody Credentials person) {
        individualService.addPerson(person);
    }
}
