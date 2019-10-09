package guru.springframework.didemo.service;

import org.springframework.stereotype.Service;

/**
 * Created by thamhv on 10/9/2019.
 */

@Service
public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello - I was injected from the constructor !!!";
    }
}
