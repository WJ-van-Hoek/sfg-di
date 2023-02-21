/**
 * 
 */
package guru.springframework.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.sfgdi.datasource.FakeDataSource;

/**
 * @author Hoek0024 on 20 feb. 2023
 *
 */
@Configuration
public class PropertiesConfig {

	@Bean
	FakeDataSource fakeDataSource(SfgConfiguration sfgConfiguration) {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUsername(sfgConfiguration.getUsername());
		fakeDataSource.setPassword(sfgConfiguration.getPassword());
		fakeDataSource.setJdbcurl(sfgConfiguration.getJdbcurl());
		
		return fakeDataSource;
	}
}
