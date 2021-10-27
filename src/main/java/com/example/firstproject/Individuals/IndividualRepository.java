package com.example.firstproject.Individuals;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface IndividualRepository extends JpaRepository<Individual, UUID> {

}
