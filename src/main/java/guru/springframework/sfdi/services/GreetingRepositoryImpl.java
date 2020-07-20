package guru.springframework.sfdi.services;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getGermanGreeting() {
        return "Hallo Welt";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola Mundo";
    }

    @Override
    public String getEnglishGreeting() {
        return "Hello World";
    }
}
