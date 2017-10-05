package com.ankit.dev;

import java.util.Arrays;
import java.util.List;

public class AfterJava8_MultipleCondition {
    
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
            new Person("Ankit", 24),
            new Person("Jayendra", 24),
            new Person("Harsh", 28)
        );

        Person result1 = persons.stream()
                                .filter((x) -> "Jayendra".equals(x.getName()) && x.getAge() == 24)
                                .findAny()
                                .orElse(null);

        System.out.println(result1);

        // second way
        Person result2 = persons.stream()
                                .filter((x) -> {
                                    if("Ankit".equals(x.getName()) && x.getAge() == 24) {
                                        return true;
                                    }
                                    return false;
                                }).findAny()
                                .orElse(null);

        System.out.println(result2);
    }

}