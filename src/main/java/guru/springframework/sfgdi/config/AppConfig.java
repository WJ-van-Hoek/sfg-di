/**
 * 
 */
package guru.springframework.sfgdi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Hoek0024 on 15 feb. 2023
 *
 */

@Configuration
@Import({RepositoryConfig.class, DiServiceDemoConfig.class, GreetingServiceConfig.class, PetServiceConfig.class, PropertiesConfig.class})
public class AppConfig {

}
