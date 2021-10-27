package com.example.firstproject.Individuals;

import com.example.firstproject.Person.Person;
import com.example.firstproject.Person.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/individual")
public class IndividualAPIController {

    private final IndividualService individualService;

    @PostMapping
    public void addIndividual(@RequestBody Individual individual) {
        individualService.addPerson(individual);
    }


}
