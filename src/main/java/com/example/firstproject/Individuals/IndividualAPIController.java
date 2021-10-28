package com.example.firstproject.Individuals;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
//@RequestMapping("/api/v1/individual")
public class IndividualAPIController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @Autowired
    IndividualService individualService;

    @PostMapping("/create")
    public void addIndividual(@RequestBody Individual person) {
        individualService.addPerson(person);
    }

    @GetMapping("/createIndividual")
    public String createIndividual(){
        return "createIndividual";
    }

}
