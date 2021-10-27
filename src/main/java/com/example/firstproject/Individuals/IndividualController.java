package com.example.firstproject.Individuals;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/individual")
public class IndividualController {

    @GetMapping("/signup")
    public String signUp(){
        return "login";
    }


}
