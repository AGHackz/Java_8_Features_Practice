package com.ankit.dev;

import java.util.Arrays;
import java.util.List;

public class AfterJava8 {
    
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
            new Person("Ankit", 24),
            new Person("Jayendra", 24),
            new Person("Harsh", 28)
        );

        Person result1 = persons.stream()                                           // convert list to stream
                                .filter(x -> (x.getName()).equals("Jayendra"))      // find name with "Jayendra"
                                .findAny()                                          // if 'findAny' then return found
                                .orElse(null);                                      // else return null

        System.out.println(result1);

        Person result2 = persons.stream()
                                .filter(x -> (x.getName()).equals("Sandeep"))
                                .findAny()
                                .orElse(null);

        System.out.println(result2); 
    }

}