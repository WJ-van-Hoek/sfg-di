/**
 * 
 */
package guru.springframework.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.I18nEnglishGreetingService;
import guru.springframework.sfgdi.services.I18nSpanishGreetingService;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;

/**
 * @author Hoek0024 on 15 feb. 2023
 *
 */
@Configuration
public class GreetingServiceConfig {
	
	@Profile({"ES"})
	@Bean(name = "i18nService")
	I18nSpanishGreetingService i18nSpanishService() {
		return new I18nSpanishGreetingService();
	}
	
//	@Profile("EN")
	@Bean(name = "i18nService")
	I18nEnglishGreetingService i18nEnglishService() {
		return new I18nEnglishGreetingService();
	}
	
	@Primary
	@Bean
	PrimaryGreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	}
	
	@Bean
	ConstructorGreetingService constructorGreetingService() {
		return new ConstructorGreetingService();
	}
	
	@Bean
	PropertyInjectedGreetingService propertyInjectedGreetingService() {
		return new PropertyInjectedGreetingService();
	}
	
	@Bean
	SetterInjectedGreetingService setterInjectedGreetingService() {
		return new SetterInjectedGreetingService();
	}

}
