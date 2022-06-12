package com.zensar.jwt.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class JWTAuthorizationFilter extends OncePerRequestFilter{

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		try {
			
			if(checkJWTToken(request,response)) {
				
			}
		} catch (Exception e) {
			
		}
		
	}

	private boolean checkJWTToken(HttpServletRequest request, HttpServletResponse response) {
		
		return false;
	}
	

}
