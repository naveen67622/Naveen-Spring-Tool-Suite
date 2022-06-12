package com.zensar.messageapi.security.jwt.util;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

@Component

public class JWTUtil {
	//This method is used to generate token for a user name
	// To genatare token we will be using library
	public String generateToken(String username)
	{
		String jwtToken =JWT.create()
								//payload (Consist of username)
							   .withClaim("name",username)
								//payload (Consists of expiration time)
							.withExpiresAt(new Date(System.currentTimeMillis()+60000))
							.sign(Algorithm.HMAC512("zensarsecret"));
			
		//We have created JWT token
			return jwtToken;
	}
	public void validateToken(String token) {
		 JWT.require(Algorithm.HMAC512("zensarsecret")).build().verify(token);
	}
	

	

}
