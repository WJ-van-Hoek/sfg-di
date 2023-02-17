/**
 * 
 */
package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Hoek0024 on 17 feb. 2023
 *
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {
	
	public PrototypeBean() {
		System.out.println("Creating a Prototype bean!!!!!!!");
	}
	
	public String getMyScope() {
		return "I'm a Prototype";
	}
}