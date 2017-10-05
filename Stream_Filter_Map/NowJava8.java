package com.ankit.dev;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class NowJava8 {
    
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
            new Person("Ankit", 24),
            new Person("Jayendra", 24),
            new Person("Harsh", 28)
        );

        String name = persons.stream()
                            .filter(x -> "Jayendra".equals(x.getName()))
                            .map(Person::getName)
                            .findAny()
                            .orElse("");

        System.out.println("name: " + name);

        List<String> collect = persons.stream()
                                        .map(Person::getName)
                                        .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }

}