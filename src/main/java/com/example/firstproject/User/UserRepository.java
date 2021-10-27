//package com.example.firstproject.User;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import javax.swing.text.html.Option;
//import java.util.Optional;
//import java.util.UUID;
//
//@Repository
//public interface UserRepository extends JpaRepository<AppUser, UUID> {
////    String changeToBase64(String info); //  = Base64.getEncoder().encodeToString(originalInput.getBytes());
//    @Query("SELECT s FROM AppUser s WHERE s.userName =?1")
//    Optional<AppUser> existsByUsername(String username);
//}
