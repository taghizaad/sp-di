package guru.springframework.sfdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World -- Setter";
    }
}
