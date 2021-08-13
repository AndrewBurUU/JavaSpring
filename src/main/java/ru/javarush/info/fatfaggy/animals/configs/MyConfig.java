package ru.javarush.info.fatfaggy.animals.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.javarush.info.fatfaggy.animals.entities.*;

@Configuration
public class MyConfig {
    //DI - dependency injection
    @Bean
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killer");
        return cat;
    }

    @Bean("dog")
    public Dog getDog() {
        return new Dog();
    }

    @Bean("parrot-kesha")
    public Parrot weNeedMoreParrots() {
        return new Parrot();
    }
}
