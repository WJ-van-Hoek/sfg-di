package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;

/**
 * Created by jt on 12/27/19.
 */
public class I18nEnglishGreetingService implements GreetingService {

	private final EnglishGreetingRepository englishGreetingRepositoryImpl;

	/**
	 * @param englishGreetingRepositoryImpl
	 */
	public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepositoryImpl) {
		this.englishGreetingRepositoryImpl = englishGreetingRepositoryImpl;
	}

	@Override
	public String sayGreeting() {
		return englishGreetingRepositoryImpl.sayGreeting();
	}
}
