/**
 * 
 */
package guru.springframework.sfgdi.repositories;

/**
 * @author Hoek0024 on 16 feb. 2023
 *
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
	
	@Override
	public String sayGreeting() {
		return "Hello World - EN";
	}

}
