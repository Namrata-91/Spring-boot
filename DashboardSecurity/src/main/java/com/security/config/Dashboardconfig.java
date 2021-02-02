package com.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class Dashboardconfig  extends WebSecurityConfigurerAdapter{

	// authorization
	//process to allow authority to perform actions in the application
		 @Override
		protected void configure(HttpSecurity http) throws Exception {
				http.csrf().disable().	
				authorizeRequests().antMatchers("/").permitAll()
				.antMatchers("welcome").access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
				.antMatchers("/viewdetails").access("hasRole('ROLE_ADMIN')")
				.antMatchers("/bankpage").access("hasRole('ROLE_USER')")
				.anyRequest().authenticated().and().formLogin().loginPage("/login").defaultSuccessUrl("/welcome").permitAll()
				.and().logout()
	            .invalidateHttpSession(true)
	            .permitAll();
			}
	
	// authentication
	//the process of knowing and identifying the user that wants to access
	 @Autowired
		public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
			auth.inMemoryAuthentication()
			.withUser("java").password("{noop}code").authorities("ROLE_ADMIN")
			.and()
			.withUser("customer").password("{noop}data").authorities("ROLE_USER");
		}
}			