

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.zensar.messageapi.entity.ZensarUser;

public class ClientJwt {

	public static void main(String[] args) {
		
		
		
		RestTemplate rt = new RestTemplate();
		//1 Step submit user credentials and get the token  
		String loginUrl = "http://localhost:9091/api/authenticate";
		ZensarUser request = new ZensarUser();
		request.setUserName("zensar");
		request.setPassword("zensar");
		
		
		String token =rt.postForObject(loginUrl, request, String.class);
		System.out.println(token);
		
		
		//2 using this token access secured end points
		
		String messageUrl= "http://localhost:9091/api/message";
		HttpHeaders headers=new HttpHeaders();
	headers.add("Authorization", "Bearer "+token);
	HttpEntity<String>entity=new HttpEntity<String>(headers);
		ResponseEntity<String> exchange = rt.exchange(messageUrl, HttpMethod.GET, entity, String.class);
		System.out.println(exchange.getBody());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		// Following this URL on server we want to access
//		
//		String url ="http://localhost:9091/api/message";
//		
//	// RestTemplate  is a class given by spring to consume REST web  service
//		
//		RestTemplate rt=new RestTemplate();
//		String credentials="zensar:zensar";
//		
//		//FollOoeing line is used to convert string credentials to Base64 encoded form
//		//Using Base64 class given by java
//		//Because server expects credentials  in this form
//		
//		byte[] encode=Base64.getEncoder().encode(credentials.trim().getBytes());
//		String encodedCredentials=new String(encode).trim();
//		System.out.println(encodedCredentials);
//		
//		//This encoded credentials need to be passed to server using Http header 
//		//Name of the header is Authorization
//		//It is done as follows
//		
//		HttpHeaders headers=new HttpHeaders();
//		headers.add("Authorization", "Basis"+encodedCredentials);
//		HttpEntity<String>entity=new HttpEntity<String>(headers);
//		
//		ResponseEntity<String> exchange = rt.exchange(url, HttpMethod.GET, entity, String.class);
//		System.out.println(exchange.getBody());
		
		
		
		
		

	}

}
