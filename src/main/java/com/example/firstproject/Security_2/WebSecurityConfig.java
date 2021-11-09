package com.example.firstproject.Security_2;

import com.example.firstproject.Individuals.IndividualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    IndividualService individualService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        System.out.println("1");
        auth.userDetailsService(individualService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //BASIC AUTHORIZATION
//        http.authorizeRequests()
//                .antMatchers("/", "/home","/api/**").permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .httpBasic();
        http.csrf().ignoringAntMatchers("/api/**");

        http
//                .csrf().ignoringAntMatchers("/api/**").and()
//                .csrf().disable()
//                .csrf().ignoringAntMatchers("/api/**").disable()
                .authorizeRequests()
                .antMatchers("/createIndividual","/","/js/*","/css/*","/api/**").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin();
//        http
//                .authorizeRequests()
//                .antMatchers("/", "/home").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .loginProcessingUrl("/login-process")
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/api/**").permitAll();
//
//        http.authorizeRequests().antMatchers("courses").authenticated()
//                .and()
//                .formLogin().loginPage("/login")
//                .and()
//                .httpBasic();

//        http.csrf().
////        http.csrf()
////                .ignoringAntMatchers("/create/**")
////                .and()
////                .authorizeRequests()
////                .antMatchers("/users/**").permitAll();
//
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .anyRequest().permitAll()
//        http.authorizeRequests()
//                .antMatchers("/admin").hasRole("ADMIN")
//                .antMatchers("/user").hasAnyRole("ADMIN", "USER")
//                .antMatchers("/").permitAll()
//                .and().formLogin();//.loginPage("/login");
    }
//
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(10);
    }
}
