package ru.javarush.info.days;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.javarush.info.days.entities.WeekDay;
import ru.javarush.info.fatfaggy.animals.entities.Cat;
import ru.javarush.info.fatfaggy.animals.entities.Dog;
import ru.javarush.info.fatfaggy.animals.entities.Parrot;

public class Main {
     public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("ru.javarush.info.days.configs");
        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("It's " + weekDay.getWeekDayName() + " today!");

         Cat cat = context.getBean(Cat.class);
         Dog dog = (Dog) context.getBean("dog");
         Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

         System.out.println(cat.getName());
         System.out.println(dog.getName());
         System.out.println(parrot.getName());
     }
}
