package com.example.firstproject.Individuals;
////
//////import com.example.firstproject.Person.Person;
////import lombok.AllArgsConstructor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

////import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
//import sun.net.idn.Punycode;

////
@Service
public class IndividualService implements UserDetailsService {
//
//
//    private final IndividualRepository individualRepository;

//    private final PasswordEncoder bCryptPasswordEncoder;
//
    @Autowired
    IndividualRepository individualRepository ;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.println("Does this run");
        Optional<Individual> individual = individualRepository.findByUserName(s);
        System.out.println(individual.get().toString());
        System.out.println(individual.map(IndividualDetails::new).get());
        individual.orElseThrow(() -> new UsernameNotFoundException("Not found: "+s));
        return individual.map(IndividualDetails::new).get();
    }

    public void addPerson(Credentials person) {
//        System.out.println("This ran");
        Individual indie = new Individual();
        indie.setPassword(passwordEncoder.encode(person.getPassword()));

//        String a = passwordEncoder.encode("Wow");
//        System.out.println(a);
//        indie.setUserName(person.getUserName());
//        System.out.println(indie.getUserName());
//        String encodedPassword = bCryptPasswordEncoder.encode(person.getPassword());
////        person.setPassword(encodedPassword);
//
        indie.setUserName(person.getUserName());
//        System.out.println("We are here");
////        System.out.println(indie.getPassword()+" "+indie.getUserName()+" "+indie.getRoles()+" "+indie.getId()+" "+indie.isActive());
        individualRepository.save(indie);
    }
}