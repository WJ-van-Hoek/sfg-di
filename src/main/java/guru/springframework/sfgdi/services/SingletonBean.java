/**
 * 
 */
package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * @author Hoek0024 on 17 feb. 2023
 *
 */
@Component
public class SingletonBean {
	
	public SingletonBean() {
		System.out.println("Creating a Singleton bean");
	}
	
	public String getMyScope() {
		return "I'm a Singleton";
	}
}
