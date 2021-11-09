package com.example.firstproject.Individuals;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class IndividualAPIController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @Autowired
    IndividualService individualService;

//    @PostMapping("/create")
//    public void addIndividual(@RequestBody Credentials person) {
//        individualService.addPerson(person);
//    }

//    @GetMapping("/createIndividual")
//    public String createIndividual(){
//        return "createIndividual.hmtl";
//    }

}
