package com.example.firstproject.Individuals;
////
//////import com.example.firstproject.Person.Person;
////import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

////import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
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
    PasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<Individual> individual = individualRepository.findByUserName(s);
        individual.orElseThrow(() -> new UsernameNotFoundException("Not found: "+s));
        return individual.map(IndividualDetails::new).get();
    }

    public void addPerson(Individual person) {
        String encodedPassword = bCryptPasswordEncoder.encode(person.getPassword());
        person.setPassword(encodedPassword);
        individualRepository.save(person);
    }
}