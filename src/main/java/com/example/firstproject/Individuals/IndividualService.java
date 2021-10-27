package com.example.firstproject.Individuals;

import com.example.firstproject.Person.Person;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
//@AllArgsConstructor
public class IndividualService implements UserDetailsService {


    private final IndividualRepository individualRepository;
    private final PasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public IndividualService(IndividualRepository individualRepository, PasswordEncoder b) {
        this.individualRepository = individualRepository;
        this.bCryptPasswordEncoder = b;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }

    public void addPerson(Individual individual) {
        String encodedPassword = bCryptPasswordEncoder
                .encode(individual.getPassword());
        individual.setPassword(encodedPassword);
        individualRepository.save(individual);
    }
}
