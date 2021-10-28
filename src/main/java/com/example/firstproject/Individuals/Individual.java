package com.example.firstproject.Individuals;

import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Individual {

    public Individual() {
    }

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id = UUID.randomUUID();
    private String userName;
    private String password;
    private boolean active;
    private String roles;

    public boolean isActive() {
        return active;
    }
}
