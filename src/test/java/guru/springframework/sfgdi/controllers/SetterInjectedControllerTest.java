/**
 * 
 */
package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.ConstructorGreetingService;

/**
 * @author Hoek0024
 *
 */
class SetterInjectedControllerTest {
	
	SetterInjectedController controller;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
	}

	/**
	 * Test method for {@link guru.springframework.sfgdi.controllers.SetterInjectedController#getGreeting()}.
	 */
	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
