package guru.springframework.didemo.service;

/**
 * Created by thamhv on 10/9/2019.
 */
//@Service
//@Primary
//@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {
    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
