package com.example.firstproject.Individuals;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IndividualRepository extends JpaRepository<Individual, Integer> {
    Optional<Individual> findByUserName(String userName);
}
//
//import org.springframework.data.jpa.repository.JpaRepository;
////import org.springframework.data.repository.NoRepositoryBean;
//import org.springframework.stereotype.Repository;
//
//import java.util.Optional;
//import java.util.UUID;
//
//@Repository
//public interface IndividualRepository extends JpaRepository<Individual, UUID> {
////    Optional selectApplicationUserByUsername(String s);
////    Optional<Individual> selectApplicationUserByUsername(String username);
//    Optional<Individual> findUserByUsername(String username);
//}
