package ar.com.bgarcia.restassured;

import org.junit.Test;

import ar.com.bgarcia.restassured.model.User;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.util.Arrays;
import java.util.List;

public class UserTest {
	
	private final String USER_URL = "https://jsonplaceholder.typicode.com/users";

	@Test
	public void testParseUsers() throws Exception {
		Response response = given().when().get(USER_URL);
		List<User> users = Arrays.asList(response.getBody().as(User[].class));
		System.out.println("Users" + users.toString());
	}
}
