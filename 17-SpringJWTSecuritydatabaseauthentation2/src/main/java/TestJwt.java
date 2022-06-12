import java.util.Scanner;

import com.zensar.messageapi.security.jwt.util.JWTUtil;

public class TestJwt {

	public static void main(String[] args) {
		
		JWTUtil util=new JWTUtil();
	    String token =util.generateToken("zensar");
		new Scanner (System.in).next();//THIS is to make sure Program halts
										//so that time expires and token  expires
										// To test expiration time test
	try {
			util.validateToken(token);
			System.out.println("Token is valid");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Token is invalid");
		}
		
		
	}

}
