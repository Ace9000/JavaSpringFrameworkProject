package guru.springframework.sfg.di.controllers;

import guru.springframework.sfg.di.services.ConstructorGreetingService;
import guru.springframework.sfg.di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello() {

        return greetingService.sayGreeting();
    }

    public static class PropertyInjectedController {
        public ConstructorGreetingService greetingService;


    }
}


