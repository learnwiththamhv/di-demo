package guru.springframework.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by thamhv on 10/9/2019.
 */

@Service
@Primary
@Profile("en")
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - from Primary Greeting service";
    }
}
