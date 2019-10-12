package guru.springframework.didemo.service;

/**
 * Created by thamhv on 10/9/2019.
 */

//@Service
//@Primary
//@Profile({"en","default"})
public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
