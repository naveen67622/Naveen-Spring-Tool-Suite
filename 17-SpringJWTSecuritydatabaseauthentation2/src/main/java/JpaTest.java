import com.zensar.messageapi.security.jwt.util.JWTUtil;

public class JpaTest {

	public static void main(String[] args) {
		
		JWTUtil jwt= new JWTUtil();
		String token=jwt.generateToken("zensar");
		jwt.validateToken(token);
		System.out.println("Token is valid");
		
	}

}
