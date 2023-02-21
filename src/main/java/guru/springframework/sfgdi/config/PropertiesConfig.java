/**
 * 
 */
package guru.springframework.sfgdi.config;

import org.springframework.beans.factory.annotation.Value;
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
	FakeDataSource fakeDataSource(	@Value("${guru.username}") String username, 
									@Value("${guru.password}") String password, 
									@Value("${guru.jdbcurl}")String jdbcurl) {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUsername(username);
		fakeDataSource.setPassword(password);
		fakeDataSource.setJdbcurl(jdbcurl);
		
		return fakeDataSource;
	}
}
