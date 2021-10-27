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
//@EqualsAndHashCode
@Entity
public class Individual implements UserDetails {

    public Individual() {
    }

    @Id
    private UUID id = UUID.randomUUID();
    private String userName;
    private String password;
    private String email;

    @Enumerated(EnumType.STRING)
    private IndividualRole individualRole;
//    private final boolean isAccountNonExpired;
    private final boolean isAccountNonLocked = false;
//    private final boolean isCredentialsNonExpired;
    private final boolean isEnabled = false;

    public Individual(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

//    public UUID getId() {
//        return id;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public String getEmail() {
//        return email;
//    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(individualRole.name());
        return Collections.singleton(authority);
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
}
