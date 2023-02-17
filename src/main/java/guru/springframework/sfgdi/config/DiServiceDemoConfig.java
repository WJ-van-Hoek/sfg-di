/**
 * 
 */
package guru.springframework.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;

/**
 * @author Hoek0024 on 16 feb. 2023
 *
 */
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class DiServiceDemoConfig {
	@Primary //Primary greeting service without annotated bean name
	@Bean
	GreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	}
	
	@Bean
	GreetingService propertyInjectedGreetingService() {
		return new PropertyInjectedGreetingService();
	}
	
	@Bean
	GreetingService setterInjectedGreetingService() {
		return new SetterInjectedGreetingService();
	}
}
