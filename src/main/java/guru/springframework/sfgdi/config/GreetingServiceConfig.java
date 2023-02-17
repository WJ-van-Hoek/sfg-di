/**
 * 
 */
package guru.springframework.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.I18nEnglishGreetingService;
import guru.springframework.sfgdi.services.I18nSpanishGreetingService;

/**
 * @author Hoek0024 on 16 feb. 2023
 *
 */
@Configuration
public class GreetingServiceConfig {
	@Profile({"ES", "default_lang"})
	@Bean(name = "i18nService")
	GreetingService i18nSpanishGreetingService() {
		return new I18nSpanishGreetingService();
	}
	
	@Profile("EN")
	@Bean(name = "i18nService")
	GreetingService i18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepositoryImpl) {
		return new I18nEnglishGreetingService(englishGreetingRepositoryImpl);
	}
}
