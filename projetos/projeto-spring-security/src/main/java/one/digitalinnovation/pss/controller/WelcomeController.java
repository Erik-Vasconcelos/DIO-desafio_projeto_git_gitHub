package one.digitalinnovation.pss.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping
	public String welcome() {
		return "Welcome to My Spring Boot Web API";
	}

	@GetMapping("/users")
	//@PreAuthorize("hasAnyRole('MANAGERS','USERS')")//diz quais perfis são autorizados para determinado endpoint
	public String users() {
		return "Authorized user";
	}

	@GetMapping("/managers")
	//@PreAuthorize("hasRole('MANAGERS')")
	public String managers() {
		return "Authorized manager";
	}
	
	@GetMapping("/manager/users")
	//@PreAuthorize("hasRole('MANAGERS')")
	public String managersUsers() {
		return "Authorized manager for users";
	}
}