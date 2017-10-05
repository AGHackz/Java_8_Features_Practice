package com.ankit.dev;

import java.util.Arrays;
import java.util.List;

public class BeforeJava8 {
    
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
            new Person("Ankit", 24),
            new Person("Jayendra", 24),
            new Person("Harsh", 28)
        );

        Person result = getStudentByName(persons, "Jayendra");
        System.out.println(result);
    }

    private static Person getStudentByName(List<Person> persons, String name) {
        Person person = null;
        for (Person temp : persons) {
            if(temp.getName() == name) {
                person = temp;
            }
        }
        return person;
    }
}