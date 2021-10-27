//package com.example.firstproject.User;
//
//import com.example.firstproject.Person.Person;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Base64;
//import java.util.Optional;
//
//@Service
//public class UserService {
//    private final UserRepository userRepository;
//
//    @Autowired
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public boolean addUser(AppUser user) {
//        Optional<AppUser> appUser = userRepository.existsByUsername(user.getUserName());
//        if(appUser.isPresent()){
//            return false;
//        }
//        String password =  Base64.getEncoder().encodeToString(user.getPassword().getBytes());
//        user.setPassword(password);
//        userRepository.save(user);
//        return true;
//    }
//
//    public boolean userExists(AppUser user){
//        Optional<AppUser> appUser = userRepository.existsByUsername(user.getUserName());
//        if(appUser.isPresent()){
//            return false;
//        }
//        return true;
//    }
//}
