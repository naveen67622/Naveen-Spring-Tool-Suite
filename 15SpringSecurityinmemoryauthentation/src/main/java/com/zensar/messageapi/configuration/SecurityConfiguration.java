package com.zensar.messageapi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	//Authentication:- is the process of determining someone is who it says(Claims) to
	//It is typically implemented by userName and password
	
	@Bean // This will declare return Object as Spring Bean
	public BCryptPasswordEncoder getBcryptPasswordEncoder()
   {
		BCryptPasswordEncoder passwordEncoder =new BCryptPasswordEncoder();
		return passwordEncoder;
	}
	

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		
		auth
			.inMemoryAuthentication()
			.withUser("zensar")
			.password("$2a$10$OD5p8Fbl2ayUSp3Y5XFuxuv/aJy0WIs2q1jIj30gQw/CceqbhUQum")//password is stored in plain text which is bad thing
								//Spring security doesn't allows  to do that
								//Store password in encoded form
			
			.roles("USER")
			.and()
			.withUser("admin")
			.password("$2a$10$s3Hqd5L6gpb30IzaE6KRZ.5HAIjWhJv1THC5g233.GMV/Hf2pMUYm")
			.roles("ADMIN");
		//though we are writing user it is considered as ROLE_USER(it is automatically added)
	
	}
	
	//Authorization:- specifying access rights to a resource
	//Access base on Roles
	//What are you allowed to do?
	
@Override
protected void configure(HttpSecurity http) throws Exception {

	http
	.csrf().disable()
	.authorizeRequests()
	.antMatchers(HttpMethod.POST,"/api/message").hasRole("ADMIN")//WE are allowing only admin to asscess the post method
	.anyRequest()
	.authenticated()
	.and()
	.httpBasic()//This tells Basic Authentication
	.and()
	      .sessionManagement()
	      .sessionCreationPolicy(SessionCreationPolicy.STATELESS);  //REST is STATELESS
}


}
