//package com.example.firstproject.Person;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//@RestController
//@RequestMapping(path = "api/person")
//public class PersonController {
//
//    private final PersonService personService;
//
//    @Autowired
//    public PersonController(PersonService personService) {
//        this.personService = personService;
//    }
//
//    //    //CREATE
//    @PostMapping("")
//    public void addPerson(@RequestBody Person person) {
//        personService.addPerson(person);
//    }
//
//    //RETREIVE
//    @GetMapping("")
//    public List<Person> getPeople() {
//        return personService.getPeople();
//    }
//
//    //RETREIVE
////    @GetMapping("login")
////    public String getPeople() {
////        return "login";
////    }
//
//
//    @GetMapping("/{id}")
//    public Optional<Person> getSpecificPerson(@PathVariable(value = "id") UUID personId) {
//        return personService.getSpecificPerson(personId);
//    }
//
//    //UPDATE
//    @PutMapping("/{id}")
//    public void updatePerson(@PathVariable(value = "id") UUID personId, @RequestBody Person personDetails) {
//        personService.updatePerson(personId, personDetails);
//    }
//
////    @PatchMapping()
//
//
//    //DELETE
//    @DeleteMapping("/{id}")
//    public void deletePerson(@PathVariable(value = "id") UUID personId) {
//        personService.delete_person(personId);
//    }
//}
