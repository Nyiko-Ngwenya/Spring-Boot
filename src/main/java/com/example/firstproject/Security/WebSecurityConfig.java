package com.example.firstproject.Security;//package com.example.firstproject.Security;
//
import com.example.firstproject.Individuals.IndividualService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//
@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    private final IndividualService individualService;
    private final PasswordEncoder bCryptPasswordEncoder;

//    @Autowired
//    public WebSecurityConfig(IndividualService individualService, PasswordEncoder bCryptPasswordEncoder) {
//        this.individualService = individualService;
//        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
//    }


    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/api/v*/registration/**","/individual/*","/")
                .permitAll();
//                .anyRequest()
//                .authenticated().and()
//                .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                .defaultSuccessUrl("/accountCreated", true)
//                .passwordParameter("password")
//                .usernameParameter("username");
    }

    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider() {
        DaoAuthenticationProvider provider =
                new DaoAuthenticationProvider();
        provider.setPasswordEncoder(bCryptPasswordEncoder);
        provider.setUserDetailsService(individualService);
        return provider;
    }
}
