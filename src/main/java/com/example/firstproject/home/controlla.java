package com.example.firstproject.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class controlla {
    @GetMapping("login")
    public String logz() {
        return "login";
    }

    @GetMapping("courses")
    public String logza() {
        return "courses";
    }
}
