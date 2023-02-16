/**
 * 
 */
package guru.springframework.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;

/**
 * @author Hoek0024 on 16 feb. 2023
 *
 */
@Configuration
public class PetServiceConfig {
	
	@Bean
	PetServiceFactory petServiceFactory() {
		return new PetServiceFactory();
	}

	@Profile({"dog", "default_pet"})
	@Bean
	PetService dogPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("dog");
	}
	
	@Profile({"cat"})
	@Bean
	PetService catPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("cat");
	}
}
