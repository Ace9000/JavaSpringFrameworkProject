package guru.springframework.sfg.di.services;

import org.springframework.stereotype.Service;

public class SetterInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - Setter";
    }

}
