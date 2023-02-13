/**
 * 
 */
package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Hoek0024
 *
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World - Property";
	}

}
