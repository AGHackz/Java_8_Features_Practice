package com.ankit.dev;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AfterJava8 {
    
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Kotlin", "Java", "Android", "Swift", "iOS");                 // creates a list from these items
        List<String> filteredList = list.stream()                                                       // converts list to stream
                                        .filter(item -> !item.equals("Java"))                           // excluding "Java" from stream
                                        .collect(Collectors.toList());                                  // collect items from stream to list 

        filteredList.forEach(item -> System.out.println(item));                                         // print each item from the filteredList
    }

}