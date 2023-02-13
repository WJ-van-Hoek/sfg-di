/**
 * 
 */
package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * @author Hoek0024
 *
 */
@Controller
public class MyController {

	private final GreetingService greetingService;

	/**
	 * @param greetingService
	 */
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
