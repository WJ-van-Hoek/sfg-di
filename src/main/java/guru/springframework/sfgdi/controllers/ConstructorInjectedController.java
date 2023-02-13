/**
 * 
 */
package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * @author Hoek0024
 *
 */
@Controller
public class ConstructorInjectedController {
	
	private final GreetingService greetingService;
	
	@Autowired
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingServiceImpl) {
		this.greetingService = greetingServiceImpl;
	}

	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
