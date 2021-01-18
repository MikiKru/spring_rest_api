//package com.example.spring_rest_api.configuration;
//
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//@Configuration          // special class that determine security mechanisms in app
//public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
//    // method determine secured area in http requests
//    protected void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity
//                .authorizeRequests()    // every request inside after this method needs to be logged
//                .antMatchers("/users/changePassword").hasAnyAuthority("ROLE_USER", "ROLE_ADMIN")
//                .antMatchers("/users/delete/**").hasAnyAuthority( "ROLE_ADMIN")
//
//    }
//
//    // method determine logging process autenthicated based on database
//    protected  void configure(AuthenticationManagerBuilder auth){
//
//    }
//}
