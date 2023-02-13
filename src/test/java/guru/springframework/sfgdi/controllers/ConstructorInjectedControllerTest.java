/**
 * 
 */
package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.ConstructorGreetingService;

/**
 * @author Hoek0024
 *
 */
class ConstructorInjectedControllerTest {

	ConstructorInjectedController constructorInjectedController;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		GreetingService greetingServiceImpl = new ConstructorGreetingService();
		constructorInjectedController = new ConstructorInjectedController(greetingServiceImpl);
	}

	/**
	 * Test method for {@link guru.springframework.sfgdi.controllers.ConstructorInjectedController#getGreeting()}.
	 */
	@Test
	void testGetGreeting() {
		System.out.println(constructorInjectedController.getGreeting());
	}

}
