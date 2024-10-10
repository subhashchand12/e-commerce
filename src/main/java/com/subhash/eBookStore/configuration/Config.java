package com.subhash.eBookStore.configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Config {
    public SecurityFilterChain  securityFilterChain(HttpSecurity http)throws  Exception{
        http.formLogin(form->form.loginPage("/login").permitAll());
        return  http.build();
    }

}
