package guru.springframework.didemo.controller;

import guru.springframework.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    @Autowired
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        System.out.println("Hello!!!");
        return greetingService.sayGreeting();
    }
}
