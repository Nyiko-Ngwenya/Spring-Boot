package com.example.firstproject.Individuals;

//import com.example.firstproject.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class IndividualController {

    @Autowired
    IndividualService individualService;

    @GetMapping("/createIndividual")
    public String signUp(Model model){
        model.addAttribute("user",new Credentials());
        return "createIndividual";
    }

//    @PostMapping("/createIndividuall")
//    public String createUser(@RequestParam(name = "username") String username,@RequestParam(name = "password") String password){
//        System.out.println("Klad"+password+username);
////        System.out.println(person);
//        individualService.addPerson(new Credentials(username,password));
//        return "accountCreated";
//    }

    @PostMapping("/createIndividuall")
    public String createUser(@ModelAttribute Credentials user, Model model){
        System.out.println(user);
//        System.out.println("Klad"+password+username);
//        System.out.println(person);
        individualService.addPerson(user);
        return "accountCreated";
    }

}
