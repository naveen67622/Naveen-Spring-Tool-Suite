package com.zensar.messageapi.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageapi.entity.ZensarUser;
import com.zensar.messageapi.security.jwt.util.JWTUtil;

@RestController
public class AuthentationRestController {
	
	@Autowired
	private JWTUtil util;
	@Autowired
	private AuthenticationManager manager ;
	
	// THIS method is used to do user authentitation using username,password passes by user
	@PostMapping("/api/authenticate")
	public ResponseEntity<String> authenticate(@RequestBody ZensarUser  user)
	{
		
		//1  Check if user exists
		
		 
		UsernamePasswordAuthenticationToken authenticationToken;
		authenticationToken =new UsernamePasswordAuthenticationToken(user.getUserName(),
								user.getPassword(),
								AuthorityUtils.createAuthorityList("ROLE_USER"));
		try {
			//This authentcates User.If user is not authenticated throws Exception
			manager.authenticate(authenticationToken);
			
			//2 If user exists generate token
			String token=util.generateToken(user.getUserName());
			
			ResponseEntity<String> entity = new ResponseEntity<String>(token,HttpStatus.OK);
			return entity;
			
			
		} catch (Exception e) {
		ResponseEntity<String> entity = new ResponseEntity<String>("Not Authenticated", HttpStatus.UNAUTHORIZED);
				return entity;
		}
		
		
		
	}
}
