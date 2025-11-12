package org.example;

import org.example.entities.Cat;
import org.example.entities.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.entities");
        Cat cat = context.getBean(Cat.class);
        Dog dog = context.getBean(Dog.class);

        cat.setName("Angela");
        dog.setName("Bob");

        System.out.println(cat.voice());
        System.out.println(cat.voice());
        System.out.println(dog.voice());
        System.out.println(cat.getName());
        System.out.println(dog.getName());
    }
}