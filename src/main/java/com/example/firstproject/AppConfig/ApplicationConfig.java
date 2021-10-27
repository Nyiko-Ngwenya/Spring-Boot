//package com.example.firstproject.AppConfig;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class ApplicationConfig extends WebSecurityConfigurerAdapter {
////    @Override
////    public void configure(WebSecurity web) throws Exception {
////        super.configure(web);
////    }
//
//    private final PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public ApplicationConfig(PasswordEncoder passwordEncoder){
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers()
//                .permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .httpBasic();
//    }
//}
//
////    @Override
////    @Bean
////    protected UserDetailsService userDetailsService(){
//////        return super.userDetailsService();
//////        User.builder()
//////                .username("annasmith")
//////                .password("password")
//////    }
////}
